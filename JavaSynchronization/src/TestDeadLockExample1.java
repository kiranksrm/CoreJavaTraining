
public class TestDeadLockExample1 {

	public static void main(String[] args) {
		
		
		final String resource1="Java Programming.";
		
		final String resource2="Python Programming.";
		//t1 tries to lock resource 1 and resource2
		Thread t1 = new Thread() {
			public void run()
			{
				synchronized(resource1) {
					System.out.println("Thread1: locked the resource1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (resource2) {
						System.out.println("Thread1: locked resource2 as well");
					}
					
				}
			}
		};
		
		//t2 tries to lock resource 2 and resource1
		Thread t2 = new Thread() {
					public void run()
					{
						synchronized(resource2) {
							System.out.println("Thread2: locked the resource2");
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							synchronized (resource1) {
								System.out.println("Thread2: locked resource1 as well");
							}
							
						}
					}
				};
		
		t1.start();
		t2.start();
		
	}

}
