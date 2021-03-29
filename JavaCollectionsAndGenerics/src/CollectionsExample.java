import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   List<String> list= new ArrayList<>();
	   list.add("C");
	   list.add("A");
	  // list.add("a");
	  // list.add("c");
	   list.add("B");
	   
	   System.out.println("Before sorting:"+list);
	   
	   Collections.sort(list);
	   System.out.println(list);
	   
	   Collections.sort(list, Collections.reverseOrder());
	   Collections.reverse(list);
	   
	   System.out.println(list);
	   
	   
	   Collections.addAll(list, "F", "E", "1","2");
	   System.out.println(list);
	   
	   List<String> list1=new ArrayList<>();
	   list1.add("10");
	   list1.add("20");
	   
	   Collections.copy(list, list1);
	   System.out.println(list);
	   
	   
	   System.out.println(Collections.disjoint(list, list1));
	   
	   int[] arr= {20,10,30,50,20};
	   Arrays.sort(arr);
	   for(int i: arr)
	   System.out.print(i+" ");
	   System.out.println();
	   
	   List listInt= Arrays.asList(arr);
//	   for(Object j: listInt)
//	   {
//		   System.out.println((Integer)j);
//	   }
	   List<Integer> listInt1= new ArrayList<>();
	   listInt1.add(20);
	   listInt1.add(10);
	   listInt1.add(40);
	   listInt1.add(30);
	  System.out.println("Max element"+Collections.max(listInt1)+"Min element"+Collections.min(listInt1));
	   
		
	}

}
