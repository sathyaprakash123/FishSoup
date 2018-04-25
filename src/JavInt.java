import java.util.Scanner;

public interface JavInt {
	
	static void superman()
	{
		System.out.println("From inside interface");
		
	}
	
	default void superwoman()
	{
		System.out.println("From inside default method");
	}
	
	

}
