public class MoveToShelfState extends State{

    public MoveToShelfState()
    {
        super.minutesRequiredForState = 4;
    }

    @Override
    public State timeElapsed(int minutes) {
        super.minutesElapsed += minutes;

        if(super.minutesElapsed >= super.minutesRequiredForState)
        {
            return new TakeItemState();
        }
        return null;
    }
}
