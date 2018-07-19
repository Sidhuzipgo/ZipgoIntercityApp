package in.zipgo.automation_framework.pages.web;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class DriverAttendance extends BasePage {
	
	final By clipchevoronright    =By.xpath("//*[@class='clip-chevron-right']");
	final By transmap               =By.xpath("//i[@class='clip-map']");
	final By buseselement         =By.xpath("//span[text()='Buses']"); 
	final By supdashboard         =By.xpath("//span[text()='Support Dashboard']");
	final By searchbox            =By.xpath("//input[@placeholder='Search by trip name, driver name']");
    final By attendancestatus1    =By.xpath("(//div[@class='field-status did_not_mark-bg-color'])");
    final By attendancestatus2    =By.xpath("(//div[@class='field-status did_not_mark-bg-color'])");

    final By selectbox            =By.xpath("//select[@class='form-control part-of-dropdown']");
	final By present              =By.xpath("//option[@value='present']");
	final By absent               =By.xpath("//option[@value='absent']");
	final By savebutton           =By.xpath("//button[@class='btn btn-primary custom-editor-select part-of-dropdown']");
	
	final By transportation       =By.xpath("//span[text()='Transportation']");
    final By bustrips             =By.xpath("//span[text()='Bus Trips']");
	final By search               =By.xpath("//input[@type='search']");
	final By glyphicon            =By.xpath("(//a[@class='btn btn-default percent_button'])[1]/child::*");
	final By attendanceinfo       =By.xpath("(//a[text()='Attendance Info'])[1]");
	final By attendacestatus      =By.xpath("(//table[@class='table table-striped']/descendant::*[9])[3]");
	final By attendanceclose      =By.xpath("(//button[@class='close'])[3]");
	
	
	
	
	    public DriverAttendance navigatetoDashboard() 
	  
	    {		  
		    handledSleep(5);
		    waitForElement(clipchevoronright).click();
		    implictwait(40);
		    waitForElement(buseselement).click();
		    implictwait(40);
            waitForElement(supdashboard).click();
			return this;  
			   
		}

	    public DriverAttendance givepresent() throws BiffException, IOException {
	    	
	    	File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();  
			Sheet rsh=rwb.getSheet(0);
	 	    int nour=rsh.getRows();
	 	    int nouc=rsh.getColumns();
	        String cabnamedata         =rsh.getCell(5, 0).getContents();
	        System.out.println("give Present"+cabnamedata);
			sendValuesToWebElement(waitForElement(searchbox),cabnamedata);
		    implictwait(40);
			waitForElement(attendancestatus1).click();
		    implictwait(40);
            WebElement clickattendance= waitForElement(attendancestatus1);
            doubleclick(clickattendance);
		    implictwait(40);
            waitForElement(selectbox).click();
		    implictwait(40);
            waitForElement(present).click();
	        waitForElement(savebutton).click();
	        refresh();
			return this;
           	    	
	    }
	    
	    
	    
        public DriverAttendance giveabsent() throws BiffException, IOException {
	    	
	    	File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();  
			Sheet rsh=rwb.getSheet(0);
	 	    int nour=rsh.getRows();
	 	    int nouc=rsh.getColumns();
	        String cabnamedata         =rsh.getCell(6, 0).getContents();
	        refresh();
		    implictwait(40);
			sendValuesToWebElement(waitForElement(searchbox),cabnamedata);
		    implictwait(40);
			clickButton(waitForElement(attendancestatus1));
		    implictwait(40);
            WebElement clickattendance= waitForElement(attendancestatus2);
            doubleclick(clickattendance);
		    implictwait(40);
			clickButton(waitForElement(selectbox));
		    implictwait(40);
			clickButton(waitForElement(absent));
		    implictwait(40);
			clickButton(waitForElement(savebutton));
		    handledSleep(7);
	        refresh();
	        navigatetobackpage();
	        refresh();
			return this;
	            	
	    	
	    }
        
        public DriverAttendance validateattendace() throws BiffException, IOException {
        	
        	handledSleep(5);
            implictwait(40);
  	        clickButton(waitForElement(transmap));

  	        //waitForElement(transportation).click();	 
  	        implictwait(30);
  		    waitForElement(bustrips).click();
        	handledSleep(5);
        	
		    
		    File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();  
			Sheet rsh=rwb.getSheet(0);
	 	    int nour=rsh.getRows();
	 	    int nouc=rsh.getColumns();
	        String Presentcabnamedata         =rsh.getCell(5, 0).getContents();
	        System.out.println("Validate Attendance..."+Presentcabnamedata);
	        refresh();
		    implictwait(40);
			sendValuesToWebElement(waitForElement(search),Presentcabnamedata);
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
			

			
			
            handledSleep(3);
            String Absentcabnamedata         =rsh.getCell(6, 0).getContents();
            System.out.println("givePresent....."+Absentcabnamedata);
	        refresh();
		    implictwait(40);
			sendValuesToWebElement(waitForElement(search),Absentcabnamedata);
			handledSleep(4);
		    implictwait(40);
			clickButton(waitForElement(glyphicon));
			handledSleep(4);
		    implictwait(40);
			clickButton(waitForElement(attendanceinfo));
			handledSleep(6);
		    implictwait(40);
			String attinfoabsent=waitForElement(attendacestatus).getText();
			System.out.println("-Validate absent---"+attinfoabsent);
			if(attinfoabsent.contains("Absent")) {
				
				Assert.assertTrue(true);
			}
			else {
		    	Assert.fail("Absent Trip is Not Created");

				
			}
			
			
			
			clickButton(waitForElement(attendanceclose));
	        refresh();
	        //.........................................................................
	        System.out.println("Attendance Info=  "+attinfopresent);
			if(attinfopresent.contains("Present")) {
				
				System.out.println("Attendance Test Pass");
				Assert.assertTrue(true);
				
			}
			else {
				Assert.fail("Present trip is Not Created");
				
			}
	        
	        
			return this;
        	
        }
        
        
	    
	    
}
