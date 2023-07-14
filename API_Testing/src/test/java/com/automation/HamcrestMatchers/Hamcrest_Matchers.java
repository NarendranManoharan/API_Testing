package com.automation.HamcrestMatchers;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Hamcrest_Matchers {
	@Test
	public void ValidateResponse() {
		
		RestAssured.baseURI="http://localhost:3000";
		
		 RestAssured
		.given().param("", "").header("", "")
		.when()
		.get("/Team")
		.then()
		.body("data.leagueid", equalTo(35))
		.body("data.weight", equalTo(70.5F))
		.time(lessThan(3L), TimeUnit.SECONDS)
		.body("odds", hasSize(2));
		
}
}
