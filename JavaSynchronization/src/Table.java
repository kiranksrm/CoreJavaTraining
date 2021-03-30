
public class Table {
	
//	void printTable(int n) //Non-Synchronized method
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println(n+"*"+i+"="+(n*i));
//		}
//		try {
//			Thread.sleep(400);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	
	
//	void printTable(int n) 
//	{
//		synchronized(this) //synchronized block (object reference varaiable)
//		{
//			for(int i=1;i<=5;i++)
//			{
//				System.out.println(n+"*"+i+"="+(n*i));
//			}
//			try {
//				Thread.sleep(400);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	synchronized static void printTable(int n) 
	{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n+"*"+i+"="+(n*i));
			}
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}
