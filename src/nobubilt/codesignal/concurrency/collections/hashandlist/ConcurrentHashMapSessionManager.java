package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapSessionManager {

	private ConcurrentHashMap<String, String> sessions = new ConcurrentHashMap<>();

    // TODO: Implement the createSession method to add a new session to the map
    public void createSession(String userId, String sessionData)
    {
        sessions.put(userId, sessionData);
    }
    // TODO: Implement the updateSession method to update session data for a user
    public void updateSession(String userId, String sessionData)
    {
        sessions.put(userId, sessionData);
    }
    // TODO: Implement the removeSession method to safely remove a session by user ID
    public void removeSession(String userId)
    {
        sessions.remove(userId);
    }
    // TODO: Implement the getSession method to retrieve session details
    public String getSession(String userId)
    {
        return sessions.get(userId);
    }
    // TODO: Implement the getActiveSessionCount method to return the number of active sessions
    public int getActiveSessionCount()
    {
        return sessions.size();
    }
}
