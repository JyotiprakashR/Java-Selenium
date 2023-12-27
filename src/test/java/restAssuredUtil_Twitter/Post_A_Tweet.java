package restAssuredUtil_Twitter;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Post_A_Tweet {
	
	
	public static void main(String a[]) {
		
		Response res= RestAssured
				.given()
				.auth()
				.oauth("8xfFbGAp8PwnAFOJVvVkfVf0v",
				"BuxOStOimYlP8GwZvVKTUU3uM6RhJ0LzIFRFBAJEtmK3PCD9iV",
				"701026311972622336-LmvP4uYsM5Vw5w8xqmIp3BvJg5ub6m6",
				"D0QxkCNL5qyZBizgwncjbcFU4oJVOkrqOzYKNPRZWnsbF")
				.post("https://api.twitter.com/2/tweets?text=Hello");
		
		System.out.println(res.asPrettyString());
		
		JsonPath jsonPath= res.jsonPath();
		jsonPath.get("strID");
	}

}



