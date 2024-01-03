package restAssuredUtil;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;

@JsonIgnoreProperties(ignoreUnknown = true)
public class De_Serialize {
	
	
	public static void main(String a[]) {
		
		Response res=RestAssured .given().get("https://api.zippopotam.us/IN/500016");
		System.out.println(res.asPrettyString());
		
		
		De_SerializeClass obj=res.as(De_SerializeClass.class);
		System.out.println(obj.toString());
	}

}
