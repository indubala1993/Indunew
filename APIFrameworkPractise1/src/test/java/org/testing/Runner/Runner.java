package org.testing.Runner;
import java.io.IOException;
import org.testing.TestScripts.PostRequestTC;
import org.testing.TestScripts.TC4PutRequest;
import org.testing.TestScripts.TC5_DeleteRequet;
import org.testing.TestScripts.TC6;
import org.testing.TestScripts.getRequestTestcase;
import org.testing.TestScripts.getRequestWithQueryParamerts;

public class Runner
{
public static void main(String[] args) throws IOException
	{
		//PostRequestTC Method1=new PostRequestTC();
		//Method1.tc1();
		//getRequestTestcase Method2=new getRequestTestcase();
		//Method2.tc2();
		//getRequestWithQueryParamerts Method3=new getRequestWithQueryParamerts();
		//Method3.tc3();
		//TC4PutRequest Method4=new TC4PutRequest();
	    //Method4.TC4();
		//TC5_DeleteRequet Method5= new TC5_DeleteRequet();
		//Method5.TC5();
	      TC6 Method6= new TC6();
	      Method6.TC6M();
	

	}

}
