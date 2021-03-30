
public class ThreadAnnonymus {
	
	public static void main(String[] args)
	{
		
//		ThreadAnnonymus m = new ThreadAnnonymus() {
//			void printData()
//			{
//				System.out.println("Hello");
//			}
//		};
		
		
		Thread t1= new Thread() {
			
			@Override
			public void run()
			{
				System.out.println("Inside annonymus Thread..");
			}
			
		};
		t1.start();
		
		//T2 Thread
		new Thread() {
			
			@Override
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println(i);
				}
			}
			
		}.start();
		
		
		//Using Runnable Interfaces
		
		Runnable r1= new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable1..");
				
			}
		};
		Thread t3 = new Thread(r1);
		t3.start();
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable2..");
			}
		};
		new Thread(r2).start();
		
		
		
	}

}
