package restAssuredUtil;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostCall {

	@Test
	public void main() {

		HashMap<String, String> map = new HashMap<>();
		map.put("id", "16");
		map.put("title", "Rest Assured Automation");
		map.put("author", "By me");

		JSONObject json = new JSONObject(map);

		Response res = RestAssured
									.given()
									.auth().basic("", "")
									.header("Content-Type", "application/json")
									.body(json)
									.post("http://localhost:3000/posts");

		System.out.println(res.asPrettyString());
		
		JsonPath jsonPath= res.jsonPath();
		
		jsonPath.get();
		

		assertEquals(res.getStatusCode(), 201);

		
		RestAssured.authentication= RestAssured.basic("", "");
	}
}
