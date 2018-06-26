package June26;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		
		File f1 = new File("d:/demoio2");
		
		if(!f1.exists()) {
			f1.mkdir();
		}
	}
}
