public class IdleState extends State{

    public IdleState()
    {
        super.minutesRequiredForState = 0;
    }

    @Override
    public State timeElapsed(int minutes) {
        super.minutesElapsed += minutes;

        if(super.minutesElapsed >= super.minutesRequiredForState)
        {
            if(Simulation.instance().getShelf().getItemCount() > 0)
            {
                return new ClaimItemState();
            }
            else
            {
                return new FinishedState();
            }

        }
        return null;
    }
}
