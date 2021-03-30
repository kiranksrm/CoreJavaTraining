
public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getPriority());
		MyThreadYield m = new MyThreadYield();
		m.start();
		
		MyThread2 m1= new MyThread2();
		m1.setPriority(Thread.NORM_PRIORITY);
		m1.start();
		
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		for(int i=0;i<5;i++)
		{
			System.out.println("In Main method..");
		}
	}

}
