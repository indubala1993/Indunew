package org.testing.TestScripts;
import static com.jayway.restassured.RestAssured.given;

import java.io.IOException;
import org.json.JSONObject;
import org.testing.Utilities.JsonHandling;
import org.testing.Utilities.jsonfileload;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC6
{
//you have to update the data(where key is 3 inside  options in the whole json file)
	@Test
	public void TC6M() throws IOException
	{
		JSONObject data=new JSONObject();
		data.put("3","Dummy");
		
		
		/*********Json file load and Read data from it*******************/
		String body= jsonfileload.bodyDataRead("../APIFrameworkPractise1/src/test/java/org/testing/PayloadData/Dummy.json");
		System.out.println("Data in Json File is "+ body);
		Response res=
				 given()
				 .contentType(ContentType.JSON)
				 .when()
				 .get(body);
		JsonHandling js=new JsonHandling();
		js.jsonhandlingmethod(res,"options",data.toString());
	    
	
	    
	}
}
