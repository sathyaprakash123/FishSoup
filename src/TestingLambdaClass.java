
public class TestingLambdaClass implements Cloneable{
	
	String name;
	int age;
	
	public void setNameAge(String name, int age)
	{
		this.name =name;
		this.age = age;
		
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		
		return super.clone();
	}
	
	public static void main(String args[]) throws CloneNotSupportedException
	{
	
		TestingLambdaClass tlc = new TestingLambdaClass();
		tlc.setNameAge("sathya", 45);
		TestingLambdaClass tlcclone =  (TestingLambdaClass) tlc.clone();
		
		
		
		
		
	}
}
