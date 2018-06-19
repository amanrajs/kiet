package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NamesList {
	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<>(Arrays.asList("Suresh","Mahesh","Dinesh","Rajesh","Ajay", "Sujay", "Anil", "Sunil"));
	
		System.out.println("Before Sort :" + namesList);
		
		Collections.sort(namesList);
		
		System.out.println("After Sort :" + namesList);

		
		/*System.out.println("using classic for loop...");
		for(int i=0; i<namesList.size(); i++) {
			String name = namesList.get(i);
			System.out.println(name);
		}
		
		System.out.println("\n\nusing enhanced for loop");
		for(String name: namesList) {
			System.out.println(name);
		}*/
		
		/*System.out.println("\n\nusing iterator");
		Iterator<String> itr = namesList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
/*		System.out.println("\n\t using lamda expressions");
		namesList.forEach( name -> System.out.println(name));*/

	}
}




