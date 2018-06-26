package June26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("d:/demoio/xyz321.txt");
				
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis, "UNICODE");
		
		//FileReader reader = new FileReader(f);
		
		int data;
		
		while( (data = isr.read()) != -1) {
			System.out.print((char)data);
		}
		
		/*char[] charr = new char[100];
		reader.read(charr, 0, 10);
		String data = String.valueOf(charr);
		System.out.println(data);*/
		isr.close();
	}
	
}
