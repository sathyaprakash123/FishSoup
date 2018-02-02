
public class SuperAmazingException extends Exception{
	
	int amount; 
	
	SuperAmazingException(int amount)
	{
		this.amount = amount - 5000;
		
	}
	
	public String getMessage1()
	{
		
		 System.err.println("you are scraping your minimum balance by : " + amount + ",bitch!");
		 return "Superb exception mate";
	}
	}
