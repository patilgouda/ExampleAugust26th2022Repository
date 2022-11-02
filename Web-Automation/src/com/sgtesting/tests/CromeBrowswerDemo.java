package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowswerDemo {
public static WebDriver oBroweser=null;
public static void main(String[] args) {
	lanchBrowser();	
	navigate();
}

private static void lanchBrowser()
{
	try
	{
		
	System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
	oBroweser=new ChromeDriver();
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}


private static void navigate()
{
	try
	{
		oBroweser.get("http://facebook.com");
	}catch (Exception e)
	{
		e.printStackTrace();
	}
		
	}
private static void closeApplication()
{
	try
	{
		oBroweser.close();
	}catch (Exception e)
	{
		e.printStackTrace();
		
		
	}
}
}
