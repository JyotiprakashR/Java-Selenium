package collectionFramework;

public class QueueInterfCustomClass {

	
	String fName;
	String lName;
	int age;
	
	public QueueInterfCustomClass(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		
	}

	public QueueInterfCustomClass(){
		
	}

	@Override
	public String toString() {
		return "ListInterfCustomClass [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}

}
