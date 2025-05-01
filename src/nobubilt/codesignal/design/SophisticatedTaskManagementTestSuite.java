package nobubilt.codesignal.design;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class SophisticatedTaskManagementTestSuite {

	 private SophisticatedTaskManagement system;

	    @BeforeEach
	    public void setUp() {
	        system = new SophisticatedTaskManagement();
	    }

	    @Test
	    public void testAddAndRemoveTask() {
	        assertTrue(system.addTask("001", "Implement login feature"));
	        assertTrue(system.removeTask("001"));
	    }

	    @Test
	    public void testAddCategorizeAndChangeCategory() {
	        assertTrue(system.addTask("002", "Design homepage"));
	        assertTrue(system.categorizeTask("002", "design"));
	        assertTrue(system.changeTaskCategory("002", "frontend"));
	    }

	    @Test
	    public void testAddSetPriorityAndFetchByPriority() {
	        assertTrue(system.addTask("003", "Setup database"));
	        assertTrue(system.addTask("004", "Deploy application"));
	        assertTrue(system.setTaskPriority("003", 1));
	        assertTrue(system.setTaskPriority("004", 2));
	        List<String> tasks = system.getTasksByPriority(1);
	        assertTrue(tasks.contains("003"));
	        assertTrue(tasks.contains("004"));
	    }

	    @Test
	    public void testUndoLastOperation() {
	        assertTrue(system.addTask("003", "Setup database"));
	        assertTrue(system.setTaskPriority("003", 1));
	        assertTrue(system.undoLastOperation());
	    }

	    @Test
	    public void testEditTaskAndUndo() {
	        assertTrue(system.addTask("002", "Design homepage"));
	        assertTrue(system.editTask("002", "Design authentication flow"));
	        assertTrue(system.undoLastOperation());
	    }

	    @Test
	    public void testFetchTasksByCategory() {
	        assertTrue(system.addTask("002", "Design homepage"));
	        assertTrue(system.categorizeTask("002", "frontend"));
	        List<String> tasks = system.getTasksByCategory("frontend");
	        assertTrue(tasks.contains("002"));
	    }

	    @Test
	    public void testUndoAddTask() {
	        assertTrue(system.addTask("005", "Add undo feature"));
	        assertTrue(system.undoLastOperation());
	        assertFalse(system.getTasksByCategory("undo").contains("005"));
	    }

	    @Test
	    public void testUndoEditTask() {
	        system.addTask("006", "Original description");
	        assertTrue(system.editTask("006", "Edited description"));
	        assertTrue(system.undoLastOperation());
	        assertEquals("Original description", system.getTask("006").description);
	    }

	    @Test
	    public void testUndoRemoveTask() {
	        system.addTask("007", "Task to be removed");
	        assertTrue(system.removeTask("007"));
	        assertTrue(system.undoLastOperation());
	        assertTrue(system.getTasksByCategory(null).contains("007"));
	    }

	    @Test
	    public void testUndoSetTaskPriority() {
	        system.addTask("008", "Task with priority");
	        system.setTaskPriority("008", 5);
	        assertTrue(system.undoLastOperation());
	        assertNull(system.getTask("008").priority);
	    }

	    @Test
	    public void testUndoCategorizeTask() {
	        system.addTask("009", "Task to categorize");
	        system.categorizeTask("009", "initial");
	        assertTrue(system.changeTaskCategory("009", "final"));
	        assertTrue(system.undoLastOperation());
	        assertEquals("initial", system.getTask("009").category);
	    }

	    @Test
	    public void testUndoRemoveTaskPreservesDetails() {
	        system.addTask("010", "Task with details");
	        system.setTaskPriority("010", 3);
	        system.categorizeTask("010", "development");
	        assertTrue(system.removeTask("010"));
	        assertTrue(system.undoLastOperation());
	        assertTrue(system.getTasksByCategory("development").contains("010"));
	    }
}
