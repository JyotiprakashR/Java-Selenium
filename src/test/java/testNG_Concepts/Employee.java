package testNG_Concepts;

public class Employee {

	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	// will this Employee class object else where
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

}
