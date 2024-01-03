package restAssuredUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

//import org.w3c.dom.Document;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandleDynamicResponse {

	public static void main(String[] args) {

		Map<Object, Object> jsonMap = RestAssured.get("https://api.zippopotam.us/IN/500016").andReturn().as(Map.class);
		System.out.println(jsonMap);

		Response response = RestAssured.given().get("https://run.mocky.io/v3/4a2ba5e1-7a80-40e2-bb99-d0cf9d2e95f3");
		if (response instanceof Map) {
			Map mapjson = response.as(Map.class);
			System.out.println(mapjson);
		} else if (response instanceof List) {
			List listJson = response.as(List.class);
			System.out.println(listJson);
		}

	}

	public static void dummy() {
		
		Thread.currentThread().getId();
		
		ThreadLocal<Object> threadLocal = new ThreadLocal<>();
		//threadLocal.get().
	} 
	
	

}
