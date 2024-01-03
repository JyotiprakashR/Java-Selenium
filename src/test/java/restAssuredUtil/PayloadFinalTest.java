package restAssuredUtil;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PayloadFinalTest {
	
	public static void main(String a[]) {
		
		try {
			ObjectMapper objMapper= new ObjectMapper();
			PayloadFinal objClass=objMapper.readValue(new File(System.getProperty("user.dir")+"/src/test/resources/jsonFiles/response1.json") , PayloadFinal.class);
			System.out.println(objClass.toString());
			System.out.println(objClass.getResponseCode1());
		
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
