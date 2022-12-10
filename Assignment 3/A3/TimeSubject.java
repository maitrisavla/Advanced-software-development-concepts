import java.util.ArrayList;

public class TimeSubject {

    private static TimeSubject instance = null;
    private ArrayList<ITimerObserver> receivers;

    public TimeSubject()
    {
        receivers = new ArrayList<ITimerObserver>();
    }

    public static TimeSubject init()
    {
        if(instance != null)
        {
            return instance;
        }

        instance = new TimeSubject();
        return instance;
    }

    public void addReceiver(ITimerObserver receiver)
    {
        receivers.add(receiver);
    }

    public void removeReceiver(ITimerObserver receiver)
    {
        receivers.remove(receiver);
    }

    public void notifySubjects()
    {
        for(int cnt=0; cnt<receivers.size(); cnt++)
        {
            receivers.get(cnt).timeElapsed(1);
        }
    }
}
