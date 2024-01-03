package restAssuredUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPayloadUsingNestedMap {

	public static void main(String ar[]) {

		LinkedHashMap<String, Object> jsonMap = new LinkedHashMap<>();
		HashMap<String, Object> innerJsonMap = new HashMap<>();

		jsonMap.put("name", "Tom");
		jsonMap.put("id", 20);
		innerJsonMap.put("rollNo", 56);
		innerJsonMap.put("standard", 5);
		
		jsonMap.put("details", innerJsonMap);

		ObjectMapper objMapper = new ObjectMapper();
		String jsonPayload = null;
		try {
			jsonPayload = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonMap);
			System.out.println(jsonPayload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
