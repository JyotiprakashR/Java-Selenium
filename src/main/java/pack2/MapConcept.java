package pack2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {

	
	public static void main(String a[]) {
	Map<String, Integer> map = new HashMap<>();
	map.put("ABC", 20);
	map.put("DEF", 23);
	
	System.out.println(map.containsKey("ABC"));
	System.out.println(map.containsValue(20));
	Set<Entry<String, Integer>> setEntry=map.entrySet();
	setEntry.iterator();
	
	
	}
}
