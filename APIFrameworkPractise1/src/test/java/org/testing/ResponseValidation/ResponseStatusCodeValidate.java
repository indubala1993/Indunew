package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate
{
	public static void responseStatusCode(Response res,int expectedStatusCode)
	{
		if(res.getStatusCode()==expectedStatusCode)
		{
			System.out.println("Status code matched");
		}
		else
		{
			System.out.println("Status code not matching");
		}
	}
}
