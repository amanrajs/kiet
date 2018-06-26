package June26;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("d:/demoio/a1.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String data = "Hi, This is FOS demo";
		bos.write(data.getBytes());
		
		bos.close();
	}
}
