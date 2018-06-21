package june21;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	
	public static void main(String[] args) {
	
		NavigableSet<Employee> empSet = new TreeSet<>();
		
		empSet.add(new Employee(101, "Shubham", 3000));
		empSet.add(new Employee(102, "Vipul", 2000));
		empSet.add(new Employee(103, "Ananya", 4500));
		empSet.add(new Employee(104, "Prakhar", 5000));
		empSet.add(new Employee(105, "Sugam", 4200));
		empSet.add(new Employee(106, "Vikrant", 4300));
		empSet.add(new Employee(107, "Vishal", 5000));
		empSet.add(new Employee(108, "Charul", 5500));
		empSet.add(new Employee(109, "Vyom", 5600));
		
		System.out.println(empSet);
		
		Employee vipul = new Employee(2000);

		
		//show the employee whose salary is higher than employee sugam
		Employee e2 = empSet.higher(vipul);
		System.out.println("greater than vipul :" + e2);
		
		
		//show the employee whose salary is less than employee vipul
		
		Employee e1 = empSet.lower(vipul);
		
		if(e1!=null)
			System.out.println("less than vipul salary = " + e1);
		else 
			System.out.println("no employee whose salary is less than vipul");

	}
}
