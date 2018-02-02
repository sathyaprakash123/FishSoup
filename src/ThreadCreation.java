
public class ThreadCreation implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Running : " + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread Completed");
	}
	
	public static void main(String args[])
	{
		
		ThreadCreation tc = new ThreadCreation();
	    Thread tt = new Thread(tc);
	    tt.start();
	    ThreadCreation tc1 = new ThreadCreation();
	    Thread tt1 = new Thread(tc1);
	    tt1.start();
		
	}
	
	

}
