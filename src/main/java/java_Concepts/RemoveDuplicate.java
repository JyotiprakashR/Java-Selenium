package java_Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String value="welcome to home far";
		String newValue="";
		List<Character> list= new ArrayList<>();
		char[] chArr=value.toCharArray();
		for(char ch:chArr) {
			list.add(ch);
		}
		System.out.println(list);
		List<Character> newList= list.stream().distinct().toList();
		System.out.println(newList);
		for(char ch:newList) {
			newValue+=ch;
		}
		System.out.println(newValue);
		
		Set<Character> set= new LinkedHashSet<>(list);
		System.out.println(set);
		
		String ss=StringUtils.capitalize(value);
		System.out.println(ss);
	}
}
