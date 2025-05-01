package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;

public class NoteTakingWithTags {
/**
 * In this task, your objective is to develop a note-taking application from the 
 * ground up, incorporating key functionalities such as creating and retrieving
 *  notes, tagging notes, sharing them among users with varying access levels, 
 *  as well as introducing versioning for notes and an undo functionality to 
 *  revert notes to their previous versions.

The application should support the following functionalities:

String addNote(String title, String content) — Creates a new note with the 
specified title and content, and returns a unique identifier for the note.
Map<String, String> getNote(String noteId) — Retrieves a note by its unique 
identifier. Returns a map containing the title and content of the note.
boolean addTag(String noteId, String tag) — Associates a tag with a specific note. 
Returns True if the operation is successful and False otherwise.
List<Map<String, String>> getNotesByTag(String tag) — Returns a list of all notes 
associated with a specified tag. Each note is represented as a map containing its 
identifier, title, and content.
boolean shareNote(String noteId, String userId, String accessLevel) — Shares a note 
with another user by specifying a unique identifier, the user's identifier, and the 
access level (read or write). The access level must be included in the map of shares. 
Returns True if the operation is successful and False otherwise.
List<Map<String, String>> getSharedNotes(String userId) — Retrieves all notes shared 
with a specific user. Returns a list of maps, each containing the note's identifier, 
title, content, and the user's access level.
New Features to Implement:

boolean addVersion(String noteId, String title, String content, List<String> tags) — 
This method introduces a new version of the note by updating its title and/or content. 
If the operation is successful, all previous versions of the note should be preserved,
 and the method will return True. It returns False if either the note does not exist 
 or no modifications were detected.
boolean undoVersion(String noteId) — This method reverts a note to its immediate 
previous version. It returns True if the undo operation is successful. If the note 
is already in its initial version or does not exist, it returns False.
Ensure backward compatibility and maintain the integrity of the sharing functionality 
with the entire version history of each note.
 */
	
	 private Map<String, Note> notes;
	    private Map<String, List<String>> tags;
	    private Map<String, Map<String, Map<String, String>>> shares;
	    private Map<String, Stack<Note>> versions;

	    public NoteTakingWithTags() {
	        notes = new HashMap<>();
	        tags = new HashMap<>();
	        shares = new HashMap<>();
	        versions = new HashMap<>();
	    }
	    
	    public String generateUniqueId()
	    {
	        return UUID.randomUUID().toString();
	    }

	    public String addNote(String title, String content) {
	        // TODO: implement solution
	        String noteId = generateUniqueId();
	        notes.put(noteId, new Note(noteId, title, content, new ArrayList<>()));
	        versions.put(noteId, new Stack<>());
	        
	        return noteId;
	    }

	    public Map<String, String> getNote(String noteId) {
	        // TODO: implement solution
	        if(notes.containsKey(noteId))
	        {
	            Map<String, String> outcome = new HashMap<>();
	            outcome.put("title", notes.get(noteId).title);
	            outcome.put("content", notes.get(noteId).content);
	            return outcome;
	        }
	        return null;
	    }

	    public boolean addTag(String noteId, String tag) {
	        // TODO: implement solution
	        if(notes.containsKey(noteId))
	        {
	            notes.get(noteId).tags.add(tag);
	            List<String> currentTagNotes = tags.getOrDefault(tag, new ArrayList<>());
	            currentTagNotes.add(noteId);
	            tags.put(tag, currentTagNotes);      
	            return true;
	        }
	        return false;
	    }

	    public List<Map<String, String>> getNotesByTag(String tag) {
	        // TODO: implement solution
	        if(tags.containsKey(tag))
	        {
	           List<Map<String, String>> outcome = new ArrayList<>();
	            List<String> notesIdsWithTag = tags.get(tag); 
	            for(String noteIdWithTag : notesIdsWithTag)
	            {
	                Note currentNote = notes.get(noteIdWithTag);
	                Map<String, String> currentMapping = new HashMap<>();
	                currentMapping.put("noteId", currentNote.noteId);
	                currentMapping.put("title", currentNote.title);
	                currentMapping.put("content", currentNote.content);
	                outcome.add(currentMapping);
	            } 
	            return outcome;          
	        }

	        return null;
	    }

	    public boolean shareNote(String noteId, String userId, String accessLevel) {
	        // TODO: implement solution
	        if(notes.containsKey(noteId) && (accessLevel.equals("read") || accessLevel.equals("write")))
	        {
	            shares.put(userId, shares.getOrDefault(userId, new HashMap<>()));
	            shares.get(userId).put(noteId, shares.get(userId).getOrDefault(noteId, new HashMap<>()));
	            shares.get(userId).get(noteId).put("accessLevel", accessLevel);
	            shares.get(userId).get(noteId).put("noteId", noteId);    
	            return true;        
	        }
	        return false;
	    }

	    public List<Map<String, String>> getSharedNotes(String userId) {
	        // TODO: implement solution
	        List<Map<String, String>> outcome = new ArrayList<>();
	        if(shares.containsKey(userId))
	        {
	            Map<String, Map<String, String>> userNotesMap = shares.get(userId);
	            for(String noteIdKey : userNotesMap.keySet())
	            {
	                if(notes.containsKey(noteIdKey))
	                {
	                    Note noteObj = notes.get(noteIdKey);
	                    Map<String, String> data = new HashMap<>();
	                    data.putAll(shares.get(userId).get(noteIdKey));
	                    data.put("title", noteObj.title);
	                    data.put("content", noteObj.content);
	                    outcome.add(data);
	                }    
	            }
	            
	            return outcome;
	        }
	        return null;
	    }

	    public boolean addVersion(String noteId, String title, String content, List<String> tags) {
	        // TODO: implement solution
	        if(notes.containsKey(noteId) && versions.containsKey(noteId))
	        {
	            if(notes.get(noteId).equals(new Note(noteId, title, content, tags)))
	            {
	                return false;
	            }
	             versions.get(noteId).push(new Note(notes.get(noteId).noteId, notes.get(noteId).title, notes.get(noteId).content, notes.get(noteId).tags));
	            notes.get(noteId).title = title;
	            notes.get(noteId).content = content;
	            notes.get(noteId).timeStampVersion = System.currentTimeMillis();
	            for(String currTag : tags)
	            {
	                addTag(noteId, currTag);
	            }
	           
	            return true;
	        }
	        return false;
	    }

	    public boolean undoVersion(String noteId) {
	        // TODO: implement solution
	        
	        if(notes.containsKey(noteId)  && versions.containsKey(noteId))
	        {
	            Note currNote = versions.get(noteId).pop();
	            notes.put(noteId, currNote);
	            return true;
	        }
	        return false;
	    }

	    private static class Note {
	        String noteId;
	        String title;
	        String content;
	        List<String> tags;
	        long timeStampVersion;

	        Note(String noteId, String title, String content, List<String> tags) {
	            this.noteId = noteId;
	            this.title = title;
	            this.content = content;
	            this.tags = tags;
	        }
	        
	        @Override
	        public boolean equals(Object obj)
	        {
	            if(obj == this){return true;}
	            if(obj == null || getClass() != obj.getClass())
	            {
	                return false;
	            }
	            Note currNote = (Note)obj;
	            return (currNote.title.equals(this.title) && currNote.content.equals(this.content) && currNote.tags.equals(this.tags));
	        }
	    }
}
