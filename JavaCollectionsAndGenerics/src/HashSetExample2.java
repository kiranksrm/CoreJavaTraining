import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

class Customer
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


public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Customer> hs=new HashSet<Customer>();
		
		Customer e=new Customer();
		e.setId(1);
		e.setName("Ram");
		e.setSal(1000);
		
		Customer e1=new Customer();
		e1.setId(2);
		e1.setName("Kiran");
		e1.setSal(2000);
		
		
		hs.add(e);
		hs.add(e1);
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			//System.out.println(obj);
			Customer emp=(Customer)obj;
			System.out.print(emp.getId()+","+emp.getName()+","+emp.getSal());
			System.out.println();
		}
		
		
		
	}

}
