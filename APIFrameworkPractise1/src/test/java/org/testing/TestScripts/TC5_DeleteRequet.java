package org.testing.TestScripts;
import java.io.IOException;
import java.util.Properties;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
public class TC5_DeleteRequet
{
	@Test
public void TC5() throws IOException 
{
	/*********load properties file******************************/
	 Properties pr= PropertiesFileLoad.propertiesFile();
	 /*********HTTP Methods******************************/
	 HTTPMethods http=new HTTPMethods(pr);
	 System.out.println("###### TEST CASE 5 ######");
	 System.out.println(" Id fetched from TC 1 is "+ PostRequestTC.id);
	 Response res= http.deleteRequest("QA_URI",PostRequestTC.id);
	 System.out.println("Deleted data in TC_5 is "+ res.asString());
}
}
