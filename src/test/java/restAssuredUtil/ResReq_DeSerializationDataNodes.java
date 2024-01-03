package restAssuredUtil;

public class ResReq_DeSerializationDataNodes {
	
	
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
	
	
	@Override
	public String toString() {
		return "ResReq_DeSerializationDataNodes [id=" + id + ", email=" + email + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", avatar=" + avatar + "]";
	}

	public ResReq_DeSerializationDataNodes() {
		
	}

	public ResReq_DeSerializationDataNodes(int id, String email, String first_name, String last_name, String avatar) {
		super();
		this.id = id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.avatar = avatar;
	}


	public int getId() {
		return id;
	}


	public String getEmail() {
		return email;
	}


	public String getFirst_name() {
		return first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public String getAvatar() {
		return avatar;
	}
	
	
	

}
