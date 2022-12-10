public class BatteryPack implements IBattery{

    private int packCapacity;
    private int packCharge;
    private IBattery decoratorBattery;

    public BatteryPack(IBattery battery, int capacity)
    {
        decoratorBattery = battery;
        packCharge = packCapacity = capacity;
    }

    public int charge()
    {
        return packCharge;
    }

    public int capacity()
    {
        return packCapacity;
    }

    @Override
    public boolean hasEnoughPowerForMinutes(int minutes) {

        int packChargeDiff = packCharge - minutes;

        if(packChargeDiff >= 0 || decoratorBattery.hasEnoughPowerForMinutes(minutes))
            return true;

        return false;
    }

    @Override
    public boolean isFullyCharged() {

        if(packCapacity == packCharge && decoratorBattery.isFullyCharged())
            return true;

        return false;
    }

    @Override
    public void drain(int minutes) {
        int packChargeDiff = packCharge - minutes;

        if(packChargeDiff >= 0)
        {
            packCharge -= minutes;
            packCharge = Math.max(packCharge, 0);
        }
        else
        {
            decoratorBattery.drain(minutes);
        }
    }

    @Override
    public void recharge(int minutes) {
        if(decoratorBattery.isFullyCharged())
        {
            packCharge += minutes * 2;
            packCharge = Math.min(packCapacity, packCharge);
        }
        else
        {
            decoratorBattery.recharge(minutes);
        }
    }
}
