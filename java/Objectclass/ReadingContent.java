package Objectclass;
import java.io.*;

public class ReadingContent {
	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("C://Users//udhaya//OneDrive//Desktop//Abc.txt/");
				try {
					int val=f.read();
					while(val!=-1)
					{
						System.out.print((char)val);
						val=f.read();
					}
				}
		catch(IOException i)
		{
			System.out.println(i.getMessage());
		}
		 
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

}
}