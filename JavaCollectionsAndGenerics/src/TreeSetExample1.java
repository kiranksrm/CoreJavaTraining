import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= new ArrayList<>();
		list.add(30);
		list.add(10);
		list.add(20);
		
		TreeSet<List> t1= new TreeSet<>();
		t1.add(list);
		
	    Iterator it2= t1.iterator();
	    while(it2.hasNext())
	    {
	    	List<Integer> ll = (List<Integer>)it2.next();
	    }
	
		System.out.println("----------------");
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(50);
		t.add(20);
		t.add(5);
		
		//t.add(null);
		
		Iterator it = t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("@@@@@@@@@@@@@@@@");
		Iterator it1= t.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
