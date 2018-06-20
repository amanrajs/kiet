package June20;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.getName().compareTo(c2.getName());
	}
	
}
