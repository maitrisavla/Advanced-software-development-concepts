public class TakeItemState extends State{

    public TakeItemState()
    {
        super.minutesRequiredForState = 2;
    }

    @Override
    public State timeElapsed(int minutes) {
        super.minutesElapsed += minutes;

        if(super.minutesElapsed >= super.minutesRequiredForState)
        {
            return new MoveToTruckState();
        }
        return null;
    }
}
