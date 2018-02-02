import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String args[]) throws IOException
	{
		File file = new File("/Users/sathya/Desktop/walkers_test_image.jpg");
		FileInputStream fl = new FileInputStream(file);
		File file1 = new File("/Users/sathya/Desktop/walkers123.jpg");
		FileOutputStream f2 = new FileOutputStream(file1);
		
		int buffer;
		
		while((buffer = fl.read()) != -1)
		{
			f2.write(buffer);
			
		}
		System.out.println("Writing done");
		fl.close();
		f2.close();
		
		
		}

}
