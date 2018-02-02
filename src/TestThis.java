public class TestThis {
	
	int age;
	String name;
	
	
	TestThis(TestThis th)
	{
		System.out.println("Name : "+ th.name + " age :"+ th.age);
		
	}
	
	TestThis(String name , int age)
	{
		
		this.name = name;
		this.age = age;
		
	}
	
	public static void main(String args[])
	{
		TestThis ts= new TestThis("sathya", 37);
		TestThis tt= new TestThis(ts);
		
	}
	
	}
