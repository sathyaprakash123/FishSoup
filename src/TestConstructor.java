
public class TestConstructor {
	
  TestConstructor()
  {
	  System.out.println("Inside non parameterized constructor");
	  
  }
  
  
  TestConstructor(String val)
  {
	  this();
	  System.out.println("Inside Parameterized constructor with value : " + val);
	  
  }
  
  TestConstructor(int x)
  {
	  this("hello");
	  System.out.println("Inside integer parameter constructor :" + x);
	
}
	
	public static void main(String args[])
	{
		TestConstructor tt = new TestConstructor(6);
		
	}
  

}
