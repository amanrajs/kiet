package collectiondemo;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		
		Double price1 = p1.getPrice();
		Double price2 = p2.getPrice();
		
		return price1.compareTo(price2);
	}
}
