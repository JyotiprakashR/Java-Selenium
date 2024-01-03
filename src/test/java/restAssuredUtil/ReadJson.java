package restAssuredUtil;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReadJson {

	public static void main(String[] args) throws IOException {

		/*
		 * Response res =
		 * RestAssured.given().get("https://api.zippopotam.us/IN/500016");
		 * System.out.println(res.asPrettyString());
		 * 
		 * 
		 * 
		 * String country=res.path("country").toString(); System.out.println(country);
		 * 
		 * String places=res.path("places").toString(); System.out.println(places);
		 * 
		 * String placeState=res.path("places.state").toString();
		 * System.out.println(placeState);
		 * 
		 * 
		 * String co=res.jsonPath().get("country"); System.out.println(co);
		 */

		FileReader jsonFile = new FileReader(System.getProperty("user.dir") + "/src/test/resources/jsonFiles/store.json");
		JsonPath json = new JsonPath(jsonFile);
		//System.out.println(json.prettify());

		String col = json.get("store.bicycle.color");
		System.out.println(col);

		LinkedHashMap<Object, Object> linkedHashMap = json.get();
		linkedHashMap.forEach((e, d) -> System.out.println(e + " : " + d));

		System.out.println(json.getJsonObject("store.bicycle.color").toString());

		List<LinkedHashMap<Object, Object>> listOfBook = json.getList("store.book");
		System.out.println(listOfBook.size());

		for (int i = 0; i < listOfBook.size(); i++) {
			LinkedHashMap<Object, Object> map = listOfBook.get(i);
			for (Entry<Object, Object> set : map.entrySet()) {
				if (String.valueOf(set.getValue()).equalsIgnoreCase("Sword of Honour")) {
					System.out.println("Title found");
					break;
				}
			}
		}
		
		
		Map<Object, Object> map=json.getMap("$");
		System.out.println(map);

		JsonPath newJson=json.param("price", "map");
		System.out.println(newJson.prettify());
		
		
		
		
		
		JsonPath jsonP= new JsonPath(new File(System.getProperty("user.dir")+"/src/test/resources/jsonFiles/response1.json"));
		//System.out.println(jsonP.prettify());
		
		System.out.println(jsonP.get("responseCode").toString());
		
		System.out.println(jsonP.get("responseMessage").toString().contains("Your address qualifies for HughesNet"));
		
		List<Object> packageList= jsonP.getList("responseData.productList.packageName");
		System.out.println(packageList);
		
		List<Object> programList= jsonP.getList("responseData.productList.programCode");
		System.out.println(programList);
		
		System.out.println(jsonP.getMap("$").size());
		
		
		Response respo=RestAssured.given().auth().digest("test", "autom").when().get("https://httpbin.org/digest-auth/undefined/test/autom");
		
		JsonPath path=respo.jsonPath();
		Map<Object, Object> map1=path.getMap("$");
		System.out.println(map1);
		
		
		System.out.println("------------------1");
		
		
		JsonPath v=json.peek();
		System.out.println(v.prettyPeek());

		System.out.println("------------------2");

		Object ob=JsonPath.with(respo.asString()).get("authenticated");
		System.out.println(ob.toString());
		
		
		
		JsonPath jsonPath1= new JsonPath(new File(System.getProperty("user.dir")+"/src/test/resources/jsonFiles/small.json"));
		Map<Object, Object> jsonMap=jsonPath1.getMap("$");
		System.out.println(jsonMap.get("user").toString());
		
		
		
		String category1=json.get("store.book[0].category").toString();
		System.out.println(category1);
		
		String categoryLat=json.get("store.book[-1].category").toString();
		System.out.println(categoryLat);
		
		List<Map<String, Object>> books=json.get("store.book.findAll{book->book.price>5 && book.price<=15}");
		System.out.println(books);
		
		// This method is never recomended
//		Scanner s= new Scanner(System.in);
//		String givenStrn=s.nextLine();
//		List<Map<String, Object>> books1=json.get("store.book.findAll{book->book.author =="+givenStrn+"}");
//		System.out.println(books1);
//		s.close();
		
//		String name= new Scanner(System.in).nextLine();
//		List<Map<String, Object>> books12=json.param("name", name).get("store.book.findAll{book->book.author==name}");
//		System.out.println(books12);
		
		//JSONObject jobj= new JSONObject(respo.asString());
		
		Response respLoc= RestAssured.given().contentType(ContentType.JSON).get("https://api.zippopotam.us/IN/500016");
		System.out.println(respLoc.asPrettyString());
		
		JSONObject jObject= new JSONObject(respLoc.asString());
		Object price=jObject.get("country");
		System.out.println(price);
		
//		String filepath=System.getProperty("user.dir")+"/src/test/resources/jsonFiles/store.json";
//		File fi= new File(filepath);															 // having issue
//		JSONObject jo=new JSONObject(fi);
//		System.out.println(jo.get("store.bicycle.price").toString());
		
		System.out.println("-------------------------------==============");
		JSONObject newJsonObject= jObject.append("customKey", "customValue").append("customKey", "customValuePlus");
		System.out.println(newJsonObject);
		
		
		JSONArray jsonArray=jObject.getJSONArray("places");
		jsonArray.forEach(e->System.out.println(e));
		
//		JSONObject jobje=jObject.getJSONObject("country"); // this is about the parent jsonObject
//		System.out.println(jobje);
		
		System.out.println(jObject.length());
		
		System.out.println(jObject.has("place name"));
		
		Set<String> keySets=jObject.keySet();
		keySets.forEach(b->System.out.println(b));
		
		JSONArray jArry=jObject.names();
		jArry.forEach(t->System.out.println(t));
		
		
		JSONArray ja=jObject.toJSONArray(jArry);
		
		
		JSONArray jsa=new JSONArray();
		jsa.put(0, 12);
		String str=jsa.join("$");
		System.out.println(str);



	}



	//public static void main(String[] args) { type main....IntelliJ will show the preferences
	// System.out.println(); // sout
	//cwd--it will print current woring directory...i.e. System.getProperty("user.dir")

	// }




}
