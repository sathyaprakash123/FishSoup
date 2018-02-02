
public class SyncTestClass {
	
	int turns;
	
	SyncTestClass( int x)
	{
		this.turns = x ;
		
	}
	
	synchronized public void  displayDescend() throws InterruptedException
	{
		
		for(int i=0;i<turns;i++)
		{
			System.out.println(i);
			Thread.sleep(100);
			
		}
		
	}
	

}
