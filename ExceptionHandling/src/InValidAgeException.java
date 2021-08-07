public class InValidAgeException extends RuntimeException{
	
	public InValidAgeException(String msg)
	{
		super(msg);
	}
	
	public InValidAgeException(int MsgCode, String msg)
	{
		super(MsgCode+msg);
	}
}
