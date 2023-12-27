package restAssuredUtil;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class QueryParam {
	
	
	public static void main(String a[]) {
		//Response res=RestAssured.given().baseUri("").basePath("").basePath("").queryParam("", "").get();
		
		Faker faker= new Faker();
		System.out.println(faker.name().firstName());
		
		System.out.println(faker.funnyName().name());
		
		System.out.println(faker.ancient().god());
		System.out.println(faker.animal().name());
		//System.out.println(faker.);
		
		
		
	}

}
