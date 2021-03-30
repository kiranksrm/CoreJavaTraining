
public class Customer {
 int balAmount =10000;
 
 synchronized void withdraw(int amount)
 {
	 System.out.println("Going to withdraw the amount...");
	 
	 if(this.balAmount<amount)
	 {
		 System.out.println("Less Balance waiting for the deposit..");
		 try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	 this.balAmount=this.balAmount-amount;
	 System.out.println("Amount is withdrwan successfully..");
	 
 }
 
 
 synchronized void deposit(int amount)
 {
	 System.out.println("Going to deposit the amount..");
	 
	 this.balAmount= this.balAmount+amount;
	 
	 System.out.println("Amount deposited successfully..");
	 notify();
 }
 
}
