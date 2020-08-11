package org.testing.TestScripts;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
public class TC4PutRequest
{
	@Test
	public void TC4() throws IOException
	{
	JSONObject data=new JSONObject();
	data.put("Firstname","Dummy");
	data.put("Lastname","DM");
	data.put("id","john");
	data.put("designation","QA lead");

	/*********load properties file******************************/
	 Properties pr= PropertiesFileLoad.propertiesFile();
	
	 /*********HTTP Methods******************************/
	 HTTPMethods http=new HTTPMethods(pr);
	 Response res= http.PutRequest(data.toString(),"QA_URI",PostRequestTC.id);
	 System.out.println("Put data in TC_4 is "+ res.asString());
	 ResponseStatusCodeValidate.responseStatusCode(res, 200);
	 ResponseDataValidation.responseData(res,"Dummy","Firstname");
	
	}
}
