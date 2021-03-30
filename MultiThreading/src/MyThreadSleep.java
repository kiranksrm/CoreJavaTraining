
public class MyThreadSleep extends Thread {
	
	@Override
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("In Sleeping Thread..");
		}
		
	}
}
