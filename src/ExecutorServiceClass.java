import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClass {
	
	public static void main(String args[])
	{
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i =0;i<10;i++)
		{
			Runnable worker = new WorkersThreadClass("Thread-"+i);
			executor.execute(worker);
		}
		
		
	}
	

}
