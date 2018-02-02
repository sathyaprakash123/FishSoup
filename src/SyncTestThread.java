
public class SyncTestThread extends Thread{
	
	SyncTestClass sss;
	
	SyncTestThread(SyncTestClass scc) throws InterruptedException
	{
		sss = scc;    
		
	}
	
	public void run()
	{
		System.out.println("----- Starting Thread :" + Thread.currentThread().getName());
		try {
			sss.displayDescend();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("&&&&&&& Ending  Thread :" + Thread.currentThread().getName());
		
	}
	
	public static void main(String args[]) throws InterruptedException
	{

		SyncTestClass stc = new SyncTestClass(5);
		
		SyncTestThread stt1 = new SyncTestThread(stc);
		SyncTestThread stt2 = new SyncTestThread(stc);
		
		stt1.start();
		stt2.start();
		
		
		
	}
	

}
