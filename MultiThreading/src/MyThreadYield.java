
public class MyThreadYield extends Thread {

	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("In Thread Yield..");
		}
		
	}
}
