import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add(new Integer(10));
		al.add(10);
		al.add(10.00);
		al.add(new ArrayListExample());
		al.add(10);
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("Hello");
		al1.add("World");
		//For each loop
		for(String str:al1)
		{
			System.out.println(str);
		}
		
		int[] arr1= {10,20,30,40};
		for(int i=0;i<(arr1.length);i++)
		{
			System.out.println(arr1[i]);
		}
		
		
	}

}
