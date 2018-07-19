package in.zipgo.automation_framework.pages.web;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import jxl.Sheet;
import jxl.Workbook;

public class TransferTrip extends BasePage {

	
	final By searchdriver           =By.xpath("//input[@type='search']");
	final By glyphicon              =By.xpath("(//span[@class='glyphicon glyphicon-edit'])[2]");
	final By statusdropdown         =By.xpath("(//span[@title='Accepted'])[1]");
	final By cancelstatus           =By.xpath("//li[text()='Canceled']");
	final By cancelreason			=By.xpath("//span[text()='Select Cancel Reason']");
	final By wrongtripreason        =By.xpath("//li[text()='Wrong Trip Made']");
	
	final By chooseaction           =By.xpath("//span[text()='Select Option']");
	final By transfercab            =By.xpath("//li[text()='Transfer Trip']");
	final By selectcab              =By.xpath("(//span[text()='Type a bus name or phone'])[1]");
	final By newcab                 =By.xpath("(//input[@type='search'])[5]");
	final By selectnewcab           =By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
	final By quicksave              =By.xpath("//button[@class='btn btn-danger btn-sm pull-right']");
    final By transfereddriver       =By.xpath("(//tbody)[1]/descendant::*[5]");
	
	
	public TransferTrip transfertrip() {
		
		    try{
			File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();
	 	    Sheet rsh=rwb.getSheet(0);
	 	    int nour=rsh.getRows();
	        refresh();
	 	    String secondriver=rsh.getCell(2, 0).getContents();
		    waitForElement(searchdriver).sendKeys(secondriver);	
		    handledSleep(5);		
	
	        }
	    	catch(Exception e) {
			
		    }
		
		    scrolldown();
		    moveToElement(glyphicon);
	     	implictwait(30);
		    waitForElement(glyphicon).click();
		    handledSleep(7);		

            waitForElement(statusdropdown).click();
		    implictwait(50);
		    waitForElement(cancelstatus).click();
		    implictwait(50);
		    waitForElement(cancelreason).click();
		    implictwait(50);
		    waitForElement(wrongtripreason).click();
		    implictwait(50);		
		    waitForElement(chooseaction).click();
		    implictwait(50);	
	     	waitForElement(transfercab).click();
	    	implictwait(50);	
	    	waitForElement(selectcab).click();
		    implictwait(50);	
		    sendValuesToWebElement(waitForElement(newcab),"Transfer Driver");
		    implictwait(50);	
		    waitForElement(selectnewcab).click();
		    implictwait(50);	
            waitForElement(quicksave).click();
		    implictwait(50);
		    navigatetobackpage();
			return this;		
        
        
	        }
	
	public TransferTrip verify_transfer() {
		
		refresh();
	    sendValuesToWebElement(waitForElement(newcab),"Transfer Driver");
	    WebElement transfer_driver=waitForElement(transfereddriver);
	   
	    if(transfer_driver.isDisplayed()) {
	    	
	    	Assert.assertTrue(true, "Driver is Transfered Successfully");
	    	
	    	
	    }
	    else {
	    	Assert.fail("Driver is Not Transfered Successfully");
	    	
	    }
	    refresh();
		return this;
		
	}
	
	
	
	
	
	
}
