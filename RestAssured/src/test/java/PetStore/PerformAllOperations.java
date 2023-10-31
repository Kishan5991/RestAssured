package PetStore;

import org.apache.logging.log4j.core.net.Priority;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PerformAllOperations {
	public static String createUser="https://petstore.swagger.io/#/";
	public static String getUser="/user/Alexander";
	public static String putUsername="/user/Alexander";
	public static String deleteUser="/user/Alexander";
	
	
	@Test
	public void post()
	{
		RestAssured.baseURI=createUser;
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("id","7862");
		obj.put("username", "Alexander7862");
		obj.put("firstName", "Dog");
		obj.put("lastName", "Pet");
		obj.put("email", "Alexander@gmail.com");
		obj.put("password", "@Alexander");
		obj.put("phone", "7411240363");
		obj.put("userStatus", "78737447555");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res = req.request(Method.POST,createUser);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
	}
	@Test(priority = 1)
	public void get()
	{
		RestAssured.baseURI=createUser;
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET, getUser);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getContentType());
	}
	@Test(priority = 2)
	public void put()
	{
		RestAssured.baseURI=createUser;
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("id","7862");
		obj.put("username", "Alexander");
		obj.put("firstName", "Dog");
		obj.put("lastName", "Pet");
		obj.put("email", "Alexander@gmail.com");
		obj.put("password", "@Alexander");
		obj.put("phone", "7411240363");
		obj.put("userStatus", "78737447555");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res = req.request(Method.PUT,putUsername);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getContentType());
		
	}
	@Test(priority = 3)
	public void delete()
	{
		RestAssured.baseURI=createUser;
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.DELETE, deleteUser);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
	}
	@Test(priority = 4)
	public void get1()
	
	{
		RestAssured.baseURI=createUser;
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET, getUser);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getContentType());
		
	}

}
