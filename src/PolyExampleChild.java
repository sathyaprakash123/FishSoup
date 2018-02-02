
public class PolyExampleChild extends PolyExampleParent{
	
	public void ParentMethod()
	{
		System.out.println("Over ridden method from inside child class");
		
	}
	
	public static void main(String args[])
	{
		PolyExampleParent par = new PolyExampleChild();
	    par.ParentMethod();
	    PolyExampleParent par1 = new PolyExampleParent();
	    par1.ParentMethod();
	    
	    
	    
	}
	

}
