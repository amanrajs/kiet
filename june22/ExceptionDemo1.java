package June22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {	
			System.out.println("Enter your age : ");
			int age = scan.nextInt();
		
			if(age<=0 || age>=100) {
				
				throw new InvalidAgeException("Invalid age");

			}else if(age>0 && age<=18) {
				throw new NotEligibleForLicenceException("you are not eligible for driving licence");
			}
			System.out.println("\n\t Your Age is " + age);
		}
		catch(InputMismatchException e) {
			System.out.println("Input is not correct..only number are allowed");
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex);
		}
		catch(NotEligibleForLicenceException ex) {
			System.out.println(ex);
		}
		
	}
}
