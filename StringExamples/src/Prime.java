import java.util.ArrayList;
import java.util.List;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=101;
		int k=51;
		List<Integer> list= new ArrayList();
		
		int prime=0;
		int sum=0;
		for(int i=n;(list.size()<k);i++)
		{
			int counter=0;
			//i=101--> 1-2 3 4 5 -101
			for(int j=1; j<=i;j++) // to iterate from 1 to the given i value
			{
			  if(i%j==0)  
			  {
				  counter++; //1  1367
			  }
			}
			
			if(counter==2)
			{
				list.add(i);
				sum=sum+i;
			}
			
		}
		System.out.println(list);
		System.out.println(sum);
	}

}
