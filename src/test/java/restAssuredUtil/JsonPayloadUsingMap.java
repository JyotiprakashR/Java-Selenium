package restAssuredUtil;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

public class JsonPayloadUsingMap {

	public static void main(String[] args) {

		HashMap<String, Object> jsonMap=new HashMap<>();
		
		jsonMap.put("name", "Tom");
		jsonMap.put("id", 20);
		
		ObjectMapper objMapper= new ObjectMapper();
		String jsonPayload=null;
		try {
			jsonPayload=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonMap);
			System.out.println(jsonPayload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		RestAssured.given().log().all().body(jsonPayload).get();
	}

}
