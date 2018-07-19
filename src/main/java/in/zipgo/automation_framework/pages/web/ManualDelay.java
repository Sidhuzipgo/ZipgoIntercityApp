package in.zipgo.automation_framework.pages.web;

import java.io.File;

import org.openqa.selenium.By;

import jxl.Sheet;
import jxl.Workbook;


//............................30/12/2017..........................................

public class ManualDelay extends BasePage {
	
	final By searchdriver           =By.xpath("//input[@type='search']");
	final By glyphicon              =By.xpath("(//span[@class='glyphicon glyphicon-edit'])[1]");
    final By regulation             =By.xpath("(//ul[@class='nav nav-tabs responsive hidden-xs hidden-sm'])[1]/child::*[2]");
	final By delaytriptiming        =By.xpath("//input[@name='cab_trip[delay_trip_timing]']");
	final By delaytripsave          =By.xpath("(//input[@name='commit'])[3]");
	final By tripdelayinmin         =By.xpath("(//tr[@class='odd'])[1]/descendant::*[13]");
	final By closebutton            =By.xpath("(//button[@class='close'])[3]");

	
	public ManualDelay manualdelay() {
	   
		
		    try{
		    
			File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();
	 	    Sheet rsh=rwb.getSheet(0);
	 	    int nour=rsh.getRows();
	   
	 	    String secondriver=rsh.getCell(3, 0).getContents();
	 	    refresh();
		    waitForElement(searchdriver).sendKeys(secondriver);	
		   // handledSleep(5);		
	        }
	    	catch(Exception e) {
			
		    }
		
		    scrolldown();
		   // handledSleep(3);		
		    moveToElement(glyphicon);
		    implictwait(30);
		    waitForElement(glyphicon).click();
		    //handledSleep(5);	
		    implictwait(30);
            waitForElement(regulation).click();
		    implictwait(50);
		    waitForElement(delaytriptiming).click();
		    implictwait(50);
		    sendValuesToWebElement(waitForElement(delaytriptiming),"33");
		    implictwait(50);
		    waitForElement(delaytripsave).click();
            implictwait(30);
            waitForElement(closebutton).click();
		    //handledSleep(5);		

            implictwait(30);
        
		    String tripdelayedby=		waitForElement(tripdelayinmin).getText();
		
		    System.out.println(tripdelayedby);
            if(tripdelayedby.contains("0")) {
        	System.out.println("Trip Delay is not working fine");
            }
            else {
        	System.out.println("Trip Delay is working fine");
            }

            refresh();
			return null;
	        }
       } 
