package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductList {
	public static void main(String[] args) {
		
		List<Product> prodList = new ArrayList<>();
		
		prodList.add(new Product(34534, "Samsung S9+", 70000.00));
		prodList.add(new Product(23422, "Moto G10", 12000.00));
		prodList.add(new Product(11223, "Google Pixel", 9800.00));
		prodList.add(new Product(44332, "Samsung J7 Pro", 43000.00));
		prodList.add(new Product(33223, "RedMe", 12000.00));
		prodList.add(new Product(12456, "Motorola S223", 32000.00));
		
		System.out.println("sort by id...");
		Collections.sort(prodList, new ProductIDComparator());
		System.out.println(prodList);
		
		System.out.println("sort by price...");
		Collections.sort(prodList, new PriceComparator());
		System.out.println(prodList);

	}
}
