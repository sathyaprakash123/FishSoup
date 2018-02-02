
public class WorkersThreadClass implements Runnable {
	
	String threadName;
	
	WorkersThreadClass(String threadName)
	{
		
	     this.threadName= threadName;
	}

	@Override
	public void run() {
		
		System.out.println("Starting Worker : "+ threadName);
		try {
			actualJob();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
		System.out.println("Stopping Worker thread : "+ threadName);
	}
	
	public void actualJob() throws InterruptedException
	{
		Thread.sleep(5000);
		
	}

}
