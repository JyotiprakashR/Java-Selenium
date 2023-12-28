package restAssuredUtil;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostCall {

	@Test
	public void main() {

		HashMap<String, String> jsonMap = new HashMap<>();
		jsonMap.put("id", "16");
		jsonMap.put("title", "Rest Assured Automation");
		jsonMap.put("author", "By me");

		JSONObject json = new JSONObject(jsonMap);

		Response res = RestAssured
									.given()
//									.auth()
//									.preemptive()
//									.basic("", "")
									.header("Content-Type", "application/json")
									.body(jsonMap)
									.post("http://localhost:3000/posts");

		System.out.println(res.asPrettyString());
		
		List jsonPath= res.getBody().as(List.class);
		
		System.out.println(jsonPath.size());
		
		

		assertEquals(res.getStatusCode(), 201);

		
		RestAssured.authentication= RestAssured.basic("", "");
	}
}
