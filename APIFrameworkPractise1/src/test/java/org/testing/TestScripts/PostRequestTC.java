package org.testing.TestScripts;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseExtractionUsingJsonPath;
import org.testing.Utilities.jsonVariableReplacement;
import org.testing.Utilities.jsonfileload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
public class PostRequestTC
{
	static String id;
	static String firstname;
	@Test
	public void tc1() throws IOException 
{
	/*********Json file load*******************/
	String body= jsonfileload.bodyDataRead("../APIFrameworkPractise1/src/test/java/org/testing/PayloadData/body.json");
	
	/*********generating random id every time********/
	Random r=new Random();
	Integer v=r.nextInt();
	body=jsonVariableReplacement.jsonVariable(body,"id", v.toString());
	
	/*********load properties file******************************/
	 Properties pr= PropertiesFileLoad.propertiesFile();
	
	 /*********HTTP Methods******************************/
	 HTTPMethods http=new HTTPMethods(pr);
	Response res= http.PostRequest(body, "QA_URI");
	System.out.println("Post request data is"+ res.asString());
	/*************Matching response code status******/
	ResponseStatusCodeValidate.responseStatusCode(res, 201);
	/*************Matching response Data******/
	ResponseDataValidation.responseData(res,"Indu","employeefirstname");
	/********* Storing id of this tc for next test case use**/
	id=ResponseExtractionUsingJsonPath.responseExtract("id", res);
	firstname=ResponseExtractionUsingJsonPath.responseExtract("employeefirstname", res);
	System.out.println("Id Value is "+ id);
}
}
