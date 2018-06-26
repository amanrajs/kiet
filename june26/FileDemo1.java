package June26;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	
	public static void main(String[] args) throws IOException {
		
		File file1 = new File("d:/demoio/pqr.txt");
		
		if(file1.exists()) {
			System.out.println("\n\t File Exists..!");
			if(file1.renameTo(new File("d:/demoio/ab123.txt"))) {
				System.out.println("\n\t File Renamed!...");
			}
		}else {
			
			if(file1.createNewFile()) {
				System.out.println("\n\t New file created..");
			}
			
			//System.out.println("\n\t File Doesn't exists!...");
		}
	}

}
