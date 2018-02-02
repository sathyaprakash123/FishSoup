
public class ThreadWait {
	
	int amount = 10000;
	
	public synchronized void withdraw(int amount)
	{
		System.out.println("Deposit Initiated");
		if (this.amount < amount)
		{
			
			try {
				System.out.println("Waiting for more deposit");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.amount-=amount;
			System.out.println("Withdrawal Completed : " + this.amount);
		}
		
		
	}
	
	public synchronized void deposit(int amount)
	{
		System.out.println("Starting Deposit");
		this.amount+=amount;
		System.out.println("Notifying Withdrawal");
		notify();
		
	}
	
	public static void main(String args[])
	{
		
		final ThreadWait tw = new ThreadWait();
	    new Thread(){ public void run(){tw.withdraw(11000);}}.start();
	    new Thread(){ public void run(){tw.deposit(5000);}}.start();
		
	}
	
	
}
