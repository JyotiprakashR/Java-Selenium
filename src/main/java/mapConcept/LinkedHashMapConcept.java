package mapConcept;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapConcept {

	
	public static void main(String a[]) {
		
		LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("isbn", "9781449325862");
		linkedHashMap.put("title", "Git Pocket Guide");
		linkedHashMap.put("subTitle", "A Working Introduction");
		linkedHashMap.put("author", "Richard E. Silverman");
		linkedHashMap.put("publish_date", "2020-06-04T08:48:39.000Z");

		LinkedHashMap<Object, Object> linkedHashMa1p = new LinkedHashMap<>();
		linkedHashMa1p.put("isbn", "9781449331818");
		linkedHashMa1p.put("title", "Learning JavaScript Design Patterns");
		linkedHashMa1p.put("subTitle", "A JavaScript and jQuery Developer's Guide");
		linkedHashMa1p.put("author", "Addy Osmani");
		linkedHashMa1p.put("publish_date", "2020-06-04T09:11:40.000Z");

		ArrayList<LinkedHashMap<Object, Object>> aryList = new ArrayList<>();
		aryList.add(linkedHashMap);
		aryList.add(linkedHashMa1p);

		// aryList.get(0).forEach((a,b)->System.out.println(a+" : "+b));

		for (int i = 0; i < aryList.size(); i++) {
			LinkedHashMap<Object, Object> listMap = aryList.get(i);
			for (Entry<Object, Object> entry : listMap.entrySet()) {
				System.out.println(entry);
			}
		}
		
		
	}
}
