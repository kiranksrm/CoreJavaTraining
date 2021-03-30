
public class ThreadDemo1 {

	public static void main(String[] args) {
		
		MyThread1 m = new MyThread1();
		m.setName("T1");
		m.setPriority(Thread.MAX_PRIORITY);
		m.start();//new Thread will be created
		
		//m.start();
		
		MyThread1 m1 = new MyThread1();
		m1.setName("T2");
		m1.start();
		
		Thread.currentThread().setPriority(2);
		for(int i=0;i<5;i++)
		{
			
			System.out.println("ThreadDemo1...");
		}
	}

}
