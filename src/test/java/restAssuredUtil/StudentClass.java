package restAssuredUtil;

public class StudentClass {

	private String firstName;
	private String lastName;
	private String rollNo;
	private String standard;
	private String[] names;


	public StudentClass() {

	}
	
	public StudentClass(String firstName, String lastName, String rollNo, String standard) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.standard = standard;
	}
	
	public StudentClass(String firstName, String lastName, String rollNo, String standard, String[] names) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.standard = standard;
		this.names = names;
	}

	public String[] getNames() {
		return names;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getStandard() {
		return standard;
	}
	
	@Override
	public String toString() {
		return "StudentClass [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo + ", standard="
				+ standard + "]";
	}

}
