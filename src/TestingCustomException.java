
public class TestingCustomException  {
	
	int balance; 
	
	public TestingCustomException(int balance)
	{
		this.balance = balance;
		
	}
	
	public void withdraw(int withdrawAmount) throws SuperAmazingException
	{
		if (balance < withdrawAmount)
		{
			
			throw new SuperAmazingException(balance);
		}
		else
		{
			System.out.println("You can have your money sugar");
		}
		
		}
	
	}
