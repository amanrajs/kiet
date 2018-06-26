package June26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:/demoio/pqr123.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter writer = new OutputStreamWriter(fos, "UNICODE");
		
		//FileWriter writer = new FileWriter(f);
		
		writer.write("Helloworld!.. welcome to KIET..");
		writer.close();
	}
}
