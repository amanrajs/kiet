package collectiondemo;

import java.util.Comparator;

public class ProductIDComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		
		Integer p1Id = p1.getProductId();
		Integer p2Id = p2.getProductId();
		
		return p1Id.compareTo(p2Id);
	}
	
}
