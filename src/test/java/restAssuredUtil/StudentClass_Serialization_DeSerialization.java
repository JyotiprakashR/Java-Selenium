package restAssuredUtil;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.javafaker.Faker;

import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;

public class StudentClass_Serialization_DeSerialization {

	static Faker faker= new Faker();
	static XmlMapper xmlMapper= new XmlMapper();
	static String jsonObject=null;
	static ObjectMapper objMapper= new ObjectMapper();
	
	public static void main(String a[]) {
		
		// JAVA Object
		StudentClass studentObject= new StudentClass(faker.name().firstName(), 
													faker.name().lastName(), 
													String.valueOf(faker.number().numberBetween(100, 500)) , 
													String.valueOf(faker.number().randomDigitNotZero()) );
		//System.out.println("StudentClass Java Object---\n"+studentObject.toString());
		System.out.println("StudentClass Java Object---"+studentObject.toString());
		
		String namess[]={faker.name().fullName(), faker.name().fullName()};
		StudentClass newStudentObject= new StudentClass(
													faker.name().firstName(), 
													faker.name().lastName(), 
													String.valueOf(faker.number().numberBetween(100, 500)), 
													String.valueOf(faker.number().randomDigitNotZero()),
													namess) ;
			
		try {
			// Serialization--JAVA object to JSON object
			jsonObject=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentObject); 
			System.out.println("StudentClass JSON Object---\n");
			System.out.println(jsonObject);
			//System.out.println(new JsonPath(jsonObject).prettify());
			
			// store Serialized object to the JSON File
			objMapper.writeValue(new File(System.getProperty("user.dir")+"/src/test/resources/runTimeFiles/runtimeJson.json"), objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newStudentObject));
			File file= new File(System.getProperty("user.dir")+"/src/test/resources/runTimeFiles/runtimeJson.json");
			assertNotNull(file);
			
			
			// De-Serialization--JSON object to JAVA object
			StudentClass DeserializedstuObj=objMapper.readValue(jsonObject, StudentClass.class); 
			//StudentClass DeserializedstuObjFromJSONFile=objMapper.readValue(file, StudentClass.class);
			System.out.println("Deserialized-- JSON to StudentClass Object---");
			System.out.println(DeserializedstuObj.toString());
			//System.out.println(DeserializedstuObjFromJSONFile.toString());
			
			// Read stored-Serialized xml object file to the JAVA object
			
			
			
			
			
			String xmlObject=xmlMapper.writeValueAsString(studentObject);
			System.out.println(new XmlPath(xmlObject).prettify());
			
			System.out.println(objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newStudentObject));
			
			
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void demo() {
		io.restassured.mapper.ObjectMapper obj= new io.restassured.mapper.ObjectMapper() {
			
			@Override
			public Object serialize(ObjectMapperSerializationContext context) {
				
				return null;
			}
			
			@Override
			public Object deserialize(ObjectMapperDeserializationContext context) {
				
				return null;
			}
		};
	}

}
