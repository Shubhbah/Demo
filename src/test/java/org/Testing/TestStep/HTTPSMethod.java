package org.Testing.TestStep;

import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class HTTPSMethod 
{
static Properties pr;
public  HTTPSMethod (Properties Pr)
{
	this.pr=Pr;
}
public static  Response GetRequest(String URI) 
{
  Response Res=RestAssured.given().
		  contentType(ContentType.JSON).
		  when().get(pr.getProperty(URI));
return Res;
}
}
