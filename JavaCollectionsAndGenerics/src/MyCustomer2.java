public class MyCustomer2 {
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
//	public int compare(MyCustomer2 o1, MyCustomer2 o2) {
//		
//		if(o1.getSal()==o2.getSal())
//		  return 0;
//		else if(o1.getSal()<o2.getSal())
//			return 1;
//		else
//			return -1;
//	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		
		if(obj==null || obj.getClass()!=this.getClass())
		    return false;
		
		MyCustomer2 user = (MyCustomer2) obj;
		
		return (user.name.equals(this.name) && (user.id==this.id) && (user.sal==this.sal));
	}

	@Override
	public int hashCode()
	{
		return this.id;
	}
	@Override
	public String toString()
	{
		return ""+hashCode();
	} 
	
}
