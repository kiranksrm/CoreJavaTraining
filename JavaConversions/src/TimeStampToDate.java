import java.sql.Timestamp;
import java.util.Date;

public class TimeStampToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timestamp ts= new Timestamp(System.currentTimeMillis());
		Date date = new Date(ts.getTime());
		
		//date = ts;
		System.out.println(date);
	}

}
