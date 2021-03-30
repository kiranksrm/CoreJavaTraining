import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx1Test {

	public static void main(String[] args) {
		
		ExecutorService executor=Executors.newFixedThreadPool(2);//creating pool of 5 threads
		
		for(int i=0;i<10;i++)
		{
		   Runnable r= new ThreadPoolEx1(""+i);
		   executor.execute(r);//calling the execute method of executor service
		   
		}
		
		executor.shutdown();
		while(!executor.isTerminated())
		{
			//System.out.println("Terminated..");
		}
		
		System.out.println("All done.");
	}

}
