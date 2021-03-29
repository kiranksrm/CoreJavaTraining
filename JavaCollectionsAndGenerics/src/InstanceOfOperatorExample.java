import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class InstanceOfOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList<>();
		
		LinkedList ll=new LinkedList<>();
		
		System.out.println(al instanceof Serializable);//true
		
		System.out.println(al instanceof RandomAccess); //true
		
		System.out.println(ll instanceof RandomAccess); //false
		
		System.out.println(ll instanceof Serializable); //true
		
		System.out.println(ll instanceof Cloneable); //true
		
		
	}

}
