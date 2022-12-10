public class MoveToTruckState extends State{

    public MoveToTruckState()
    {
        super.minutesRequiredForState = 4;
    }

    @Override
    public State timeElapsed(int minutes) {
        super.minutesElapsed += minutes;

        if(super.minutesElapsed >= super.minutesRequiredForState)
        {
            return new LoadTruckState();
        }
        return null;
    }
}
