public class LoadTruckState extends State{

    public LoadTruckState()
    {
        super.minutesRequiredForState = 5;
    }

    @Override
    public State timeElapsed(int minutes) {
        super.minutesElapsed += minutes;

        if(super.minutesElapsed >= super.minutesRequiredForState)
        {
            return new IdleState();
        }
        return null;
    }
}
