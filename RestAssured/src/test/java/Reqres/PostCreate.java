package Reqres;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCreate {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		//create object for json to load
		JSONObject obj=new JSONObject();
		//specified the key and value of body
		obj.put("name","kishan");
		obj.put("job", "sdet");
		//specified request should be in which format
		req.contentType(ContentType.JSON);
		//converted object into json string
		req.body(obj.toJSONString());
		Response res = req.request(Method.POST,"/api/users");
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());

	}

}
