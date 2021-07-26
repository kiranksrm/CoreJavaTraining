
public class Customer1 implements Comparable<Customer1>{

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
	
	
//	@Override
//	public int compareTo(Customer1 o) {
//		
//		return this.name.compareTo(o.getName());
//	}
	@Override
	public int compareTo(Customer1 o)
	{
	  if(this.sal==o.getSal())
		  return 0;
	  if(this.sal>o.getSal())
		  return 1;
	  else
		  return -1;
	}
	
	
}
