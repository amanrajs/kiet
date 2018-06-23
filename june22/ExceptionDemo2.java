package June22;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int n3 = Integer.parseInt(args[2]);
			
			int result = n1/n2;
			System.out.println("result = " + result);
			System.out.println("End of Program");
		}
		catch(NumberFormatException ex) {
			ex.printStackTrace();
		}
		
	}
}
