package restAssuredUtil;

import org.json.JSONObject;
import org.json.XML;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonToXml {

	public static void main(String[] args) {

		Response jsonResponse = RestAssured.given().accept(ContentType.XML).log().all().when().get("https://api.zippopotam.us/IN/500016");

		System.out.println(jsonResponse.asPrettyString());

		String xmlResponse = XML.toString(new JSONObject(jsonResponse.asString()));
		
		System.out.println(xmlResponse);
		
		
		XML xml = new XML();
	}

}
