import java.util.Enumeration;
import java.util.Vector;
import javax.lang.model.util.Elements;
public class AllinoneClass {
	
	public static void main(String args[])
	
	{
		Vector v6 = new Vector();
		v6.add("sathya");
		v6.addElement(5);
		v6.add(6.7);
		v6.add(true);
		
		Enumeration e = v6.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
		}
	}
