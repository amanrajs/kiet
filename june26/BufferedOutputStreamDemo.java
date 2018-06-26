package June26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		
		String inFileName = "d:/demoio/p1.jpg";
		String outFileName = "d:/demoio/p2.jpg";
		
		File inFile = new File(inFileName);
		File outFile = new File(outFileName);
		
		long startTime, elapsedTime;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(inFile);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(outFile);
			bos = new BufferedOutputStream(fos);
			
			System.out.println("\n\t File Size : "+ inFile.length() + " bytes" );
			
			startTime = System.nanoTime();
			
			int data;
			while( (data = bis.read()) != -1 ) {
				bos.write(data);
			}
			
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("\n\t Total Time : " + (elapsedTime/100000) + " seconds");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
		try {
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
