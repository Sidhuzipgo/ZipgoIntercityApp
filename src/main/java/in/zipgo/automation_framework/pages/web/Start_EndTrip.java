package in.zipgo.automation_framework.pages.web;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;

public class Start_EndTrip extends BasePage {
	
	final By clipchevoronright      =By.xpath("//*[@class='clip-chevron-right']");
	final By transmap               =By.xpath("//i[@class='clip-map']");
	final By transportation         =By.xpath("//span[text()='Transportation']");
	final By bustrips               =By.xpath("//span[text()='Bus Trips']");
	
	final By searchdriver           =By.xpath("//input[@type='search']");
	final By glyphicon              =By.xpath("(//span[@class='glyphicon glyphicon-edit'])");
	final By statusdropdown         =By.xpath("//span[@id='select2-cab_trip_status-container']");
	final By starttrip              =By.xpath("//li[text()='Started']");
	final By quicksave              =By.xpath("//button[@class='btn btn-danger btn-sm pull-right']");
    final By finishtrip             =By.xpath("//li[text()='Finished']");
	final By closebutton            =By.xpath("(//button[@class='close'])[3]");
	final By successmsg             =By.xpath("//div[text()='Cab trip is updated successfully']");

	
	public Start_EndTrip start_trip() {
		
		   
		    
		    handledSleep(5);
            implictwait(40);
	        clickButton(waitForElement(transmap));
	        //waitForElement(transportation).click();	 
	        implictwait(30);
		    waitForElement(bustrips).click();
		    try{ 
		    File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CurrentTrip.xls");
		 	Workbook rwb=Workbook.getWorkbook(datafile);
		 	int nous=rwb.getNumberOfSheets();   
		    Sheet rsh=rwb.getSheet(0);
	 	    int nour=rsh.getRows();
	 	 	int nouc=rsh.getColumns();	
	        refresh();
	 	    String currentdriver=rsh.getCell(1, 0).getContents();
		    waitForElement(searchdriver).sendKeys(currentdriver);	
		    handledSleep(5);		


		
	        }
	    	catch(Exception e) {
			
		    }
		
		    scrolldown();
		    moveToElement(glyphicon);
		    handledSleep(3);	
		    implictwait(30);
		    waitForElement(glyphicon).click();
		    handledSleep(5);		
            waitForElement(statusdropdown).click();
	 	    implictwait(50);
		    waitForElement(starttrip).click();
		    implictwait(50);
	     	waitForElement(quicksave).click();
			return this;
	     	
	        }
	
	    	public Start_EndTrip endtrip() {
	
		    implictwait(50);
		    handledSleep(5);		
            WebElement startsuccsmsg=  waitForElement(successmsg);
            if(startsuccsmsg.isDisplayed()) {
            	System.out.println("Trip Started Succesfully");
            }
            else {
            	System.out.println("Trip Not Started Succesfully");
            }

	        waitForElement(statusdropdown).click();
	 	    implictwait(50);
	 	    waitForElement(finishtrip).click();
		    implictwait(50);
		    WebElement finishsuccsmsg=   waitForElement(successmsg);
		    handledSleep(5);		
            if(finishsuccsmsg.isDisplayed()) {
            	
            	Assert.assertTrue("Trip Finished Succesfully", true);
            	
            	
            }
            else {
            	Assert.fail("Trip Not Finished Succesfully");
               }
		    waitForElement(quicksave).click();
		    implictwait(50);
		    waitForElement(closebutton).click();
            refresh();
			return this;
		
	        }

          }
