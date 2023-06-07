package basics.restassured;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class POSTRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String string="{\n"
//				+ "    \"name\": \"John Doe\",\n"
//				+ "    \"trips\": 250,\n"
//				+ "    \"airline\": 5\n"
//				+ "}";
		
		JSONObject string=new JSONObject();
		string.put("name", "John Doe");
		string.put("trips", 250);
		string.put("airline", 5);
		
		Map<String, String> jsonObject=new HashMap<String, String>();
		jsonObject.put("Content-type", "application/json");
		
		RestAssured.baseURI="https://api.instantwebtools.net/v1/passenger";
		String res = RestAssured.given().log().all().headers(jsonObject)

			.body(string.toString())
			.
			when().post(RestAssured.baseURI).then().statusCode(200).extract().response().asString();
		System.out.println(res);
		
		
		ValidatableResponse then = RestAssured.given().log().all().header("Content-type", "application/json")

		.body(string)
		.
		when().post(RestAssured.baseURI).then();
		
		
		 ValidatableResponse at = RestAssured.given().log().all().header("Content-type", "application/json")

		.body(string)
		.
		when().post(RestAssured.baseURI).then().assertThat();
	}

}
