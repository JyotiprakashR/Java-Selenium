package restAssuredUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteCustomerDetails {
	
	
	public static void main(String a[]) {
		
		RestAssured.given().delete("http://localhost:3000/employees/gMG1sy0").then().log().everything();
		//System.out.println(res.asPrettyString());
	}

}
