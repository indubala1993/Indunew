package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods
{
	//calling uri, create a constructor
	Properties pr; // global declaration
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	public Response PostRequest(String bodydata,String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(uriKey));
		return res;
	}
	public Response GetRequest(String uriKey,String Endpoint)
	{
		String uri=pr.getProperty(uriKey)+"/"+Endpoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
				return res;
	}
	public Response GetRequestwithQuery(String uriKey,String QueryParameter,String QueryValue)
	{
		String uri=pr.getProperty(uriKey)+"?"+QueryParameter+"="+QueryValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
				return res;
	}
	public Response PutRequest(String bodydata,String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.put(uri);
		return res;
	}
	public Response deleteRequest(String urikey,String idValue)
	{
		String uri=pr.getProperty(urikey)+"/"+idValue;
		Response res=given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		return res;
	}
}

