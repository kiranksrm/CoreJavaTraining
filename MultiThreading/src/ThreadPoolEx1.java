
public class ThreadPoolEx1 implements Runnable {
	
	private String message;
	
	public ThreadPoolEx1(String message)
	{
		this.message=message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" -->Stat message:"+message);
		processMessage();
		System.out.println(Thread.currentThread().getId()+" --->End Message.");
		
	}
	
	public void processMessage()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

}
