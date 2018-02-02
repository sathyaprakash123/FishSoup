import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialReader implements java.io.Serializable {

	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		FileInputStream file = new FileInputStream("/Users/sathya/Desktop/SerialKiller.ser");
		ObjectInputStream oj = new ObjectInputStream(file);
		SerialKiller sk = (SerialKiller) oj.readObject();
	    sk.display();
		
	}
	
	
}
