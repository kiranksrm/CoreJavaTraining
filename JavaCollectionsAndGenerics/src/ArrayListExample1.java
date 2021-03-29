import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Employee
{
	int id;
	String name;
	int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}


public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		System.out.println(al.size());
		for(int i=0;i<12;i++)
		{
			//al.add(i);
			Employee e = new Employee();
			e.setId(i);
			e.setName("Test "+i);
			e.setSal((1000+i));
			
			
			al.add(e);
		}
		
		System.out.println(al.size());
		//al.remove(4);
		
		//Iterator
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Employee e1= (Employee)it.next();
			
//			if(e1.getId()==5)
//			{
//				al.remove(e1);
//			}
			System.out.print("ID: "+e1.getId());
			System.out.print(" Name: "+e1.getName());
			System.out.print(" Salary "+e1.getSal());
			System.out.println();
		}
		System.out.println("##################");
		
		//Foreach loop
		for(Employee e1:al)
		{
			
			System.out.print("ID: "+e1.getId());
			System.out.print(" Name: "+e1.getName());
			System.out.print(" Salary "+e1.getSal());
			System.out.println();
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//using for loop
		for(int i=0;i<al.size();i++)
		{
			
			Employee e1= al.get(i);
			if(e1.getId()==6)
			{
				al.remove(i);
			}
			System.out.print("ID: "+e1.getId());
			System.out.print(" Name: "+e1.getName());
			System.out.print(" Salary "+e1.getSal());
			System.out.println();
		}
		
	}

}
