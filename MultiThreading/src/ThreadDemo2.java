
public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread2 m =new MyThread2();
		m.start();
		
		Runnable r=new MyThread2();
		r.run();
		
		Thread t=new MyThread2();
		t.start();
		
		Thread t1 = new Thread(r);
		t1.start();
		
	}

}
