package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.Base;
import Pages.Signin;
import Propertyfile.Propertyfile;

public class SigninTest extends Base
{
	Signin ob=null;
	
	@BeforeTest
	public void getlaunch() 
	{
		
		try 
		{
			getlaunch(Propertyfile.Getpropertyvalue("url"));
			ob=new Signin();
			
		
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getlaunch method"+e);
		}
	}
	

	@Test(priority=0,enabled=true)
	public void getSignme() 
	{
		
		try 
		{
			ob.Signme();
		
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getSignme method"+e);
		}
	}
	

}
