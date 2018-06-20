package June20;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
	public static void main(String[] args) {
		
		Set<String> namesSet = new TreeSet<>();
		namesSet.add("Vishal");
		namesSet.add("Sunil");
		namesSet.add("Mahesh");
		namesSet.add("Dinesh");
		namesSet.add("Anil");
		namesSet.add("Rahul");
		namesSet.add("Manoj");
		namesSet.add("Priyanka");
		
		System.out.println("\n\t NamesSet = "+ namesSet);
	}
}
