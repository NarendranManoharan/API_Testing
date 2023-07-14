package com.automation.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class DeleteRequestBDD {

	@Test
	public void deleterequest() {
     RestAssured.baseURI="http://localhost:3000";
		
		ValidatableResponse response =RestAssured
		.given()
		.delete("/employees/6")
		.then()
		.statusCode(204);
		System.out.println(response);
		
		 
	}
}
