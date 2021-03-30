import java.io.IOException;

public class RuntimeExample1 {

	public static void main(String[] args) throws IOException {
//		/Runtime.getRuntime().exec("notepad");
		
		//Runtime.getRuntime().exec("shutdown -s -t 0");
		
		
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Heap Memory."+r.totalMemory());
		System.out.println("Free memory."+r.freeMemory());
		
		for(int i=1;i<=100000;i++)
		{
			new RuntimeExample1();
		}
		System.out.println("After creating the 10000 objects, the free memory is:"+r.freeMemory());
		
		System.gc();
		
		System.out.println("After gc(), Free memory is:"+r.freeMemory());
		
	}

}
