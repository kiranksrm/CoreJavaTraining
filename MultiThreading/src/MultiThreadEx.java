import java.util.ArrayList;
import java.util.List;

public class MultiThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=12.00010;
		System.out.println(d);
		
		final List<String> list = new ArrayList<>();
		//list.add(null)
		
		
		Thread t1=new Thread()
		{
			public void run()
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println(i);
				}
			}
		};
		
		Thread t2=new Thread()
		{
			public void run()
			{
				for(int i=65;i<=70;i++)
				{
					System.out.println((char)i);
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
