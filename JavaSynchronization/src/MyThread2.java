
public class MyThread2 extends Thread{
	
	Table t;
	public MyThread2(Table table) {
		this.t=table;
	}
	
	public void run()
	{
		t.printTable(10);
	}

}
