
public class ThreadEx1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1 myThread= new ThreadEx1();
		myThread.setName("MyThreadEx1");
		myThread.start();
		myThread.run();
		
	}
	@Override
	public void run() {
		System.out.println("Welcome to MultiThreading.");
	}

}
