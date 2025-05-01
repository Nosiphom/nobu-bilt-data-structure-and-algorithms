package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {

	   private List<String> syncList = Collections.synchronizedList(new ArrayList<>());

	    public void addElements() {
	        for (int i = 0; i < 5; i++) {
	            syncList.add("Element " + i);
	            System.out.println("Thread 1 added: Element " + i);
	        }
	    }

	    public void removeElement() {
	        if(!syncList.isEmpty() && syncList.contains("Element 2"))
	        {    
	            syncList.remove("Element 2");
	            System.out.println("Thread 2 removed: Element 2");   
	        }
	        else
	        {
	             System.out.println("Thread 2 attempted to remove unexistent: Element 2");   
	        }
	    }
	    
	    public void addElement(String element) {
	        syncList.add(element);
	        System.out.println("Added: " + element);
	    }
	    
	    // TODO: Implement a thread-safe method to search for an element in the list.
	    // Use a synchronized(syncList) block and the contains() method to ensure 
	    // safe access while searching.
	    public boolean search(String element)
	    {
	        synchronized(syncList)
	        {
	            return syncList.contains(element);   
	        }
	    }
	    
	    public void removeElement(String element) {
	        syncList.remove(element);
	        System.out.println("Removed: " + element);
	    }

	    public void printListInfo() {
	        if (!syncList.isEmpty()) {
	            System.out.println("Thread 3 retrieved: " + syncList.get(0));
	            System.out.println("Thread 3 list size: " + syncList.size());
	        }
	    }

	    public List<String> getList() {
	        return syncList;
	    }
	}
