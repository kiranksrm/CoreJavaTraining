import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		al.add(1);
		al.add(2);
		
		
		ArrayList a2= new ArrayList();
		a2.add("A");
		al.add(a2);
		
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al.size());
		
		al.clear();
		al=null;
		System.out.println(al.size());
	}

}
