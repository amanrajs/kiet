package June20;

import java.util.SortedSet;
import java.util.TreeSet;

public class StudentSetDemo {
	public static void main(String[] args) {
		
		SortedSet<Student> studentSet = new TreeSet<>();
		studentSet.add(new Student(101, "Vipul", 45));
		studentSet.add(new Student(102, "Ananya", 75));
		studentSet.add(new Student(103, "Prakhar", 65));
		studentSet.add(new Student(103, "Yogansh", 67));
		studentSet.add(new Student(103, "Charul", 69));
		studentSet.add(new Student(103, "Shubham", 65));
		studentSet.add(new Student(104, "Siddhant", 34));
		studentSet.add(new Student(105, "Sarthak", 85));
		studentSet.add(new Student(106, "Shashwat", 34));

		System.out.println(studentSet);
	}
}
