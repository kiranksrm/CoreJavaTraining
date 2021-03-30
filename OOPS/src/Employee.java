
public class Employee {

	int empID;
	String empName;
	Address addr;//HAS-A relationship
	
	public static void main(String args[])
	{
		
		Address a1= new Address(1,"ABC",560040);
		
		Address a2=new Address(2,"XYZ",544003);
		
		Employee e1=new Employee();
		e1.empID=123;
		e1.empName="Java";
		e1.addr=a1;
		
		e1.displayEmployeeInfo(e1);
		
	}
	
	public void displayEmployeeInfo(Employee e1)
	{
		System.out.println(e1.empID+", "+e1.empName);
		System.out.println(e1.addr.DNo+","+e1.addr.streetName+","+e1.addr.zipCode);
	}
	
}
