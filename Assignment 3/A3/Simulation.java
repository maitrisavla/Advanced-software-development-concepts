import java.util.*;

public class Simulation
{
	private static Simulation theOneInstance = null;
	private IWarehouseFactory factory;
	private List<Object> robots;
	private int minutesToCompleteSimulation;
	private Shelf shelf;

	public Simulation()
	{
		robots = new ArrayList<Object>();
		minutesToCompleteSimulation = 0;
		shelf = new Shelf();
	}

	public static Simulation instance()
	{
		if (null == theOneInstance)
		{
			theOneInstance = new Simulation();
		}
		return theOneInstance;
	}

	public IWarehouseFactory getFactory()
	{
		return factory;
	}

	public Shelf getShelf()
	{
		return shelf;
	}

	public void build(Arguments args, IWarehouseFactory factory)
	{
		this.factory = factory;
		shelf.setItemCount(args.getShelfCount());

		int batteryCapacity = args.getDefaultBatteryCapacity();
		int packCapacity = args.getBatteryPackCapacity();

		for(int cnt=0; cnt < args.getNumBatteryPacks(); cnt++)
		{
			IRobot robot = factory.createRobotWithBatteryPack(batteryCapacity, packCapacity);
			TimeSubject.init().addReceiver((ITimerObserver) robot);
			robots.add(robot);
		}

		int robotsWithoutBattery = args.getNumRobots() - args.getNumBatteryPacks();
		for(int cnt= robotsWithoutBattery; cnt < args.getNumRobots(); cnt++)
		{
			IRobot robot = factory.createRobot(batteryCapacity);
			TimeSubject.init().addReceiver((ITimerObserver) robot);
			robots.add(robot);
		}
	}

	public int run()
	{
		System.out.println("Simulation begun!");
		boolean robotsStillWorking = true;
		while (robotsStillWorking)
		{
			TimeSubject.init().notifySubjects();

			minutesToCompleteSimulation += 1;
			robotsStillWorking = false;
			ListIterator<Object> iter = robots.listIterator();
			while (iter.hasNext())
			{
				IRobot robot = (IRobot)iter.next();
				if (robot.isWorking())
				{
					robotsStillWorking = true;
					break;
				}
			}
		}
		System.out.println("Simulation complete!");
		return minutesToCompleteSimulation;
	}
}

















