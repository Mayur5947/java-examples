package exception_Handling;

public class InsuffiecientFund extends Exception
{
	String message ;
	InsuffiecientFund(String message)
	{
		this.message=message;
	}
	InsuffiecientFund()
	{
		
	}
	
	
	public String getMessage()
	{
		return message;
		
	}
	

}
