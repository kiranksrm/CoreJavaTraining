
public class ThreadDemo3 {

	public static void main(String[] args) {
		
		MyThreadSleep m=new MyThreadSleep();
		m.start();
		
		MyThreadSleep m1=new MyThreadSleep();
		m1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("In Main Thread...");
		}
		
	}

}
