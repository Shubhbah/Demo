package org.Testing.TestCase;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.io.IOException;
import java.util.Properties;

import org.Testing.TestResponseValidation.ResponseValidation;
import org.Testing.TestStep.HTTPSMethod;
import org.Testing.utils.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1 
{

	public static void main(String[] args) throws IOException
	{
	Properties Pr= PropertiesFileLoad.PropFileLoad("../RestA/Env.properties");
	HTTPSMethod http=new HTTPSMethod(Pr);
	Response Res=http.GetRequest("QA_URI2");
	ResponseValidation ResObj=new ResponseValidation();
	ResObj.ResponseValidation(Res);
}
}