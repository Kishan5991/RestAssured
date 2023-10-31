package PojoSingleUser;

import javax.xml.crypto.Data;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRunnerClass {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/users/2");
		Single_User a1 = res.as(Single_User.class);//as method represents class to be invoked
		SupportObject s = a1.getSupportobject();
		System.out.println(s.getText());
		Data d = a1.getDataobject();
		System.out.println(d);
		
	}

}
