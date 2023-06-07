package basics.restassured;

import java.awt.image.SampleModel;
import java.util.regex.Matcher;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ValidatableResponse;

public class PostRequest1 {

	public static void main(String[] args) {
		
			RestAssured.baseURI="https://reqres.in/api/users";
			
			String string="{\n"
					+ "    \"email\": \"eve.holt@reqres.in\",\n"
					+ "    \"password\": \"pistol\"\n"
					+ "}\n"
					+ "";
			
			  ValidatableResponse res = RestAssured.given().body(string).contentType("application/json")
			.when().post(RestAssured.baseURI).then();
			
			  
			  res.statusCode(200);//assert
			  
			  res.body("", Matchers.equalTo("")); //assert
			  
			  res.extract(); //it is almost equal to response to get the data 
			  
			  
			  JsonPath sss = res.assertThat().statusCode(201).extract().body().jsonPath();  //get json path
	
			   System.out.println(	sss.get("email"));
			   
	
			   String xx = res.extract().body().asString();  //as String
			   System.out.println(xx);
			   
			   
			   Response res1 = RestAssured.given().body(string).contentType("application/json")
						.when().post(RestAssured.baseURI);
			   //all are get methods
			   System.out.println(res1.statusCode()); 
			   
			   SampleModel classss = res1.as(SampleModel.class);
			   
			   res1.asString(); // as string
			   
			   res1.jsonPath(); //as a json path
			   
			   res1.body(); //to get the body
			   
	
	}

}
