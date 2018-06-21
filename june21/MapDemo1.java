package june21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		
		mapHttpErrors.put(404, "Page Not Found");
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(500, "Internal Server Error");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(303, "This is new Value");
		
		System.out.println(mapHttpErrors);
		String errormsg = mapHttpErrors.get(500);
		System.out.println("errormsg for errorcode 500 = " + errormsg);
		
		/*if(mapHttpErrors.containsKey(303)) {
			System.out.println("Key is found");
		}else {
			System.out.println("not found");
		}*/
		
		/*Set<Integer> keyset = mapHttpErrors.keySet();
		
		for(Integer key : keyset) {
			String value = mapHttpErrors.get(key);
			System.out.println("key = " + key + "\tvalue = " + value);
		}*/
		
		/*Collection<String> col = 	mapHttpErrors.values();
		for(String str : col) {
			System.out.println(str);
		}*/
		
		Set<Map.Entry<Integer, String>> entries = mapHttpErrors.entrySet();
		for(Map.Entry<Integer, String> entry : entries) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key = " + key + "\tvalue = " + value);
		}
	}
}





