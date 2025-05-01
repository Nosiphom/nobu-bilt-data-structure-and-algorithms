package nobubilt.codesignal.design;

import java.util.*;

public class SchedulingFitness {
	
	/**
	 * Initially, you have a simplified fitness tracking system with the functionalities 
	 * listed below. We are enhancing our system with additional features to schedule future 
	 * fitness events and retrieve an agenda of these events.

boolean addActivity(String userId, String activityType, int distance) - Adds a fitness activity
 for a user if it does not exist. Prevents duplicates by activity type.
boolean updateActivity(String userId, String activityType, int distance) - Updates the distance
 of an existing activity for a user.
Integer getActivity(String userId, String activityType) - Retrieves the total distance of a 
specified activity for a user.
Map<String, Integer> activitySummary(String userId) - Provides a summary of all activities 
for a user, grouped by activity type.
New functionalities to be implemented:

boolean scheduleEvent(long timestamp, String userId, String activityType, int distance, 
long eventTime) - Schedules a future event for a user with a specified activity type and 
distance, ensuring it is for a future time. Returns True if the event is successfully 
scheduled and False otherwise. The timestamp parameter represents the current time.
List<Map<String, Object>> getAgenda(String userId, long fromTime, long toTime) - Retrieves 
a sorted list of scheduled fitness events for a user within a specified timeframe, from the 
starting to the ending time. The list should be sorted by the eventTime field. Each event 
should be returned in the following form: 
{"activityType": ..., "distance": …, "eventTime": …}. If there are no events scheduled, 
returns an empty list.
The addActivity method should be extended to integrate the distances from future scheduled 
events when adding an activity. Specifically, for addActivity, if there is a scheduled event 
for the same activity type, it should incorporate the distance from this future event into 
the distance parameter at the time of adding a new activity. This ensures that the system 
accounts for both immediate activities and those planned for the future right from the moment 
they are scheduled.
	 */

    private Map<String, Map<String, Integer>> users = new HashMap<>();
    private Map<String, List<Event>> eventScheduleMap = new HashMap<>();

    public boolean addActivity(String userId, String activityType, int distance) {
        if (!users.containsKey(userId)) {
            users.put(userId, new HashMap<>());
        }
        if (distance < 0 || users.get(userId).containsKey(activityType)) {
            return false;
        }
        
        
        int totalDistance = 0;
        if(eventScheduleMap.containsKey(userId))
        {
            List<Event> events = eventScheduleMap.get(userId);
            if(events != null)
            {
                for(Event ev : events)
                {
                    if(ev.getActivity().equals(activityType))
                    {
                       totalDistance += ev.getDistance();
                    }
                }
            }
            eventScheduleMap.put(userId, events);
        }
        
         users.get(userId).put(activityType, distance + totalDistance);            
       
        
        return true;
    }

    public boolean updateActivity(String userId, String activityType, int distance) {
        if (users.containsKey(userId) && users.get(userId).containsKey(activityType)) {
            users.get(userId).merge(activityType, distance, Integer::sum);
            return true;
        }
        return false;
    }

    public Integer getActivity(String userId, String activityType) {
        return users.getOrDefault(userId, Collections.emptyMap()).get(activityType);
    }

    public Map<String, Integer> activitySummary(String userId) {
        return users.get(userId);
    }
    
    public List<Map<String, Object>> getAgenda(String userId, long fromTime, long toTime)
    {
        if(!eventScheduleMap.containsKey(userId))
         {
             return new ArrayList<>();
         }
        
       List<Map<String, Object>> outcome = new ArrayList<>();
       List<Event> allUserEvents = eventScheduleMap.get(userId);
       if(allUserEvents != null)
       {
            Collections.sort(allUserEvents, new EventComparator());    
            for(Event event : allUserEvents)
            {
                if(event.getEventTime() >= fromTime && event.getEventTime() <= toTime)
                {
                    Map<String, Object> currentEventMap = new HashMap<>();
                    currentEventMap.put("activityType", event.getActivity());
                    currentEventMap.put("distance", event.getDistance());
                    currentEventMap.put("eventTime", event.getEventTime());
                    outcome.add(currentEventMap);
                }
            }    
        } 
        return outcome;
    }    
    
    public boolean scheduleEvent(long timestamp, String userId, String activityType, int distance, long eventTime)
    {
        if(eventTime <= timestamp )
        {
            return false;
        }
        Event event = new Event(eventTime, activityType, distance);
        List<Event> events = eventScheduleMap.get(userId);
        if(events == null)
        {
            events = new ArrayList<>();
        }
        events.add(event);
        eventScheduleMap.put(userId, events);
        return true;   
    }
    
}

class Event
{
    private long eventTime;
    private String activity;
    private int distance;
    Event(long time, String action, int dist)
    {
        this.eventTime = time;
        this.activity = action;
        this.distance = dist;
    }

    public void setEventTime( long time)
    {
        this.eventTime = time;
    }
    public long getEventTime()
    {
        return eventTime;
    }
    
    public void setActivity(String action)
    {
        this.activity = action;
    }
    public String getActivity()
    {
        return activity;
    }
    public void setDistance(int dist)
    {
        this.distance = dist;
    }
    public int getDistance()
    {
        return distance;
    }    
}

class EventComparator implements Comparator<Event>
{
    public int compare(Event ev1, Event ev2)
    {
        if(ev1.getEventTime() ==  ev2.getEventTime()){return 0;}
        return (int)( ev1.getEventTime() - ev2.getEventTime());
    }
}

