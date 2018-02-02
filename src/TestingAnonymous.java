
public class TestingAnonymous {
	
	public static void main(String args[])
	{
		new Thread(){public void run(){System.out.println("hello");}}.start();
		
		
	}

}
