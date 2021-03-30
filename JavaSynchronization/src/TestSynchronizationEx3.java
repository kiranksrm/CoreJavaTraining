
public class TestSynchronizationEx3 {

	public static void main(String[] args) {
		
		MyThread3 t1 = new MyThread3();
		MyThread4 t2 = new MyThread4();
		MyThread5 t3 = new MyThread5();
		MyThread6 t4 = new MyThread6();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
