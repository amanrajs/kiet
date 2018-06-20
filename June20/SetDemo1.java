package June20;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
	public static void main(String[] args) {
		
		Set<Integer> numsSet = new LinkedHashSet<>();
		numsSet.add(10);
		numsSet.add(21);
		System.out.println(numsSet.add(32));
		numsSet.add(54);
		numsSet.add(2);
		numsSet.add(33);
		numsSet.add(4);
		
		//System.out.println("\n\t numsSet :" + numsSet);
		/*for(int num : numsSet) {
			System.out.println(num);
		}*/
		
		/*Iterator<Integer> itr = numsSet.iterator();
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}*/
		
		numsSet.forEach(num -> System.out.println(num));
	}
}








