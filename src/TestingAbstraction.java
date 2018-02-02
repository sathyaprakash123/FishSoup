
public class TestingAbstraction extends AbstractionTest {
	
	public void AbstractMethod()
	{
		System.out.println("From inside the extended class");
		
	}
	
	public static void main(String args[])
	{
		TestingAbstraction tt = new TestingAbstraction();
	    tt.AbstractMethod();
		
	}
	
	

}
