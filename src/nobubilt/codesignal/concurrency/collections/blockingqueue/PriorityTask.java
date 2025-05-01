package nobubilt.codesignal.concurrency.collections.blockingqueue;

public class PriorityTask implements Comparable<PriorityTask>
{
    private String content;
    private int priority;
    public PriorityTask(String text, int priorityLevel)
    {
        this.content = text;
        this.priority = priorityLevel;
    }
    
    public int compareTo(PriorityTask task)
    {
        if(task.priority == this.priority)
        {
            return this.content.compareTo(task.content);
        }
        return this.priority - task.priority;
    }
    
    public String getContent()
    {
        return content;
    }
    public int priority()
    {
        return priority;
    }
}