package JsonParsing;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Script1 
{
	public static void main(String[] args) 
		{
			RestAssured.baseURI="https://www.reqres.in/";
			RequestSpecification req = RestAssured.given();
			Response res = req.request(Method.GET,"/api/users?page=2");
			String str=res.asString();  //returnType should give manually String
			JsonPath jp=new JsonPath(str);
			String f_n = jp.get("data[1].avatar");
			//returnType should give manually String
			System.out.println(f_n);
			//String txt=jp.get("support.text");  //returnType should give manually String
			//System.out.println(txt);
			
			
			
			
		}
	
}


