package June20;

public class Demo {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Vipul", 1000);
		Employee e2 = new Employee(102, "Vipul", 1200);
		Employee e3 = new Employee(103, "Ramesh", 1000);
		Employee e4 = new Employee(104, "Mahesh", 1000);
		Employee e5 = new Employee(105, "Manoj", 1000);


		System.out.println("e1 hashCode = " + e1.hashCode());
		System.out.println("e2 hashCode = " + e2.hashCode());
		System.out.println("e3 hashCode = " + e3.hashCode());
		System.out.println("e4 hashCode = " + e4.hashCode());
		System.out.println("e5 hashCode = " + e5.hashCode());
	}
}
