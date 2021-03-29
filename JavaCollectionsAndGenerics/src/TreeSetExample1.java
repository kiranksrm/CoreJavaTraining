import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
