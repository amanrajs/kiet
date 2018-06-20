package June20;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
	public static void main(String[] args) {
		
		Set<Customer> customerSet = new TreeSet<>(new CustomerNameComparator());
		
		customerSet.add(new Customer(1043L, "Vishal", "9850810100"));
		customerSet.add(new Customer(1042L, "Prasad", "9988776655"));
		customerSet.add(new Customer(1041L, "Vilas", "9867588885"));
		customerSet.add(new Customer(1040L, "Mahesh", "9098765454"));
		customerSet.add(new Customer(1042L, "Prasad", "9988776655"));

		System.out.println(customerSet);
	}
}
