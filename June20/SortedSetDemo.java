package June20;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
		public static void main(String[] args) {
			
			SortedSet<Integer> numsSet = new TreeSet<>();
			numsSet.addAll(Arrays.asList(2,1,4,3,5,8,7,6,9));
			
			System.out.println("numsSet = " + numsSet);
			
			SortedSet s1 = numsSet.subSet(4, 7);
			System.out.println("s1 = " + s1);
			
			SortedSet s2 = numsSet.headSet(5);
			System.out.println("s2 = " + s2);
		}
}
