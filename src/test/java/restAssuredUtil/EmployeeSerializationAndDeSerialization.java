package restAssuredUtil;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

public class EmployeeSerializationAndDeSerialization {

	public static void main(String[] args) {

		Employee empObj = new Employee("Tom", "Jerry", 20, 456321, "QA", "753985659", "email@gmail.com");

		// Serialization using Jackson API's ObjectMapper class
		ObjectMapper objMaper = new ObjectMapper();
		String empJson = null;
		try {
			empJson = objMaper.writeValueAsString(empObj);
			String empPrettyJson = objMaper.writerWithDefaultPrettyPrinter().writeValueAsString(empJson);
			System.out.println(empJson);
			System.out.println("-----------------------------------------");
			System.out.println(empPrettyJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		// De-Serialization
		try {
			System.out.println("-----------------------------------------");
			Employee empObjFromJSON = objMaper.readValue(empJson, Employee.class);
			System.out.println(empObjFromJSON.toString());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Uisng RestAssured ObjectMapper Interface
		
		io.restassured.mapper.
		ObjectMapper objMapper= new io.restassured.mapper.ObjectMapper() {
			
			@Override
			public Object serialize(ObjectMapperSerializationContext context) {
				System.out.println(context.getContentType());
				Object obj=context.getObjectToSerialize().toString();
				System.out.println(obj);
				return null;
			}
			
			@Override
			public Object deserialize(ObjectMapperDeserializationContext context) {
				
				return null;
			}
		};
		
			

	}

}
