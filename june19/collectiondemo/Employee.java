package collectiondemo;

public class Employee implements Comparable<Employee> {
	
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
		return "\n"+ empId + "\t" + eName + "\t" + salary;
	}
	
	public boolean equals(Object obj) {
		Employee another = (Employee)obj;
		
		if(this.empId == another.empId &&
				this.eName.equals(another.eName) &&
				this.salary == another.salary){
			   return true;
			}

			return false;
	}
	
	 public int compareTo(Employee other) {
		 
		 Double firstSalary = this.salary;
		 Double secondSalary = other.salary;
		 
		 return secondSalary.compareTo(firstSalary);
		// return firstSalary.compareTo(secondSalary);
		 
		 /*if(this.salary > other.salary) {
			 return 1;
		 }else if(this.salary == other.salary) {
			 return 0;
		 }else {
			 return -1;
		 }*/
	 }
	
}






