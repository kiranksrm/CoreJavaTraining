import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> unsortedList=new ArrayList<String>();
		unsortedList.add("D");
		unsortedList.add("A");
		unsortedList.add("C");
		unsortedList.add("B");
		
		System.out.println("Before Sorting");
		for(String str: unsortedList)
		{
			System.out.println(str);
		}
		Collections.sort(unsortedList);//by-default Ascending order
		
		for(String name:unsortedList)
		{
			System.out.println(name);
		}
		
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		
		Collections.sort(list);
		for(Integer i: list)
		{
			System.out.println(i);
		}
		
		
		String[] strArr= {"D","B","C","A"};
		Arrays.sort(strArr);
		for(String str: strArr)
		{
			System.out.println(str);
		}
		
		
		//check the list is empty
		List ll=new ArrayList();
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());//true
		
		if(null!=ll && (ll.size()>0 || ll.isEmpty()))
		{
			
		}
		
		ll.add("1");
		ll.add("2");
		
		List list1=new ArrayList();
		list1.add("X");
		list1.add("Y");
		
		ll.addAll(list1);
		
		
		ll.set(0, "3");
		
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Remove all the elements from the arraylist
		ll.removeAll(list1);
		System.out.println(ll.size());
		
		ListIterator listIt=ll.listIterator();
		while(listIt.hasNext())
		{
			System.out.println(listIt.next());
		}
		//Clear method
		ll.clear();
		System.out.println(ll.size());
		
	}

}
