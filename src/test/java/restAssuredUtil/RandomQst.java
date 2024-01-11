package restAssuredUtil;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RandomQst {

	public static void main(String[] args) {


		Response resp=RestAssured
							.given()
								.contentType(ContentType.JSON)
								.auth().basic("", "")
								.body("")
							.when()
								.post("");
		
		resp.getBody().toString().contains("");

	}

}
