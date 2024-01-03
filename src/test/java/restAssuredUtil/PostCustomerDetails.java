package restAssuredUtil;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostCustomerDetails {

	public static void main(String[] args) {
		
		// 1st approach
		String body="{\r\n"
				+ "    \"id\": \"7\",\r\n"
				+ "    \"first_name\": \"Ben\",\r\n"
				+ "    \"last_name\": \"Folkes\",\r\n"
				+ "    \"email\": \"random@hotmail.com\",\r\n"
				+ "    \"gender\": \"Male\",\r\n"
				+ "    \"ip_address\": \"00.12.56.78\"\r\n"
				+ "}";
		
		RestAssured.given()
							.log().everything().when().body(body).log().everything()
							.post("http://localhost:3000/employees").then().log().everything();
		//System.out.println(resp.getStatusCode());
		
		Response res1=RestAssured.given().baseUri("http://localhost:3000").basePath("/employees").queryParam("id", 7).get();
		System.out.println(res1.asPrettyString());
	}
	
	@Test
	public void readJsonFromFile() {
		
	}
	
	// 1st approach
	
	
}
