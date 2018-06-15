package june14;

import java.util.Date;

public class Employee extends Person {
	
	private int empId;
	private String eName;
	private double salary;
		
	public Employee() {
		super();
		System.out.println("Employee object Created - Default Constructor");
	}

	public Employee(int age, Date dob, int empId, String eName, double salary) {
		super(age, dob);
		this.empId = empId;
		this.eName = eName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static Employee createEmployee(String str) {
		String[] s = str.split(",");
		int id = Integer.parseInt(s[0]);
		String en = s[1];
		double sal = Double.parseDouble(s[2]);
		return new Employee();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
	 
	
}
