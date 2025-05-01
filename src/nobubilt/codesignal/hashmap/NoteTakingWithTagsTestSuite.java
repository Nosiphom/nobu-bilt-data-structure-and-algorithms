package nobubilt.codesignal.hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class NoteTakingWithTagsTestSuite {
	 @Test
	    public void testAddAndUndoVersionWithTags() {
		 NoteTakingWithTags app = new NoteTakingWithTags();
	        String noteId = app.addNote("First Note", "This is the first note.");
	        app.addTag(noteId, "Initial");
	        app.addVersion(noteId, "First Note Updated", "This is the updated note.", Arrays.asList("Updated", "Important"));
	        Map<String, String> result = app.getNote(noteId);
	        assertEquals(result.get("title"), "First Note Updated");
	        assertEquals(result.get("content"), "This is the updated note.");
	        assertEquals(app.getNotesByTag("Important").size(), 1);
	        
	        app.undoVersion(noteId);
	        result = app.getNote(noteId);
	        assertEquals(result.get("title"), "First Note");
	        assertEquals(result.get("content"), "This is the first note.");
	        assertEquals(app.getNotesByTag("Initial").size(), 1);
	    }

	    @Test
	    public void testAddTagAndGetByTag() {
	        NoteTakingWithTags app = new NoteTakingWithTags();
	        String noteId = app.addNote("First Note", "This is the first note.");
	        app.addTag(noteId, "Important");
	        List<Map<String, String>> result = app.getNotesByTag("Important");
	        assertTrue(result.size() == 1);
	        assertEquals(result.get(0).get("title"), "First Note");
	    }

	    @Test
	    public void testShareAndGetSharedNotes() {
	        NoteTakingWithTags app = new NoteTakingWithTags();
	        String noteId = app.addNote("First Note", "This is the first note.");
	        app.shareNote(noteId, "user123", "read");
	        List<Map<String, String>> result = app.getSharedNotes("user123");
	        assertEquals(result.size(), 1);
	        assertEquals(result.get(0).get("title"), "First Note");
	        assertEquals(result.get(0).get("accessLevel"), "read");
	    }

	    @Test
	    public void testMultipleVersionsAndUndoToInitialWithTags() {
	        NoteTakingWithTags app = new NoteTakingWithTags();
	        String noteId = app.addNote("First Note", "This is the first note.");
	        app.addTag(noteId, "Initial");
	        app.addVersion(noteId, "Second Update", "Second update to the note.", Arrays.asList("SecondTag"));
	        app.addVersion(noteId, "Third Update", "Third update to the note.", Arrays.asList("ThirdTag"));
	        app.undoVersion(noteId);
	        app.undoVersion(noteId);
	        Map<String, String> result = app.getNote(noteId);
	        assertEquals(result.get("title"), "First Note");
	        assertEquals(result.get("content"), "This is the first note.");
	        assertEquals(app.getNotesByTag("Initial").size(), 1);
	    }
}
