package basics.restassured;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;

public class ObjectMap {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	
		String string="{\n"
				+ "\"name\" : \"Chirra\",	\n"
				+ "\"fullName\": \"Bhaskar\"\n"
				+ "}";
		
		ObjectMapper mapper=new ObjectMapper();
		POJOObjectMap ss = mapper.readValue(string, POJOObjectMap.class);
		
		System.out.println(		ss.getFullName());
		
		JSONObject jsonObject=new JSONObject(string);
		
		jsonObject.put("Surname", "Chirra");
		
		System.out.println(jsonObject);
		
		
		JsonPath jsonPath=new JsonPath(string);
		System.out.println(jsonPath.get("Surname"));
		

		
		
	}

}

