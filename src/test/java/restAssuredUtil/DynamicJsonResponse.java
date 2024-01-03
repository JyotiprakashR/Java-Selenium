package restAssuredUtil;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class DynamicJsonResponse {
	
	private String responseCode;
	private String responseMessage;
	private String transactionSequenceId;
	private String responseCode1;
	
	
	public static void main(String a[]) {
	ObjectMapper objMapper= new ObjectMapper();
	try {
		DynamicJsonResponse objClass=objMapper.readValue(new File(System.getProperty("user.dir")+"/src/test/resources/jsonFiles/response1.json") , DynamicJsonResponse.class);
		
		System.out.println(objClass.toString());
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	}
}
