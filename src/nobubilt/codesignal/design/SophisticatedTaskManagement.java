package nobubilt.codesignal.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class SophisticatedTaskManagement {
/**
 * In this task, you will develop a sophisticated task management system with a focus 
 * on managing the lifecycle of tasks, including their creation, modification, and deletion. 
 * Special emphasis will be on extending the system with an undo feature and facilitating 
 * category changes for tasks.

The initial version of the task management system supports:

boolean addTask(String taskId, String description): Adds a new task with a unique taskId 
and description. Returns true if the task is added successfully and false if taskId is 
already in use.
boolean editTask(String taskId, String newDescription): Edits an existing task's description 
to newDescription. Returns true if successful, false if taskId is not found.
boolean removeTask(String taskId): Removes the task with the specified taskId. Returns true 
if successful, false if taskId is not found.
boolean setTaskPriority(String taskId, int priority): Sets the priority of a task. Returns 
true if successful, false if taskId is not found.
boolean categorizeTask(String taskId, String category): Categorizes a task under a specified 
category. Returns true if successful, false if taskId is not found.
List<String> getTasksByPriority(int minPriority): Returns a list of task IDs that have a 
priority greater than or equal to minPriority.
List<String> getTasksByCategory(String category): Returns a list of task IDs that belong to 
a specified category.
You need to add the following functionalities:

boolean undoLastOperation(): Undoes the most recent operation performed on the tasks. 
Returns true if an operation was undone, false otherwise.
boolean changeTaskCategory(String taskId, String newCategory): Changes the category of an
 existing task to newCategory. Returns true if the category was changed successfully and 
 false if taskId is not found.
 */
	
	
	  private Map<String, Task> tasks;
	    private Stack<TaskHistory> taskHistoryStack;

	    public SophisticatedTaskManagement() {
	        this.tasks = new HashMap<>();
	        this.taskHistoryStack = new Stack<>();
	    }
	    
	    public boolean undoLastOperation()
	    {
	        if(!taskHistoryStack.isEmpty())
	        {
	            String topAction = taskHistoryStack.peek().action;
	            switch(topAction)
	            {
	                case "Remove": {
	                    TaskHistory topTaskHistory = taskHistoryStack.pop();
	                    tasks.put(topTaskHistory.taskId, new Task(topTaskHistory.description, topTaskHistory.priority, topTaskHistory.category));
	                    break;
	                }
	                case "Add":
	                {
	                    TaskHistory topTaskHistory = taskHistoryStack.pop();
	                    return removeTask(topTaskHistory.taskId);
	                }
	                case "Edit":
	                {
	                    taskHistoryStack.pop();
	                    if(!taskHistoryStack.isEmpty())
	                    {
	                    TaskHistory topTaskHistory = taskHistoryStack.peek();
	                    return editTask(topTaskHistory.taskId,  topTaskHistory.description);
	                        
	                    }
	                }
	                case "SetPriority":
	                {
	                    taskHistoryStack.pop();
	                     if(!taskHistoryStack.isEmpty())
	                    {
	                    TaskHistory topTaskHistory = taskHistoryStack.peek();
	                    Integer priorityValue = null == topTaskHistory.priority ? null : topTaskHistory.priority; 
	                     tasks.get(topTaskHistory.taskId).priority = priorityValue;
	                     break;
	                        
	                    }
	                }
	                case "CategorizeTask":
	                {
	                    taskHistoryStack.pop();
	                     if(!taskHistoryStack.isEmpty())
	                    {
	                    TaskHistory topTaskHistory = taskHistoryStack.peek();
	                    return categorizeTask(topTaskHistory.taskId,  topTaskHistory.category);              
	                    }
	          
	                }
	                case "ChangeCategorizeTask":
	                 {
	                    taskHistoryStack.pop();
	                     if(!taskHistoryStack.isEmpty())
	                    {
	                    TaskHistory topTaskHistory = taskHistoryStack.peek();
	                    return changeTaskCategory(topTaskHistory.taskId,  topTaskHistory.category);              
	                    }
	          
	                 } 
	            }
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean changeTaskCategory(String taskId, String newCategory)
	    {
	         if (!tasks.containsKey(taskId)) {
	            return false;
	        }
	        Task task = tasks.get(taskId);
	        task.category = newCategory;
	        taskHistoryStack.push(new TaskHistory(task.description, task.priority, task.category, "ChangeCategorizeTask", taskId));
	        
	        return true;
	    }

	    public boolean addTask(String taskId, String description) {
	        if (tasks.containsKey(taskId)) {
	            return false;
	        }
	        tasks.put(taskId, new Task(description, null, null));
	        taskHistoryStack.push(new TaskHistory(description, null, null, "Add", taskId));
	        return true;
	    }

	    public Task getTask(String taskId) {
	        return tasks.get(taskId);
	    }

	    public boolean editTask(String taskId, String newDescription) {
	        if (!tasks.containsKey(taskId)) {
	            return false;
	        }
	        Task task = tasks.get(taskId);
	        task.description = newDescription;
	        taskHistoryStack.push(new TaskHistory(task.description, task.priority, task.category, "Edit", taskId));
	        return true;
	    }

	    public boolean removeTask(String taskId) {
	        if (!tasks.containsKey(taskId)) {
	            return false;
	        }
	        taskHistoryStack.push(new TaskHistory(tasks.get(taskId).description, tasks.get(taskId).priority, tasks.get(taskId).category, "Remove", taskId)); 
	        tasks.remove(taskId);
	        return true;
	    }

	    public boolean setTaskPriority(String taskId, int priority) {
	        if (!tasks.containsKey(taskId)) {
	            return false;
	        }
	        Task task = tasks.get(taskId);
	        task.priority = priority;
	        taskHistoryStack.push(new TaskHistory(task.description, task.priority, task.category, "SetPriority", taskId));
	        return true;
	    }

	    public boolean categorizeTask(String taskId, String category) {
	        if (!tasks.containsKey(taskId)) {
	            return false;
	        }
	        Task task = tasks.get(taskId);
	        task.category = category;
	        taskHistoryStack.push(new TaskHistory(task.description, task.priority, task.category, "CategorizeTask", taskId));
	        
	        return true;
	    }

	    public List<String> getTasksByPriority(int minPriority) {
	        List<String> result = new ArrayList<>();
	        for (Map.Entry<String, Task> entry : tasks.entrySet()) {
	            Task task = entry.getValue();
	            if (task.priority != null && task.priority >= minPriority) {
	                result.add(entry.getKey());
	            }
	        }
	        return result;
	    }

	    public List<String> getTasksByCategory(String category) {
	        List<String> result = new ArrayList<>();
	        
	        for (Map.Entry<String, Task> entry : tasks.entrySet()) {
	            Task task = entry.getValue();
	            if(category == null && task.category == null){
	                result.add(entry.getKey());
	            }
	            else if (category.equals(task.category)) {
	                result.add(entry.getKey());
	            }
	        }
	        return result;
	    }

	    public class Task {
	        String description;
	        Integer priority;
	        String category;

	        Task(String description, Integer priority, String category) {
	            this.description = description;
	            this.priority = priority;
	            this.category = category;
	        }
	    }
	    
	    public class TaskHistory
	    {
	        String action;
	        String taskId;
	        String description;
	        Integer priority;
	        String category;
	        TaskHistory(String description, Integer priority, String category, String action, String taskId)
	        {
	            this.description = description;
	            this.priority = priority;
	            this.category = category;
	            this.action = action;
	            this.taskId = taskId;        
	        }
	    }
}
