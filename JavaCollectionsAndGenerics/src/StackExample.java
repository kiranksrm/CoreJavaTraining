import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s =new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println();
		s.pop();
		s.pop();
		it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
