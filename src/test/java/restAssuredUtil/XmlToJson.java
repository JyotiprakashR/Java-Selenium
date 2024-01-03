package restAssuredUtil;

import org.json.JSONObject;
import org.json.XML;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class XmlToJson {

	public static void main(String[] args) {

		Response res = RestAssured.given().accept(ContentType.JSON).get("https://api.zippopotam.us/IN/500016");

		JSONObject jsObject = new JSONObject(res.asString());

		String xmlBody = XML.toString(jsObject);
		System.out.println(xmlBody);
		
		// XML to JSON
	
//		JSONObject jsonObject= XML.toJSONObject(xmlBody);
//		System.out.println(jsonObject.toString());

	}

}
