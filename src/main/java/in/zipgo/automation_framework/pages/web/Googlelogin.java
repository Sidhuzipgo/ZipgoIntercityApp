
	package in.zipgo.automation_framework.pages.web;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;

import in.zipgo.automation_framework.pages.web.BasePage;


//............................30/12/2017..........................................

	public class Googlelogin extends BasePage {
		
		   final By gmailuserid                =By.id("identifierId");
		   final By gmailpwd                   =By.name("password");
		   final By nextbutton                 =By.xpath("//span[@class='RveJvd snByac']");
		
	    
		  public Googlelogin entergoogleusername(){	

		      waitForElement(gmailuserid).sendKeys("siddhartha@zipgo.in",Keys.ENTER);		
		      return this;
		   
		  }	
		 
		  public Googlelogin entergooglepwd(){
		  
		     handledSleep(3);
		     implictwait(30);
		     waitForElement(gmailpwd).sendKeys("sidhuzipgo");
		     implictwait(30);
		     waitForElement(nextbutton).click();
		     handledSleep(3);
			 return this;

		    
		    }

	}



