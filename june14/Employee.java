package june14;

public class Employee {
	
	private int empId;
	private String eName;
	private double salary;
		
	public Employee() {
		super();
	}

	public Employee(int empId, String eName, double salary) {
		super();
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
		return new Employee(id, en, sal);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
	 
	
}
