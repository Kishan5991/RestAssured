package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest1 {

	public static void main(String[] args) {
		//specify the base URI
		RestAssured.baseURI="https://reqres.in/";
		//inherits all the http methods
		RequestSpecification req = RestAssured.given();
		//specify http menthod and endpoint to hit the server
		Response res = req.request(Method.GET,"/api/users?page=2");
		//fetches the data in string format
		System.out.println(res.asString());
		//to fetch status code
		System.out.println(res.getStatusCode());
		//to fetch status line
		System.out.println(res.getStatusLine());
		//parameter that interchanges data
		System.out.println(res.getContentType());

	}

}
