package org.testing.TestScripts;
import java.io.IOException;
import java.util.Properties;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
public class getRequestWithQueryParamerts
{
	@Test
	public void tc3() throws IOException
	{
		/*********load properties file******************************/
		 Properties pr= PropertiesFileLoad.propertiesFile();
		
		 /*********HTTP Methods******************************/
		 HTTPMethods http=new HTTPMethods(pr);
		Response res= http.GetRequestwithQuery("QA_URI","firstname",PostRequestTC.firstname);
		
		System.out.println("Get request data is"+ res.asString());
		
		
	}
}
