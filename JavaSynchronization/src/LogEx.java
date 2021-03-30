
public class LogEx {
 
 synchronized void Thread1Log()
 {
	 System.out.println("Thread1 Log");
	 
	 for(int i=65;i<=70;i++)
	 {
		 System.out.println("Printing chars.");
		 System.out.println((char)i);
		 try {
			 notify();
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	 System.out.println("Thread1:Logs Printed successfully.");
	 
 }
 
 
 synchronized void Thread2Log()
 {
	 System.out.println("Going to print Thread2 logs..");
	 
	 for(int i=1;i<=5;i++)
	 {
		 System.out.println(i);
		 
		 try {
			notify();
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }
	 
	 System.out.println("Thread2 logs printed succesfully..");
 }
 
}
