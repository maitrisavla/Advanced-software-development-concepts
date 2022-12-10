
public class WarehouseFactory implements IWarehouseFactory
{
	@Override
	public IBattery createBattery(int capacity)
	{
		return new Battery(capacity);
	}

	@Override
	public IRobot createRobot(int batteryCapacity)
	{
		IBattery battery = createBattery(batteryCapacity);
		State startState = createIdleState();
		return new Robot(battery, startState);
	}

	public IRobot createRobotWithBatteryPack(int batteryCapacity, int packCapacity)
	{
		return new Robot(createBatteryPack(batteryCapacity, packCapacity), createIdleState());
	}

	@Override
	public IBattery createBatteryPack(int capacity, int packCapacity) {
		return new BatteryPack(createBattery(capacity), packCapacity);
	}

	@Override
	public State createIdleState() {
		return new IdleState();
	}

	@Override
	public State createRechargeState(State originalState, IBattery battery) {
		return new RechargeState(battery, originalState);
	}

	@Override
	public State createFinishState() {
		return new FinishedState();
	}

	@Override
	public State createClaimState() {
		return new ClaimItemState();
	}

	@Override
	public State createMoveToShelfState() {
		return null;
	}

	@Override
	public State createTakeItemState() {
		return new TakeItemState();
	}

	@Override
	public State createMoveToTruckState() {
		return new MoveToTruckState();
	}

	@Override
	public State createLoadTruckState() {
		return new LoadTruckState();
	}
}

