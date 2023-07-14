package com.automation.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequestBDD {

	@Test
	public void postrequest() {
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("first_name", "sachin");
		jsonObject.put("last_name", "Tendulkar");
		jsonObject.put("email", "srt@gmail.com");
		

		RestAssured.baseURI="http://localhost:3000";
		
		Response response=RestAssured
		.given()
		.header("Content-Type", "application/json")
		.body(jsonObject.toJSONString())
		.post("/employees");
		System.out.println(response.body().asPrettyString());
	}
	
}
