package June26;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		
		File myDir1 = new File("d:/demoio");
		//listAllFilesDirectories(myDir1);
		listAllFiles(myDir1);
		
	}
	
	public static void listAllFilesDirectories(File dir) {
		if(dir.isDirectory()) {
			String[] filename = dir.list();
			for(String name : filename) {
				System.out.println(name);
			}
			
		}
	}
	
	public static void listAllFiles(File dir) {
		if(dir.isDirectory()) {
			
			File[] fileArr = dir.listFiles();
			for(File f : fileArr) {
				
				if(f.isFile())
					System.out.println(f.getName());	
				
			}
			
		}
	}
}





