
public class TestingExceptionCustom {
	
	public static void validate(int x)
	{
		if (x<5000)
		{
			try {
				throw new TestingNewException("Below Minimum Balance");
			} catch (TestingNewException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else 
			
		{
			System.out.println("Okay you are good to go");
		}
		
	}
	
	public static void main(String args[])
	{
		validate(3000);
		
	}
	

}
