package interviewQsts;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RandomQstOnString2 {
	public static void main(String[] args) {

		String input = "aaabbtttpppp$$$";
		String output = "a3b2t3p4$3";

		String output1="";
		LinkedHashMap<Character, Integer> map= new LinkedHashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char ch=input.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for(Entry<Character, Integer> entrySet: map.entrySet()) {
			output1=output1+entrySet.getKey().toString()+entrySet.getValue().toString();
		}
		System.out.println(output1);
		
		System.out.println(0.0/0.0); // NaN
		System.out.println(2.0/0.0); // Infinity
		System.out.println(0.1+0.2); // 0.30000000000000004
		System.out.println(0.1+0.4); // 0.5
		System.out.println(2/0.0); // Infinity
		
	}
}
