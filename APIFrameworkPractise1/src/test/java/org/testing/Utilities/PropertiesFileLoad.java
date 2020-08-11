package org.testing.Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad
{
	// this method will return the object of properties class
	public static Properties propertiesFile() throws IOException
	{
	 File f=new File("../APIFrameworkPractise1/Environment.properties");
	    FileInputStream fi=new FileInputStream(f);
	   Properties pr=new Properties();
	    pr.load(fi);
	    return pr;
	}
}
