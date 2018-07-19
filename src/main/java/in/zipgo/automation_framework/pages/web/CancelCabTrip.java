package in.zipgo.automation_framework.pages.web;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import jxl.Sheet;
import jxl.Workbook;

//............................30/12/2017..........................................
public class CancelCabTrip extends BasePage {
	
	final By searchdriver           =By.xpath("//input[@type='search']");
	final By glyphicon              =By.xpath("(//span[@class='glyphicon glyphicon-edit'])[1]");
	final By statusdropdown         =By.xpath("(//span[@title='Accepted'])[1]");
	final By cancelstatus           =By.xpath("//li[text()='Canceled']");
	final By cancelreason			=By.xpath("//span[text()='Select Cancel Reason']");
	final By wrongtripreason        =By.xpath("//li[text()='Wrong Trip Made']");
	final By quicksave              =By.xpath("//button[@class='btn btn-danger btn-sm pull-right']");
	final By successmsg             =By.xpath("//div[text()='Cab trip is updated successfully']");
	final By closebutton            =By.xpath("(//button[@class='close'])[3]");
		
	final By canceled               =By.xpath("(//tr[@class='odd'])[1]/child::*[16]");
	final By verifycancel           =By.xpath("//td[text()='canceled']");
	
	public CancelCabTrip cancelTrip1() {
		
		
		    try{
			File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();
	 	    Sheet rsh=rwb.getSheet(0);
	 	    int nour=rsh.getRows();
	   
	 	    String firstdriver=rsh.getCell(3, 0).getContents();
	 	    System.out.println("Cancel Trip    "+firstdriver);
		    waitForElement(searchdriver).sendKeys(firstdriver);	
	        handledSleep(5);     	
		    scrolldown();
		    moveToElement(glyphicon);
		    implictwait(30);
		    waitForElement(glyphicon).click();
	        handledSleep(5);
		    waitForElement(statusdropdown).click();
		    implictwait(50);
		    waitForElement(cancelstatus).click();
		    implictwait(50);
		    waitForElement(cancelreason).click();
		    implictwait(50);
		    waitForElement(wrongtripreason).click();
		    implictwait(50);		
		    waitForElement(quicksave).click();
		    implictwait(50);
            WebElement sucesselement       =waitForElement(successmsg);
            if(sucesselement.isDisplayed()) {
        	  System.out.println("Cab Trip Cancelled Message Shown Successfully");
              }
            else {
        	  System.out.println("Cab Trip Cancelled Message Not Shown Successfully ");
             }
		    implictwait(30);
		    waitForElement(closebutton).click();		
	     	implictwait(50);
	     	refresh();
	     	handledSleep(4);
	     	waitForElement(searchdriver).sendKeys(firstdriver);	
	     	handledSleep(4);          
	     	WebElement vericancel=waitForElement(verifycancel);
            String verifystatus = 		vericancel.getText();   
	     	handledSleep(4);
	     	refresh();
            if(verifystatus.contains("canceled")) {
        	  System.out.println("Cab Trip Canceled Succesfully");
             }
            else {
            	
        	 System.out.println("Cab Trip Not Canceled Sucessfully");
            }
            
		    }
		    catch(Exception e) {
			
		    }
			return this;
		
				
		
        }
	
	public CancelCabTrip verifyCancellation() {
		
		        try{
				File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
			 	Workbook rwb=Workbook.getWorkbook(datafile);
			 	int nous=rwb.getNumberOfSheets();
			 	Sheet rsh=rwb.getSheet(0);
			 	int nour=rsh.getRows();
			   
			 	String firstdriver=rsh.getCell(3, 0).getContents();
			 	System.out.println("First Driver:  "+firstdriver);
			 	refresh();
				waitForElement(searchdriver).sendKeys(firstdriver);	
				
		        handledSleep(5);			
		        }
			    catch(Exception e) {
				System.out.println(e);
			    }
		        
		        scrollup();
		        handledSleep(5);
		        implictwait(40);
		        WebElement verificationofCancel=waitForElement(verifycancel);
		        if(verificationofCancel.isDisplayed()) {
		        	Assert.assertTrue(true);
		        }
		
		        else {
		        	
			    	Assert.fail("Cancel Trip is Not visible");

		        	
		        }
		return this;
		
	}
	
	
	
	
}
	
	
	
	
	