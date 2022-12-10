public class ClaimItemState extends State{

    public ClaimItemState()
    {
        super.minutesRequiredForState = 1;
    }

    @Override
    public State timeElapsed(int minutes) {
        super.minutesElapsed += minutes;

        if(super.minutesElapsed >= super.minutesRequiredForState)
        {
            if(Simulation.instance().getShelf().getItemCount() > 0)
            {
                Simulation.instance().getShelf().claimItem();
                return new MoveToShelfState();
            }
            return new IdleState();
        }
        return null;
    }
}
