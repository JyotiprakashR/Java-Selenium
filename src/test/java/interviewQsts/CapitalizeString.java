package interviewQsts;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class CapitalizeString {

	public static void main(String[] args) {
		
		String name="jyotiprakash rout";
		name=StringUtils.capitalize(name);
		System.out.println(name);
		
		// make upper case of the first letter from each word
		String name1="jyotiprakash rout";
		String name2="";
		String[] strArr=name1.split(" ");
		for(String str:strArr) {
			name2=name2+StringUtils.capitalize(str)+" ";
		}
		System.out.println(name2.trim());
		
		// count number of upper case letters are present
		int counter=0;
		List<Character> list= new ArrayList<>();
		for(int i=0; i<name2.length(); i++) {
			if(name2.charAt(i)>'A' && name2.charAt(i)<'Z') {
				list.add(name2.charAt(i));
				counter++;
			}
		}
		System.out.println(counter);
		System.out.println(list);
		
	
		
		boolean flag=name2.indexOf("pra")!=-1;
		
		
	}

}
