package restAssuredUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetCall {

	@Test
	public static void main() {

		Response res = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");

		System.out.println(res.asPrettyString());
		System.out.println("Response Code--" + res.statusCode() + " & Response status line--" + res.statusLine());
		Headers listOfHeaders = res.getHeaders();
		listOfHeaders.asList().forEach(e -> System.out.println(e));
		System.out.println(listOfHeaders.get("Content-Type"));
		List<Header> list = listOfHeaders.getList("Content-Type");
		System.out.println(list.get(0));
		System.out.println(list.get(0).getName());
		String[] strArr=list.get(0).getValue().split(";");
		System.out.println(strArr[0].trim().contains("json"));
		System.out.println(strArr[1].trim());
		
		
		
		JsonPath jsonPath = res.jsonPath();
		ArrayList<String> books=jsonPath.get("books[0]");
		

		

	}

}
