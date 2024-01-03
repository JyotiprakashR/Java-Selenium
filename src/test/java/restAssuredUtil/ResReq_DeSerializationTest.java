package restAssuredUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResReq_DeSerializationTest {

	public static void main(String[] args) {
		
		
		Response res=RestAssured.given().get("https://reqres.in/api/users");
		System.out.println(res.asPrettyString());
		ResReq_DeSerialization obj=res.as(ResReq_DeSerialization.class);
		System.out.println(obj.toString());
	}

}
