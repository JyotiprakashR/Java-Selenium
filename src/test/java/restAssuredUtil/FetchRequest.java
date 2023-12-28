package restAssuredUtil;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.RequestSpecification;

public class FetchRequest {

	@Test
	public static void main() {

		/*
		 * // // BaseUri() & BasePath() Response response =
		 * RestAssured.given().get("https://restful-booker.herokuapp.com/booking");
		 * //System.out.println(response.asPrettyString());
		 * 
		 * // OR RequestSpecification reqSpe=
		 * RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath(
		 * "/booking"); Response ress=reqSpe.get();
		 * //System.out.println(ress.asPrettyString());
		 * 
		 * 
		 * RequestSpecification reqSpee=
		 * RestAssured.given().baseUri("https://api.zippopotam.us").basePath(
		 * "/IN/500016"); Response resss=reqSpee.get();
		 * //System.out.println(resss.asPrettyString());
		 * 
		 * // OR Response
		 * resp=RestAssured.given().get("https://api.zippopotam.us/IN/500016");
		 * //System.out.println(resp.asString());
		 * 
		 * 
		 * // FakerClass() RequestSpecification reqSpec=
		 * RestAssured.given().baseUri("https://reqres.in").basePath("/api/users").
		 * queryParam("page", 2); Response res=reqSpec.get();
		 * //System.out.println(res.asPrettyString());
		 * 
		 * 
		 * // queryParam will take multiple paramValues for one paramName, so it can be
		 * Collection Object/Array which will be holding values ArrayList<Object>
		 * paramValues= new ArrayList<>(); paramValues.add(2);
		 * 
		 * Object values[]= {2}; Response
		 * rest=RestAssured.given().baseUri("https://reqres.in").basePath("/api/users").
		 * queryParam("page", values).get(); System.out.println(rest.asPrettyString());
		 * // OR Response
		 * res1=RestAssured.given().baseUri("https://reqres.in").basePath("/api/users").
		 * queryParam("page", paramValues).get();
		 * System.out.println(res1.asPrettyString()); // OR Response
		 * res12=RestAssured.given().baseUri("https://reqres.in").basePath("/api/users")
		 * .queryParam("page", paramValues.toArray()).get();
		 * System.out.println(res12.asPrettyString());
		 * 
		 * HashMap<String, Object> paramNameAndValue= new HashMap<>();
		 * paramNameAndValue.put("page", 2); RequestSpecification requestSpe=
		 * RestAssured.given().baseUri("https://reqres.in").basePath("/api/users").
		 * queryParams(paramNameAndValue); Response respp=requestSpe.get();
		 * System.out.println(respp.asPrettyString());
		 * 
		 * 
		 * //RequestSpecification respcation=RestAssured.given().queryParams("", 2,
		 * 56,45);
		 
		System.out.println("-------------------------------1");
		// It send the creds in non-encrypted format, but uses the base64 encoding standard
		// Basic Preemptive authentication--Rest will send te cred with the rest
		Response respo=RestAssured.given().auth().preemptive().basic("postman", "password").when().get("https://postman-echo.com/basic-auth");
		System.out.println(respo.asPrettyString());
		
		System.out.println("-------------------------------2");
		// Basic Challenged authentication--Rest will not send the cred, with the request
		System.out.println(RestAssured.given().auth().basic("postman", "password").when().get("https://postman-echo.com/basic-auth").asPrettyString());
		
		
		System.out.println("-------------------------------3");
		// Digest Authentication
		// It sends the credentionals in encrypted form by applying a hash function to the username & password
		// So, it it more secure then Basic Authentication
		// As of now RESTAssured allows ChallengedDigestAuthenication
		System.out.println(RestAssured.given().auth().digest("test", "autom").when().get("https://httpbin.org/digest-auth/undefined/test/autom").asPrettyString());
		
		System.out.println("-------------------------------4");
		System.out.println(RestAssured.given().auth().digest("test", "test1").when().get("https://httpbin.org/digest-auth/undefined/test/test1/MD5").asPrettyString());
	
		
		*/
	
		System.out.println("-------------------------------5");
		// Bearer token
		// 4abdcdfa3dcbc0149f05a15bd19ec7afe09a9bcc66483ba8de678bc130e6f86c
		// It is also called as Token authentication
		// In Postman, we keep Bearer token in Authorization tab
		// But it send the bearer token as part of headers with key as "Authorization"
		
		System.out.println(RestAssured.given().header("Authorization","Bearer"+"4abdcdfa3dcbc0149f05a15bd19ec7afe09a9bcc66483ba8de678bc130e6f86c")
											.get("https://gorest.co.in/public/v2/users?id=5859513").prettyPrint());
		
		
		System.out.println("-------------------------------6");
		// API Key authentication
		// Can be passed in queryParam & heeder as well
		//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
		// 1. queryParam
		System.out.println(RestAssured.given().baseUri("https://api.openweathermap.org")
							.basePath("/data/2.5/weather")
							.queryParam("q", "delhi")
							.queryParam("appid", "676828198789ec6ca90a2d40d50b5c8f")
							.get().asPrettyString());
		
		
		
		
		// OAuth--OAuth1.0 & OAuth2.0
		// OAuth1.0
		RestAssured.given().auth().oauth("", "", "", "").get("").asPrettyString();
		
		
		// OAuth2.0
		RestAssured.given().auth().oauth2("").get().asPrettyString();
		
		
		
		
	
	}

}
