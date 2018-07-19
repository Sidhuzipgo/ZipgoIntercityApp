package in.zipgo.automation_framework.pages.web;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ValidateDriverAppAttendance extends BasePage {

	
	final By transmap               =By.xpath("//i[@class='clip-map']");
	final By bustrips               =By.xpath("//span[text()='Bus Trips']");
	final By search                 =By.xpath("//input[@type='search']");
	final By glyphicon              =By.xpath("(//a[@class='btn btn-default percent_button'])[1]/child::*");
	final By attendanceinfo         =By.xpath("(//a[text()='Attendance Info'])[1]");
	final By attendacestatus        =By.xpath("(//table[@class='table table-striped']/descendant::*[9])[3]");
	final By attendanceclose        =By.xpath("(//button[@class='close'])[3]");
	
	
	
	
	public ValidateDriverAppAttendance validatedriverapp() throws BiffException, IOException, AWTException {
		
		
		
		handledSleep(5);
        implictwait(40);
        refresh();
        scrollup();
        handledSleep(4);
	    clickButton(waitForElement(transmap));
	    //waitForElement(transportation).click();	 
	    implictwait(30);
		waitForElement(bustrips).click();
    	handledSleep(5);
    	
	    
	    File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\applogindata.xls");
 	    Workbook rwb=Workbook.getWorkbook(datafile);
 	    int nous=rwb.getNumberOfSheets();  
		Sheet rsh=rwb.getSheet(0);
 	    int nour=rsh.getRows();
 	    int nouc=rsh.getColumns();
        String driverapploginName         =rsh.getCell(3, 1).getContents();
        System.out.println("Validate Attendance..."+driverapploginName);
        refresh();
	    implictwait(40);
		sendValuesToWebElement(waitForElement(search),driverapploginName);
		handledSleep(4);
	    implictwait(40);
	    scrolldown();
		clickButton(waitForElement(glyphicon));
	    handledSleep(4);
	    implictwait(40);
        clickButton(waitForElement(attendanceinfo));
	    handledSleep(6);
		String attinfopresent=waitForElement(attendacestatus).getText();
	    implictwait(40);
		clickButton(waitForElement(attendanceclose));			
	    handledSleep(4);
		refresh();
		implictwait(5);
		if(attinfopresent.contains("Present")) {
			
			Assert.assertTrue("Driver App Attendance Test pass", true);
			
		}
		else {
			
			Assert.fail("Driver App Attendance Test Fail");			
		}
		
		
		return this;
		
	}
}
