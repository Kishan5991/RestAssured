package Gherkin;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Rest1 {

	public static void main(String[] args) {
		RequestSpecBuilder req_bui=new RequestSpecBuilder();
		RequestSpecification rest1 = req_bui.setBaseUri("https://reqres.in/").
		setContentType(ContentType.JSON).build();
		
		ResponseSpecBuilder res_bui=new ResponseSpecBuilder();
		ResponseSpecification res2 = res_bui.expectContentType(ContentType.JSON).expectStatusCode(200).
		expectStatusLine("HTTP/1.1 200 OK").build();
		
		Response res = given().spec(rest1).when().get("/api/users?page=2").then().
		spec(res2).extract().response();
		
		System.out.println(res.asString());

	}

}
