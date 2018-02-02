public class SubClass extends ParentClass{
	
	String name = "surya";
	int age = 44;
	
	public void display()
	{
		super.display();
		System.out.println("from inside subclass");
		System.out.println("Name : "+ name + " age : "+ age);
		
	}
	
	public static void main(String args[])
	{
		SubClass ss = new SubClass();
		ss.display();
		
				
	}
			
}
