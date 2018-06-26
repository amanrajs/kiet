package June26;

import java.io.Console;
import java.io.IOException;

public class KeyboardInputDemo1 {

	public static void main(String[] args)throws IOException {
		
		//DataInputStream dis = new DataInputStream(System.in);
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);
		
		//Scanner scan = new Scanner(System.in);
		
		Console c = System.console();
		
		System.out.print("\n\t Enter some string...");
		String str = c.readLine();
		System.out.println("\n\t str = " + str);
		
		System.out.print("\n\t Enter Password :");
		char[] chArr = c.readPassword();
		
		//String pass = new String(chArr);
		String pass = String.valueOf(chArr);
		System.out.println("\n\t Password = " + pass);
	
	}
}
