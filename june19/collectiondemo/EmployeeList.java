package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList();
		Employee emp = new Employee(101, "Vishal", 2300.00);
		empList.add(emp);
		
		empList.add(new Employee(102, "Rahul", 5300.00));
		empList.add(new Employee(103, "Mahesh", 3300.00));
		empList.add(new Employee(104, "Dinesh", 4300.00));
		empList.add(new Employee(105, "Hitesh", 2300.00));
		
		System.out.println(empList);
		
		Collections.sort(empList);
		
		System.out.println("After sort" + empList);
		
		//Collections.sort(empList);
		
	/*	int index = empList.indexOf(new Employee(106, "ddfsd", 2300.00));
		System.out.println("index = " + index);*/
		
		/*System.out.println(empList);
		
		empList.remove(new Employee(103, "Ramesh", 3300.00));
		
		System.out.println("After Remove : " + empList);*/
		
		
	}
}
