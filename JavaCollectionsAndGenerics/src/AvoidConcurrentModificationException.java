import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentModificationException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list.size());
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String val = it.next();
		//	System.out.println("Before deleting.. " + val);
			if(val.equalsIgnoreCase("B"))
			{
				list.remove(val);
				list.add("X");
			}
			else
			{
			 System.out.println(val);
			}
		}
		for(String str:list)
		{
		System.out.println("-----"+str);
		}

		// 1. Use for loop instead of iterator or ListIterator
		for (int i = 0; i < list.size(); i++) {
			String val1=list.get(i);
			//System.out.println(list.size());
			if (val1.equals("B")) {
				i--;
				list.remove(list.get(i));
			} else {
				System.out.println(val1);
			}
		}

//ArrayList<Employee> al = new ArrayList<Employee>();
//		
//		System.out.println(al.size());
//		for(int i=0;i<12;i++)
//		{
//			Employee e = new Employee();
//			e.setId(i);
//			e.setName("Test "+i);
//			e.setSal((1000+i));
//			al.add(e);
//		}
//		
//		
//		Iterator it1 = al.iterator();
//		while(it1.hasNext())
//		{
//			Employee e1= (Employee)it1.next();
//			
//			if(e1.getId()==5)
//			{
//				//al.remove(e1);
//				//al.add(e1);
//			}
//			System.out.print("ID: "+e1.getId());
//			System.out.print(" Name: "+e1.getName());
//			System.out.print(" Salary "+e1.getSal());
//			System.out.println();
//		}
	}

}
