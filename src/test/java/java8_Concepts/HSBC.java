package java8_Concepts;

import java.util.function.Consumer;

import org.testng.annotations.Test;

public class HSBC {

	@Test
	public void test() {
	
//		RBI rbi =name -> System.out.println("hello "+name);
//		rbi.printBankName("HSBC");
		
//		RBI rbi= (int num)->System.out.println("bank number-"+num);
//		rbi.pringBankNumber(789452);
//		
//		// or
//		RBI rbi1= (num)->System.out.println("bank number-"+num);
//		rbi1.pringBankNumber(1111111111);
//		
//		// or
//		RBI rbi2= n->System.out.println("bank number-"+n);
//		rbi2.pringBankNumber(000000);
		
//		or
//		RBI rbi= (a,b)->System.out.println(a+" "+b);
//		rbi.printCusName("Tom", "Jerry");
		
//		or
//		RBI rbi= ()->{return "hello";};
//		rbi.printName();

//		or		
//		RBI rbi= ()->"hello";
//		System.out.println(rbi.printName());

//or		
//		RBI rbi = (name)->{return name.toUpperCase();};
//		rbi.toUpperCase("hello");
		
// or		
//		RBI rbi=(v)->{return v.isBlank();};
//		System.out.println(rbi.isBlank(" "));
		
		
//or
		RBI rbi=(v)->{return v.length();};
		System.out.println(rbi.length(""));
		System.out.println(rbi.length(" "));
		System.out.println(rbi.length("hello"));
		
		
		// In-built Functional Interface--COnsumer
		Consumer<String> con = (v)->{System.out.println(v);};
		con.accept("hello");
		con.andThen(con);
		
		
		// Anonymous inner class of a Abstract class
		Fruits abs= new Fruits() {
			
			@Override
			void print() {
				System.out.println("// TODO Auto-generated method stub");
				
			}
		};
		abs.print();
		
	}		
		
	
}