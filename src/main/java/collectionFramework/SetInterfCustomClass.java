package collectionFramework;

public class SetInterfCustomClass {

	String fName;
	String lName;
	int age;

	public SetInterfCustomClass(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "SetInterfCustomClass [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
//	}

	public SetInterfCustomClass() {

	}

	@Override
	public String toString() {
		return "SetInterfCustomClass [fName=" + fName + ", lName=" + lName + ", age=" + age + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
