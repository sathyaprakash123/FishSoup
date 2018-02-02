
public class ThreadInterface extends Thread{
	
	public static void main(String args[])
	{
		
		
		ThreadInterface tc = new ThreadInterface();
		tc.start();
	}
	
	public void run()
	{
		System.out.println("Thread Started");
		
	}
	

}
