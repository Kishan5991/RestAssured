package RestAssuredCrudOper_Mock;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class crudOperation {
	public static String url="https://reqres.in/";
	
	public static String pst="/api/users?page=2";
	public static String Upd="/api/users/2";
	public static String del="/api/users/2";
	public static String gt="/api/users?page=2";
	@Test
	public void post()
	{
		RestAssured.baseURI=url;
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name","Chandan");
		obj.put("job", "sdet");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res = req.request(Method.POST,url);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		
	}
	@Test(priority = 1)
	public void get()
	
	{
		RestAssured.baseURI=url;
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,pst);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getContentType());
		
	}
	@Test(priority = 2)
	public void put()
	{
		RestAssured.baseURI=url;
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name","ChandanKishan");
		obj.put("job", "sdet2");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res = req.request(Method.PUT,Upd);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getContentType());
		
	}
	@Test(priority = 3)
	public void delete()
	{
		RestAssured.baseURI=url;
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.DELETE,del);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
	}
	@Test(priority = 4)
	
	public void get1()
	
	{
		RestAssured.baseURI=url;
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,gt);
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getContentType());
		
	}

}
