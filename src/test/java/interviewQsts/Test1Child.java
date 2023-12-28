package interviewQsts;

public class Test1Child extends Test1 {

	Test1Child(){
		method1();
	}
	void method1() {
		System.out.println("Test1Child - method1");
		super.method1();
//		Thread th= new Thread();
//		System.out.println(th.getId()+" "+th.getName());
	}

	void method2() {
		System.out.println("Test1Child - method2");
	}

}
