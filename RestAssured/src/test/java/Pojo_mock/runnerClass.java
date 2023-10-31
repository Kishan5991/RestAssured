package Pojo_mock;

import javax.xml.crypto.Data;

import PojoSingleUser.Single_User;
import PojoSingleUser.SupportObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class runnerClass {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/users/2");
		//as method represents class to be invoked
		Single_User a1 = res.as(Single_User.class);
		SupportObject s = a1.getSupportobject();
		System.out.println(s.getText());
		 Data d = a1.getDataobject();
		System.out.println(a1);
		
	}

}
