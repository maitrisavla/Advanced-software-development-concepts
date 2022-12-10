public class RechargeState extends State{

    private IBattery batteryPack;
    private State previousState;

    public RechargeState(IBattery BatterPack, State state)
    {
        super.minutesRequiredForState = 0;
        batteryPack = BatterPack;
        previousState = state;
    }

    @Override
    public State timeElapsed(int minutes) {

        batteryPack.recharge(minutes);

        if(batteryPack.isFullyCharged())
        {
            return previousState;
        }
        return null;
    }
}

