package collectionFramework;

public class ListInterfCustomClass {
	
	
	String fName;
	String lName;
	int age;
	
	public ListInterfCustomClass(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public ListInterfCustomClass(){
		
	}

	@Override
	public String toString() {
		return "ListInterfCustomClass [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}

}
