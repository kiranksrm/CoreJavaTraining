
public class DeamonThreadEx1 extends Thread{
	
	
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Deamon Thread..");
		}
		else
			System.out.println("Non-Deamon Thread..");
	}
	public static void main(String[] args) {
		
		DeamonThreadEx1 d1 = new DeamonThreadEx1();
		DeamonThreadEx1 d2 = new DeamonThreadEx1();
		
		d1.setDaemon(true);
		d1.start();
		
		d2.start();
		
	}

}
