package restAssuredUtil;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

public class GetCustomerDetails {

	public static void main(String a[]) {

		//RestAssured.given().contentType(ContentType.JSON).log().all(true).when().get("http://localhost:3000/employees")
		//		.then().log().everything().statusCode(200);

		Response resp = RestAssured.given().get("http://localhost:3000/employees");
		System.out.println(resp.getStatusCode());

		System.out.println(resp.getStatusLine());
		
		System.out.println(resp.getCookie("Content-Type"));
		
		Cookies cookies=resp.getDetailedCookies();
		
		cookies.forEach(e->System.out.println(e));
		
		

	}

}
