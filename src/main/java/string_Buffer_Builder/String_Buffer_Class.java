package string_Buffer_Builder;

import java.util.Scanner;

public class String_Buffer_Class {
	
	
	public static void main(String a[]) {
		
		String s=new String("Hello");
		String s1=new String("Hello");
		
// 	Immutability & Mutability
		// String is immutable. ie.once a string is declared, we can't change the value
		// StringBuffer is muttable. i.e. once a StringBuffer is declared, we can change the value
		String str= new String("We");// here "we" is stored inside a object
		str.concat(" are"); // O/P--We ==>here we re concatinating this "are" to the str object, as String is immutable, JVM will create one more object.
							// & we should catch the reference, else that object will be gone for Garbage collection
		System.out.println(str);
		// Instead, if we are storing in the same "str"/previous object reference then we can get the new value
		// str=str.concat(str); //We are
		
		StringBuffer sbr= new StringBuffer("We");
		sbr.append(" are");
		System.out.println("sbr--"+sbr);// we will get "We are" as StringBuffer objects are muttable so we can add/modify
		
		
// 	EQUALS() & == Operator
		// In String equals() is overridden from Object class which is used for Content comparison
		// Object Class's equals() is for reference comparison
		System.out.println(s1==s); // Reference comparison--False
		System.out.println(s.equals(s1)); // Content comparison--True
		
		// In StringBuffer class equals() is not overridden
		// so, when using equals() for StringBuffer object, reference comparison being done
		StringBuffer sb= new StringBuffer("Hello");
		StringBuffer sb1= new StringBuffer("Hello");
		System.out.println(sb==sb1); // false
		System.out.println(sb.equals(sb1)); // false
		
		
		String string = new String("Joe"); // It creates 2 objects inside heap area //1-Inside heap area, "string" is refered to this. 
																// 2-one more will be created in SCP area which will be managed by JVM & thsis object is not part of garbage collection
		String ss="Ben";
		
		System.out.println(string+" : "+ss);
		

// 		String 
		String strrr= new String();
		
		char[] ch= {'J','a','v','a'}; 
		String strng= new String(ch); // for the given char[], creates an equivalent string object
		System.out.println(strng); //Java
		
		byte[] by= {97,98,99,100}; // the range of byte is -128 to 127
		String sBy= new String(by); // creates an equvalent string/char from the given byte
		System.out.println(sBy); //abcd
		
		
		byte b=97;
		System.out.println(b);
		
		
		String name="Durga";
		
		char char_At=name.charAt(0);
		System.out.println(char_At); // D
		
		name=name.concat(" Sir");
		System.out.println(name); // Durga Sir
		
		System.out.println(name.equals(a)); // false
		
		System.out.println(name.isEmpty()); /// it checks the length of the given string // false
		
		
		System.out.println(name.isBlank()); // false
		
		System.out.println("".isEmpty()); // Prints - true
		System.out.println(" ".isEmpty()); //Prints - false
		System.out.println("--------------------1");
		System.out.println("\t".isEmpty());
		System.out.println("\t".isBlank());
		
		System.out.println("--------------------2");
		System.out.println("\n".isEmpty());
		System.out.println("\n".isBlank());
		
		System.out.println("--------------------3");
		System.out.println("\r".isEmpty());
		System.out.println("\r".isBlank());
		
		System.out.println("--------------------4");
		System.out.println("\f".isEmpty());
		System.out.println("\f".isBlank());
		
		System.out.println("--------------------5");
		System.out.println("\\".isEmpty()); //  Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		System.out.println("\\".isBlank());
	
		
		System.out.println(name.length());
		
		System.out.println(name.replace(' ', '$').toString());
		
		String strValue = "This is a test string. test";
		System.out.println(strValue.replace('s', '&')); // takes character
		
		System.out.println(strValue.replaceAll("test", "example")); // only takes string
		System.out.println(strValue.replaceFirst("test", "example1")); // only takes string
		
		String strA="daa";
		System.out.println(strA.replace("aa", "b"));
		
		
		System.out.println(strValue.substring(3));
		System.out.println(strValue.substring(3, 7));
		
		System.out.println(strA.lastIndexOf(97)); // takes int value & return the last char, if the respective char is present
		System.out.println(strA.indexOf(100));// takes int value & return the first char, if the respective char is present
		
		System.out.println(strA.indexOf("a"));
		System.out.println(strA.lastIndexOf("a"));
		
		String name1="Jyoti prakash routa";
		System.out.println(name1.length());
		System.out.println(name1.lastIndexOf(97));
		System.out.println(name1.lastIndexOf(97, 7));
		
		System.out.println(name1.indexOf(97, 11));
		System.out.println(name1.indexOf(97));
		
		Scanner sca= new Scanner(System.in);
//		System.out.println("Enter your city name: ");
//		String enteredName=sca.nextLine();
//		System.out.println("you entered : "+enteredName);
//		sca.close();
		
//		Scanner sca1= new Scanner(System.in);
//		System.out.println("Enter name:--");
//		String namE=sca1.nextLine();
//		System.out.println("Enter age:--");
//		int agE=sca1.nextInt();
//		System.out.println("Enter salary:--");
//		double salarY= sca1.nextDouble();
//		
//		System.out.println("You entered following details, please verify. press yes to continue\nName"+" : "+namE+"\nAge"+" : "+agE+"\nSalary"+" : "+salarY);
//		
//		System.out.println("Type yes or no to continue--");
//		String flag= sca1.nextLine();
//		System.out.println(flag);
//		sca.close();
		
		System.out.println("-----------------------------------------------------------");
		
		String st=new String("tom");
		String st2=st.toUpperCase();// due to runtime operation, a new object got created& will be ket in heap area
		String st3=st.toLowerCase(); // due to runtime operation, no change in the object, reference will be re-used
		System.out.println(st2==st); // false
		System.out.println(st3==st); //true
		
		
		System.out.println("-----------------------------------------------------------");
		
		String st5="joe";
		String st6=st5.toString(); // as there is no change in the content same content is re-used even in SCP & heap area
		String st7=st5.toLowerCase();// as there is no change in the content same content is re-used even in SCP & heap area
		String st8=st5.toUpperCase(); // as there is a change in the content, new object will be stored in heap area
		System.out.println(st5==st6); // true
		System.out.println(st5==st7); // true
		System.out.println(st5==st8);// false
		System.out.println("-----------------------------------------------------------");
		System.out.println(" ".isEmpty());
		
		
	}
	
	

}
