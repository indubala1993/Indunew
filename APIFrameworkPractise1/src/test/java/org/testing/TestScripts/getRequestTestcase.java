package org.testing.TestScripts;
import java.io.IOException;
import java.util.Properties;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class getRequestTestcase
{
	   @Test
		public void tc2() throws IOException
		{
			/*********load properties file******************************/
			 Properties pr= PropertiesFileLoad.propertiesFile();
			
			 /*********HTTP Methods******************************/
			 HTTPMethods http=new HTTPMethods(pr);
			Response res= http.GetRequest("QA_URI",PostRequestTC.id);
			
			System.out.println("Get request data is"+ res.asString());
			//ResponseStatusCodeValidate.responseStatusCode(res, 200);
			//ResponseDataValidation.responseData(res,"Indu","employeefirstname");
			
			
		}

	

}
