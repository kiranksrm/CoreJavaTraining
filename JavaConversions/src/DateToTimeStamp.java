import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		Timestamp t= new Timestamp(date.getTime());
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(t);
		System.out.println(sdf.format(t));
		
	}

}
