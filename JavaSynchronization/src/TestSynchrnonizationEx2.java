
public class TestSynchrnonizationEx2 {

	public static void main(String[] args) {
		
		Table table = new Table();
		
		Thread t1 = new Thread() {
			public void run()
			{
				table.printTable(5);
			}
		};
		
		Thread t2 = new Thread() {
			public void run()
			{
				table.printTable(10);
			}
		};
		
		t1.start();
		t2.start();

	}

}
