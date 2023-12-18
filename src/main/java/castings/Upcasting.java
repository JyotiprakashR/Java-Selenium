package castings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upcasting {

	@Test
	public void test4() {
		Object o= new String("Hello");// Up-Casting
		String s=(String)o;
		StringBuffer sb= (StringBuffer) o; // Class Cast Exception
		System.out.println(sb.reverse());
		
	}

	@Test
	public void test() {
		Parent p = new Child();
		p.PrintData();

//		WebDriver driver= (WebDriver) new ChromeDriver(); // upcasting only
//		driver.get("");
	}

	@Test
	public void test1() { // Up-Casting // child class object can be refered by parent refernce variavle
		Parent p1 = (Parent) new Child();
		Parent p2 = new Child(); // or this line also works
		p1.PrintData();
	}

	@Test
	public void test2() {
		// Down-Casting-Implicitly
		// Child cc=new Parent(); // Type mismatch: cannot convert from Parent to
		// Child--compileTime error
		// Child c=(Child) new Parent(); // java.lang.ClassCastException:
		// class---RunTime Error
		// castings.Parent cannot be cast to class

		Parent p = new Child(); // Up-Casting
		Child c = (Child) p; // Down-Casting-Explicitly
		c.PrintData();
	}
}
