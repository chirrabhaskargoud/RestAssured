package basics.restassured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestSpec {

	public static void main(String[] args) {
		

		RestAssured.baseURI="https://reqres.in/";
		
		
//		RequestSpecification req = RestAssured.given().pathParam("url1", "api").pathParam("url2","users")
//		.log().all().queryParam("page", 2);		
//		Response res = req.when().get(RestAssured.baseURI+"{urll1}"+"/"+"{url2}");
	

		RequestSpecification req = new RequestSpecBuilder().setBaseUri(RestAssured.baseURI).addPathParam("url1", "api").addPathParam("url2","users")
		.addQueryParam("page", 2).build();
		
		req=RestAssured.given().log().all().spec(req);
		
		ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).build();//you can add expecteBody also
		
		
		String ss = req.when().get("{url1}"+"/"+"{url2}").then().spec(res).extract().response().asString();
		
		System.out.println(ss);
		
	}

}
