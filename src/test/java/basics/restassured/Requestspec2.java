package basics.restassured;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Requestspec2 {

	public static void main(String[] args) {

		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "morpheus");
		jsonObject.put("job", "leader");
		
		RestAssured.baseURI="https://reqres.in/";
		
		  RequestSpecification req = new RequestSpecBuilder().addPathParam("url1", "api").addPathParam("url2", "users")
		.setBody(jsonObject.toString()).addHeader("Content-type", "application/json").build();
		
		ResponseSpecification req1 = RestAssured.given().spec(req).expect().defaultParser(Parser.JSON);
	
		ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(201).build();
		
		
		String s=req1.when().post("{url1}"+"/"+"{url2}").then().spec(res).extract().asString();
		System.out.println(s);
		
		POSTPOJO post = req1.when().post("{url1}"+"/"+"{url2}").then().spec(res).extract().as(POSTPOJO.class);
		System.out.println(post);
		
		System.out.println(post.getID());
	}

}
