import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncTest implements Runnable{
	String threadName;
	
	 synchronized void display() throws InterruptedException {
	 for(int i=0;i<10;i++)
		{
			System.out.println(threadName + " :"+  i);
			Thread.sleep(100);
		}
		
    }
	
	SyncTest(String threadName)
	{
		this.threadName = threadName;
	}

	@Override
	public void run() {
		
		System.out.println("Running Thread : " + threadName);
		try {
			display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completing Thread : " + threadName);
	}
	
	public static void main(String args[])
	{
		SyncTest s1 = new SyncTest("test1");
		SyncTest s2 = new SyncTest("test2");
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
		
		
	}

}
