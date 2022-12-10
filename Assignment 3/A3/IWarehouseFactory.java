public interface IWarehouseFactory
{
	public IBattery createBattery(int capacity);
	public IRobot createRobot(int batteryCapacity);
	public IRobot createRobotWithBatteryPack(int batteryCapacity, int packCapacity);
	public IBattery createBatteryPack(int capacity, int packCapacity);
	public State createIdleState();
	public State createRechargeState(State originalState, IBattery battery);
	public State createFinishState();
	public State createClaimState();
	public State createMoveToShelfState();
	public State createTakeItemState();
	public State createMoveToTruckState();
	public State createLoadTruckState();
}
