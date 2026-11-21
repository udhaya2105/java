package Objectclass;
import java.io.*;
public class WritingOperationOnfile {

	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("C://Users//udhaya//OneDrive//Desktop//Abc.txt/");
			PrintWriter p=new PrintWriter(f);
			p.print('U');
			p.print('d');
			p.print('h');
			p.print('a');
			p.print('y');
			p.print('a');
			p.flush();
		}
catch(FileNotFoundException r)
		{
	System.out.println(r.toString());
		}
	}

}
