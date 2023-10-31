package Pojo2;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestRunnerClass {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/users?page=2");
		List_Users a1 = res.as(List_Users.class);
		System.out.println(a1.getTotal());
		Support s = a1.getSupport();
		System.out.println(s.getText());
		List<Data> d = a1.getData();
		for (Data d1 : d) {
			System.out.println(d1.getAvatar());
		}

	}

}
