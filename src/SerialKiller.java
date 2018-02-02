import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialKiller implements java.io.Serializable
{
    String name;
	int age;
	transient String gender;
	
	public void display()
	{
System.out.println("Name : "+ name + " age : "+ age + " gender : "+ gender);
	}
	
	public static void main(String args[]) throws IOException
	{
		FileOutputStream file = new FileOutputStream("/Users/sathya/Desktop/SerialKiller.ser");
		ObjectOutputStream oj = new ObjectOutputStream(file);
		SerialKiller sk = new SerialKiller();
		sk.name = "sathya";
		sk.age = 36;
		sk.gender = "male";
		oj.writeObject(sk);
		oj.close();
		file.close();
				
		}
	
	
}
