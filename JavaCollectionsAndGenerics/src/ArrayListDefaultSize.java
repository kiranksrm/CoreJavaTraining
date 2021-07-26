import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;




public class ArrayListDefaultSize {
int a;
int b;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		for(int k: arr)
		System.out.println(arr[k]);
		System.out.println(arr.length);
		
		  ArrayList<Integer> list = new ArrayList<Integer>(3);
	        for (int i = 0; i < 17; i++) {
	            list.add(i);
	            System.out.format("Size: %2d, Capacity: %2d%n",
	                              list.size(), getCapacity(list));
	        }
	        Method[] methodArr=  ArrayListDefaultSize.class.getDeclaredMethods();
			   for(Method m: methodArr)
			   {
				   System.out.println(m.getName());
			   }
			   Annotation[] an=  ArrayListDefaultSize.class.getDeclaredAnnotations();
			   for(Annotation a: an)
			   {
				   System.out.println();
			   }
	}
	@Deprecated
	  static int getCapacity(ArrayList<?> list) throws Exception {
	        Field dataField = ArrayList.class.getDeclaredField("elementData");
	        dataField.setAccessible(true);
	        return ((Object[]) dataField.get(list)).length;
	    }
	  
	  int display()
	  {
		  return 0;
	  }

}
