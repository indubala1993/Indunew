package org.testing.Utilities;
import com.jayway.restassured.response.Response;
public class ResponseExtractionUsingJsonPath
{
	public static String responseExtract(String jsonPath,Response res)
	{
	return res.jsonPath().get(jsonPath);
	}
}
