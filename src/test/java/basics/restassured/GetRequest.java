package basics.restassured;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		Response res = RestAssured.given().log().all().urlEncodingEnabled(false).relaxedHTTPSValidation().queryParam("page", "2").pathParam("key1", "api")
				.pathParam("key2", "users").expect().defaultParser(Parser.JSON)
		.when().get("{key1}"+"/"+"{key2}");
		
		System.out.println(res);
		
		System.out.println(res.asString());
		
		Response xx = res.then().extract().response();
		System.out.println(res.then().extract().response().asString());
		
		JsonPath js=res.jsonPath();
		System.out.println(js.toString()+" "+js.get("page"));
		
		
		System.out.println(res.getBody().asString());
		
		JsonPath jsonPath=new JsonPath(res.getBody().asString());
		System.out.println(jsonPath.get("page"));

	
		System.out.println(jsonPath.getInt("data[0].id"));
		//Then and assertthat
		//extract response as string and assert with body
		//with headers
		//Urlencodingenabled
		//relaxed httpsvalidation
		//getters and setters
		//extract response as class
		//request spec buildre and resposnse spec builder
		
		System.out.println("------------------");
		
		POJOMain cl = res.then().extract().response().as(POJOMain.class);
		
		System.out.println(cl);
	}

}
