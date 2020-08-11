package org.testing.Utilities;
import org.json.JSONObject;

import com.jayway.restassured.response.Response;
public class JsonHandling
{
public void jsonhandlingmethod(Response res,String KeyName,String valuetobeinserted)
{
JSONObject js=new JSONObject(res);
int l=js.length();
System.out.println(l);
for(int i=0;i<=l;i++) //loop on length
{	
	/*JSONObject j=js.getJSONObject(i);
Set<String>allkeys=j.keySet();//pulled all keys in the objects with the help of keyset method and stored it into set

for(String s: allkeys)
{
if (s.contains(KeyName))
{
System.out.println(j.get(s));	*/	
}
}

}


