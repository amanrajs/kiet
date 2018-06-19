package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
	public static void main(String[] args) {
		
		List<Integer> numsList1 = new LinkedList<>();
		
		numsList1.add(11);
		numsList1.add(2);
		numsList1.add(3);
		numsList1.add(20);
		numsList1.add(34); 
		numsList1.add(22);
		numsList1.add(4);
		
		System.out.println("Before Shuffle " + numsList1);
		
		Collections.shuffle(numsList1);
		
		System.out.println("After Shuffle " + numsList1);

		
		/*if(numsList1.contains(432)) {
			System.out.println("432 is found");
		}else {
			System.out.println("432 is not found");
		}
			
		System.out.println("Elements of list = " + numsList1);

	 
		numsList1.remove(new Integer(20));
		
		System.out.println("After remove = " + numsList1);*/
	}
}
