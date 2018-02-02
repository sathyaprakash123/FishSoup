import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JollyGood {

	public static void main(String args[])
	{
		
		
		Integer occurence = 0;
		HashSet<Integer> x = new HashSet();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
	    LinkedList<Integer> alist = new LinkedList<Integer>();
	    alist.add(2);
		alist.add(2);
		alist.add(7);
		alist.add(7);
		alist.add(7);
		alist.add(7);
		alist.add(7);
		alist.add(8);
		alist.add(9);
		alist.add(3);
		alist.add(1);
		alist.add(1);
		
		x.addAll(alist);
		
		for (Integer ss :x )
		{
			System.out.println(ss);
			
		}
		
		for(Integer x1 : x)
		{
			occurence = 0;
			for(Integer x2: alist)
			{
				if (x1 == x2)
				{
					occurence ++;
					
				}
				
				hm.put(x1, occurence.toString());
				
				
			}
			
		}
			
			for (Map.Entry e : hm.entrySet())
			{
				System.out.println("Occurence of "+ e.getKey() + " is : "+ e.getValue());
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	

