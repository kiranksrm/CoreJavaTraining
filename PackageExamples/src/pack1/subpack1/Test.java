package pack1.subpack1;

import pack1.M;
import pack1.X;

public class Test extends M {
	int i;

	public static void main(String args[]) {
		M m1 = new M();
		m1.j=20;
		m1.test1();
		
		X x =new X();
		x.i=10;
		x.j=20;
		x.test();
		x.test1();
		
	}
}
