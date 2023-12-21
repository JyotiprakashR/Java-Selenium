package mapConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;

public class MapInterf {

	public static void main(String a[]) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Tom", 20);
		map.put("Hello", 53);
		map.put("Tom", 50);
		map.put("Joe", 53);
		map.put(null, 70);
		map.put(null, 63);

		System.out.println(map);

		System.out.println("---------------");
		map.forEach((e, d) -> System.out.println(e + " : " + d));

		System.out.println("---------------");
		Set<Entry<String, Integer>> setOfEntries = map.entrySet();
		setOfEntries.forEach(e -> System.out.println(e));

		System.out.println("---------------");
		System.out.println(map.get("Tom")); // if key is preset retuns the value

		System.out.println(map.get("Tomm")); // if key is not present, returns null
		System.out.println("---------------");
		Set<String> setOfKeys = map.keySet();
		setOfKeys.forEach(e -> System.out.println(e));
		setOfKeys.removeIf(e -> e == null);
		System.out.println("---------------");
		setOfKeys.forEach(e -> System.out.println(e));

		// map.merge("Lily", 98, );
		System.out.println("---------------");
		Collection<Integer> setOfValues = map.values();
		setOfValues.forEach(e -> System.out.println(e));

		System.out.println("---------------");
		map.replace("Joe", 90);
		System.out.println(map);
		
		System.out.println("---------------");
		map.replace("Joe", 0, 99);
		System.out.println(map);
	}

}
