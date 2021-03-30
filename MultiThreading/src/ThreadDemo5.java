
public class ThreadDemo5 {

	public static void main(String[] args) {
		
		MyThreadJoin t1= new MyThreadJoin();
		
		MyThread1 t2 = new MyThread1();
		
		MyThread2 t3 = new MyThread2();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("In Main Thread");
		}
	}

}
