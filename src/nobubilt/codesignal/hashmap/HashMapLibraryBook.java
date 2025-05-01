package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapLibraryBook {

/**
 * You are provided with log data from a library's digital system, stored in string format. 
 * The log represents books' borrowing activities, including the book ID and the time a book 
 * is borrowed and returned. The structure of a log entry is as follows: 
 * <book_id> borrow <time>, <book_id> return <time>.

The time is given in the HH:MM 24-hour format, and the book ID is a positive integer between 
1 and 500. The logs are separated by a comma, followed by a space (", ").

Your task is to create a Java function named solution(). This function will take as input 
a string of logs and output a list of strings representing the books with the longest 
borrowed duration. Each string contains the book ID and the book's borrowed duration, 
concatenated by a space. By 'borrowed duration,' we mean the period from when the book 
is borrowed until it is returned. If a book has been borrowed and returned multiple times, 
the borrowed duration is the total cumulative sum of those durations. If multiple books 
share the same longest borrowed duration, the function should return all such books in 
ascending order of their IDs.

For example, if we have a log string as follows: "1 borrow 09:00, 2 borrow 10:00, 1 
return 12:00, 3 borrow 13:00, 2 return 15:00, 3 return 16:00",
the function should return the list ["2 05:00"].

Note: You can safely assume that all borrowing actions for a given book will have a 
corresponding return action in the log, and vice versa. Also, the logs are sorted by 
the time of the action.
 * @param logs
 * @return
 */
    public List<String> solution(String logs) {
        String[] logArr = logs.split(", ");
        Map<String, Book> bookMap = new HashMap<>();
        for(String bookStr : logArr)
        {
            String[] bookStrArr = bookStr.split(" ");//1 borrow 09:00
            String bookId = bookStrArr[0];
            String action = bookStrArr[1];
            String time = bookStrArr[2];
            int currTimeInMins = Integer.parseInt(time.substring(0, 2)) * 60 + (Integer.parseInt(time.substring(3)));
            if(!bookMap.containsKey(bookId) && action.equals("borrow"))
            {
                bookMap.put(bookId, new Book(bookId, currTimeInMins, 0));
                
            }
            else if(bookMap.containsKey(bookId) && action.equals("borrow"))
            {
                Book existingBook = bookMap.get(bookId);
                bookMap.put(bookId, new Book(bookId, currTimeInMins, existingBook.duration));
                
            }
            else if(bookMap.containsKey(bookId) && action.equals("return"))
            {
                int duration = currTimeInMins - bookMap.get(bookId).timeInMinutes + bookMap.get(bookId).duration;
                bookMap.put(bookId, new Book(bookId, currTimeInMins, duration));
            }            
        }
        
        List<Book> bookList = new ArrayList<>();
        for(String key : bookMap.keySet())
        {
            bookList.add(bookMap.get(key));
        }
        bookList.sort(new BookComparator());
        List<String> result = new ArrayList<>();
        
        
        Book maxRec = bookList.get(0);
        for(Book  rec : bookList)
        {
            if(maxRec.duration == rec.duration)
            {
            String hrs = String.valueOf(rec.duration/60);
            String mins = String.valueOf(rec.duration%60);
            
            if(hrs.length() < 2)
            {
                hrs = "0" + hrs; 
            }
            if(mins.length() < 2)
            {
                mins = "0" + mins;
            }
            String phrase = rec.bookId + " " + hrs + ":" + mins;
            result.add(phrase);
    
            }
        }
        return result;
    }
}

class Book
{
    String bookId;
    int timeInMinutes = 0;
    int duration = 0;
    public Book(String bookId, int timeInMins, int duration)
    {
        this.bookId = bookId;
        this.timeInMinutes = timeInMins;
        this.duration = duration;
        
    }
}

class BookComparator implements Comparator<Book>
{
    public int compare(Book b1, Book b2)
    {
        if(b2.duration == b1.duration)
        {
            return b1.bookId.compareTo(b2.bookId);
        }
        return b2.duration - b1.duration;
    }
}
