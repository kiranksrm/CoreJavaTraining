import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add("String");
		v1.add(10);
		v1.add(new Integer(10));
		v1.add(20.00);
		v1.add(10);
		
		
		Iterator it=v1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
