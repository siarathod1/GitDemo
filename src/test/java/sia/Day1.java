package sia;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Day1 {
	@Test
	public void demo1() {
		String inputName= "Sia";
		System.out.println("Day1.demo1");
		Response resp = RestAssured.given()
//				.post("https://httpbin.org/post");
				.header("Authorization", "Basic YWJjOmFiYw==")
				.formParam("Name", inputName)
//				.body("SUnil is OSUM")
				.post("https://httpbin.org/post");
		
		
		
		System.out.println(resp);
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.jsonPath().get("$"));
		String outputName = resp.jsonPath().get("form.Name");
		Assert.assertEquals(inputName, outputName);
		System.out.println(resp.prettyPrint());
		System.out.println("Hello");
		System.out.println("He");

		System.out.println("lo");

		System.out.println("ello");


	}

	@Test
	public void demo2() throws Exception {
		System.out.println("Day1.demo2");
	}
}
