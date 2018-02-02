import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsListTest extends Thread{
	
	public void run()
	{
		
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("this is Daemon Thread: "+ Thread.currentThread().getName());
		}
		else
		{
			try {
				display();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public  synchronized void display() throws InterruptedException
	{
		System.out.println("Thread Starting : "+ Thread.currentThread().getName());
		for(int i =0;i<10;i++)
		{
			System.out.println(i);
			Thread.sleep(300);
		}
		System.out.println("Thread Ending : "+ Thread.currentThread().getName());
		
	}
	
	
	
	public static void main(String args[])
	{
		CollectionsListTest ct1 = new CollectionsListTest();
		CollectionsListTest ct2 = new CollectionsListTest();
		CollectionsListTest ct3 = new CollectionsListTest();
		
		ct1.setDaemon(true);
		ct1.start();
		ct2.start();
		ct3.start();
		
		
		
		
	}
	
}
