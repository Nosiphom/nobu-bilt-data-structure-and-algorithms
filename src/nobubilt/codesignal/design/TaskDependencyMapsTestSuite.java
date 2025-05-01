package nobubilt.codesignal.design;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TaskDependencyMapsTestSuite {
	TaskDependencyMaps solution;
	 @BeforeEach
	    public void setUp() {
	        solution = new TaskDependencyMaps();
	    }

	    @Test
	    public void testAddTask() {
	        assertTrue(solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1));
	        assertTrue(solution.addTask("2", "Task 2", "Description for Task 2", "Closed", 2));
	    }

	    @Test
	    public void testAddDependencyAndDependentTasks() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Closed", 2);
	        assertTrue(solution.addDependency("1", "2"));
	        assertEquals(List.of("1"), solution.getDependentTasks("2"));
	    }

	    @Test
	    public void testUpdateTaskAndGetTasksByStatus() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Open", 2);
	        assertTrue(solution.updateTask("2", null, null, "Closed", null));
	        assertTrue(solution.updateTask("1", null, null, "Closed", null));
	        assertEquals(List.of(), solution.getTasksByStatus("Open"));
	        assertEquals(List.of("1", "2"), solution.getTasksByStatus("Closed"));
	    }

	    @Test
	    public void testRemoveTask() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Closed", 2);
	        assertTrue(solution.removeTask("1"));
	        assertTrue(solution.removeTask("2"));
	        assertEquals(List.of(), solution.getTasksByStatus("Open"));
	        assertEquals(List.of(), solution.getTasksByStatus("Closed"));
	    }

	    @Test
	    public void testDependentTaskAutoOpen() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Closed", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Open", 2);
	        solution.addTask("3", "Task 3", "Description for Task 3", "Pending", 2);
	        solution.addDependency("2", "1");
	        solution.addDependency("3", "2");
	        assertTrue(solution.updateTask("1", null, null, "Closed", null));
	        assertTrue(solution.updateTask("2", null, null, "Closed", null));
	        assertEquals(List.of("3"), solution.getTasksByStatus("Open"));
	    }

	    @Test
	    public void testCircularDependencyFailure() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Closed", 2);
	        assertTrue(solution.addDependency("1", "2"));
	        assertFalse(solution.addDependency("2", "1"));
	    }

	    @Test
	    public void testRemoveWithDependency() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Closed", 2);
	        solution.addDependency("1", "2");
	        assertTrue(solution.removeTask("2"));
	        assertEquals(List.of(), solution.getDependentTasks("2"));
	    }
	    
	    @Test
	    public void testRemoveTaskWithDependents() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Closed", 2);
	        solution.addTask("3", "Task 3", "Description for Task 3", "Open", 3);
	    
	        // Add dependencies
	        solution.addDependency("1", "2"); // Task 1 depends on Task 2
	        solution.addDependency("3", "1"); // Task 3 depends on Task 1
	    
	        // Remove task with dependencies and check dependent tasks
	        assertTrue(solution.removeTask("1"));
	        assertEquals(List.of(), solution.getDependentTasks("2")); // Task 1 should no longer be dependent on Task 2
	        assertEquals(List.of(), solution.getDependentTasks("3")); // Task 3 should no longer be dependent on Task 1
	        assertFalse(solution.addDependency("3", "1")); // Adding the dependency again should fail, since Task 1 is removed
	    }

	    @Test
	    public void testRemoveDependencyUpdatesDependents() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Closed", 2);
	       solution.addDependency("1", "2");

	        // Ensure dependency is present
	        assertEquals(List.of("1"), solution.getDependentTasks("2"));

	        // Remove dependency and verify dependents
	        assertTrue(solution.removeDependency("1", "2"));
	        assertEquals(List.of(), solution.getDependentTasks("2"));  // Dependents should be updated
	    }

	    @Test
	    public void testRemoveTaskCleansUpDependenciesAndDependents() {
	        solution.addTask("1", "Task 1", "Description for Task 1", "Open", 1);
	        solution.addTask("2", "Task 2", "Description for Task 2", "Closed", 2);
	        solution.addTask("3", "Task 3", "Description for Task 3", "Pending", 3);

	        // Add dependencies
	        solution.addDependency("2", "1"); // Task 2 depends on Task 1
	        solution.addDependency("3", "2"); // Task 3 depends on Task 2

	        // Ensure dependencies and dependents are correct
	        assertEquals(List.of("2"), solution.getDependentTasks("1"));
	        assertEquals(List.of("3"), solution.getDependentTasks("2"));

	        // Remove task and verify cleanup
	        assertTrue(solution.removeTask("2"));
	    
	        // Verify task 2's dependencies are removed from task 1
	        assertEquals(List.of(), solution.getDependentTasks("1"));  // Task 1 should no longer have dependents
	    
	        // Verify task 2's presence is removed from dependencies of task 3
	        assertEquals(List.of(), solution.getDependentTasks("3"));  // Task 3 should no longer have dependents due to Task 2's removal
	    }
}
