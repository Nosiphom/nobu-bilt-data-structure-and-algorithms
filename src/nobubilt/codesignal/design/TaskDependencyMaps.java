package nobubilt.codesignal.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskDependencyMaps {
/**
 * In this task, you are tasked with enhancing an existing task-tracking system by 
 * introducing new features for managing task dependencies. The system works with tasks, 
 * each having unique attributes: task_id, title, description, status, and priority.

The existing system supports the following operations:

boolean addTask(String taskId, String title, String description, String status, 
int priority): Adds a new task to the system.
boolean updateTask(String taskId, String title, String description, String status, 
Integer priority): Updates an existing task's attributes.
boolean removeTask(String taskId): Removes a task from the system.
List<String> getTasksByStatus(String status): Returns a list of task IDs filtered by status.
List<String> getTasksByPriority(int priority): Returns a list of task IDs filtered by priority.
The upgraded system should support additional operations. These operations include:

boolean addDependency(String taskId, String dependencyTaskId): Adds a dependency for a 
task taskId on another task dependencyTaskId. This method ensures that circular dependencies 
are not allowed to prevent tasks from being indefinitely blocked by each other.
boolean removeDependency(String taskId, String dependencyTaskId): Removes an existing 
dependency of a task on another task.
List<String> getDependentTasks(String taskId): Retrieves a list of tasks that are dependent 
on a given task.
Dependencies are described as follows: a task's status can automatically change to 'Open' 
once all tasks it depends on have been completed ('Closed'). Note, however, that when a 
task is removed from the system, the statuses of tasks that depend on the removed task are 
not automatically updated based on the removal action. Instead, automatic status updates 
occur in response to the completion of dependency tasks. This may necessitate manual status 
adjustments for some tasks when their dependency tasks are removed instead of completed.

When removeTask is called on a task with dependencies, it not only removes that task and 
its attributes but also updates the dependencies and dependents data structures to remove 
any references to the deleted task. However, the status of tasks that were dependent on the 
removed task is not automatically adjusted and may require manual intervention.
 */
	
    private Map<String, Boolean> tasks;
    private Map<String, Map<String, Object>> taskAttributes;
    private Map<String, Set<String>> dependencyMap;
    private Map<String, Set<String>> dependentsMap;


    public TaskDependencyMaps() {
        tasks = new HashMap<>();
        taskAttributes = new HashMap<>();
        dependencyMap = new HashMap<>();
        dependentsMap = new HashMap<>();
    }

    public boolean addDependency(String taskId, String dependencyTaskId)
    {
        if(tasks.containsKey(taskId) && tasks.containsKey(dependencyTaskId) && tasks.get(taskId) && !dependencyMap.get(taskId).contains(dependencyTaskId) && (dependencyMap.get(dependencyTaskId) == null || !dependencyMap.get(dependencyTaskId).contains(taskId)))
        {
            dependencyMap.get(taskId).add(dependencyTaskId);
            dependentsMap.get(dependencyTaskId).add(taskId);
            return true;
        }
        return false;
    }
    
    public boolean removeDependency(String taskId, String dependencyTaskId)
    {
        if(tasks.containsKey(taskId) && dependencyMap.get(taskId).contains(dependencyTaskId))
        {
            dependencyMap.get(taskId).remove(dependencyTaskId);
            
            if(dependentsMap.containsKey(dependencyTaskId))
            {
                dependentsMap.get(dependencyTaskId).remove(taskId);
            }
            
            return true;
        }
        return false;
    }
    
    public List<String> getDependentTasks(String taskId)
    {
        List<String> outcome = new ArrayList<>();
        if(tasks.containsKey(taskId) && tasks.get(taskId) && dependentsMap.containsKey(taskId))
        {   
            outcome.addAll(dependentsMap.get(taskId));     
        }
        return outcome;
    }
    
    public boolean addTask(String taskId, String title, String description, String status, int priority) {
        if (tasks.containsKey(taskId)) {
            return false;
        }
        tasks.put(taskId, true);
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("title", title);
        attributes.put("description", description);
        attributes.put("status", status);
        attributes.put("priority", priority);
        taskAttributes.put(taskId, attributes);
        dependencyMap.put(taskId, new HashSet<>());
        dependentsMap.put(taskId, new HashSet<>());
        return true;
    }

    public boolean updateTask(String taskId, String title, String description, String status, Integer priority) {
        if (!tasks.containsKey(taskId)) {
            return false;
        }
        Map<String, Object> attributes = taskAttributes.get(taskId);
        if (title != null) {
            attributes.put("title", title);
        }
        if (description != null) {
            attributes.put("description", description);
        }
        if (status != null) {
            attributes.put("status", status);
            if(status.equals("Closed"))
            {
               automaticallyOpenDependencies(taskId);               
            }
        }
        if (priority != null) {
            attributes.put("priority", priority);
        }
        return true;
    }

    public void automaticallyOpenDependencies(String taskId)
    {
        for(String key : dependencyMap.keySet())
        {
            if(dependencyMap.get(key).contains(taskId))
            {
                String title = null;
                String description = null;
                Integer priority = 0;
                Map<String, Object> attributes = taskAttributes.get(key);
                for(String keyWord : attributes.keySet())
                {
                    if(keyWord.equals("title"))
                    {
                        title = (String)attributes.get(keyWord);
                    }
                    else if(keyWord.equals("description"))
                    {
                        description = (String)attributes.get(keyWord);
                    }
                    else if(keyWord.equals("priority"))
                    {
                        priority = (Integer)attributes.get(keyWord);
                    }
                }
                updateTask(key, title, description, "Open",  priority);
                continue;
            }
        }
    }
    public boolean removeTask(String taskId) {
        if (tasks.containsKey(taskId)) {
            tasks.remove(taskId);
            taskAttributes.remove(taskId);
            dependencyMap.remove(taskId);
            removeReference(taskId);
            return true;
        }
        return false;
    }
    
    public void removeReference(String taskId)
    {
        for(String key : dependencyMap.keySet())
        {
             dependencyMap.get(key).remove(taskId);
        }
        for(String key : dependentsMap.keySet())
        {
            dependentsMap.get(key).remove(taskId);    
        }
    }

    public List<String> getTasksByStatus(String status) {
        List<String> taskIds = new ArrayList<>();
        for (Map.Entry<String, Map<String, Object>> entry : taskAttributes.entrySet()) {
            if (status.equals(entry.getValue().get("status"))) {
                taskIds.add(entry.getKey());
            }
        }
        Collections.sort(taskIds);
        return taskIds;
    }

    public List<String> getTasksByPriority(int priority) {
        List<String> taskIds = new ArrayList<>();
        for (Map.Entry<String, Map<String, Object>> entry : taskAttributes.entrySet()) {
            if (priority == (int) entry.getValue().get("priority")) {
                taskIds.add(entry.getKey());
            }
        }
        Collections.sort(taskIds);
        return taskIds;
    }
}
