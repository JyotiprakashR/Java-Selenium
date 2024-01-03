package restAssuredUtil;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class FetchAsMapFromResponse {

	public static void main(String[] args) {
		
		
		Map<Object, Object> jsonMap= RestAssured.get("https://api.zippopotam.us/IN/500016").andReturn().as(Map.class);

		System.out.println(jsonMap);
		
		List<Map<Object, Object>> jsonMap1= RestAssured.get("https://api.zippopotam.us/IN/500016")
				.andReturn()
				//.as(new TypeRef<Map<Object, Object>> (){});
				.as(new TypeRef<List<Map<Object,Object>>> () {});
					//TypeRef<String> typeref= new TypeRef<String>() {};
		
		
		
	}

}
