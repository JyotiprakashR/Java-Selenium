package restAssuredUtil;

import static io.restassured.RestAssured.*;

import com.google.gson.JsonObject;

import  io.restassured.response.*;

public class Basics {

	public static void main(String a[]) {

		Response res = get("https://reqres.in/api/users/2");
		System.out.println(res.asPrettyString());
		
		JsonObject jso= new JsonObject();
		
		
	}

}
