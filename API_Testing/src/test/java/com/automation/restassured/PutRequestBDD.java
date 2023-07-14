package com.automation.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PutRequestBDD {

	@Test
	public void putrequest() {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("first_name", "rohit");
		jsonObject.put("last_name", "sharma");
		jsonObject.put("email", "hitman@gmail.com");
		
		
		baseURI="http://localhost:3000";
		
		given()
		.body(jsonObject.toJSONString())
		.header("Content-Type", "application/json")
		.put("/employees/6")
		.then().statusCode(200);
	}
}
