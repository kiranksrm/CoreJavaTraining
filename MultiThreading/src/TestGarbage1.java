
public class TestGarbage1 {
	
	@Override
	public void finalize()
	{
		System.out.println("Inside finalize method..");
	}
	

	public static void main(String[] args) {
		
		TestGarbage1 t1 = new TestGarbage1();
		TestGarbage1 t2 = new TestGarbage1();
		
		//t1=null;
		t2=t1;
		
		System.gc();
		
	}

}
