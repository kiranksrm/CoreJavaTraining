
public class MyThread1 extends Thread{
	
	Table t;
	public MyThread1(Table table) {
	this.t=table;
	}
	
	@Override
	public void run()
	{
		t.printTable(5);
	}

}
