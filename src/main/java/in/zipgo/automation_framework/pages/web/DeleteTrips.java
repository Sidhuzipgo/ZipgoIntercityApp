package in.zipgo.automation_framework.pages.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DeleteTrips extends BasePage {
	
	final By clipchevoronright        =By.xpath("//*[@class='clip-chevron-right']");
	final By bustrips                 =By.xpath("//span[text()='Bus Trips']");
	final By transportation           =By.xpath("//span[text()='Transportation']");

	final By searchdriver             =By.xpath("//input[@type='search']");
	final By checkboxall              =By.xpath("//input[@id='checkbox-all']");
	final By deleteall                =By.xpath("//a[@id='delete_ctrl']/child::*");
	final By tripsearch               =By.xpath("//*[@type='search']");
	final By tripnameone              =By.xpath("(//tr)[2]/descendant::*[4]");
	final By tripdelete               =By.xpath("(//span[@class='glyphicon glyphicon-trash'])[1]");

	final By deletearchive          =By.xpath("//span[@class='glyphicon glyphicon-trash']");
	final By allcabdelete             =By.xpath("//a[@id='delete_ctrl']/child::*");
	final By allcheckbox              =By.xpath("//input[@id='checkbox-all']");
	
	
	public DeleteTrips deletealltrips() throws BiffException, IOException, InterruptedException {
		
		 handledSleep(4);
		 refresh();
		 scrollup();
         moveToElement(clipchevoronright);
		 handledSleep(4);
         clickButton(waitForElement(clipchevoronright));
         clickButton(waitForElement(transportation));
         clickButton(waitForElement(bustrips));
         
          File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	  Workbook rwb=Workbook.getWorkbook(datafile);
	 	  int nous=rwb.getNumberOfSheets();
	 	  Sheet rsh=rwb.getSheet(0);
 		  int nour=rsh.getRows();
 	      int nouc=rsh.getColumns(); 
          
 	      for(int j=1;j<=3;j++) {
 	      String cabnamedata         =rsh.getCell(j, 0).getContents();
 	      waitForElement(tripsearch).sendKeys(cabnamedata);
 	      
 	      WebElement x=waitForElement(allcheckbox);
 	      handledSleep(2);
 	    // selectradiobutton(x);

 	     List<WebElement> deletecheckbox = waitForElementsBy(deletearchive);
         for(WebElement button : deletecheckbox) {
         implictwait(30);
         if(button.isDisplayed()) {
         implictwait(30);
         try {
          button.click();
         }
         catch(UnhandledAlertException alert) {
        	 alertaccept();
         }



         
         }
         }
         handledSleep(2);
         implictwait(30);
         clickButton(waitForElement(allcabdelete));

 	      
 	      
 	     /* for(int i=1;i<=3;i++){
 		  handledSleep(4);

         try{
       	  
         scrollToElement(tripdelete);
		 handledSleep(3);

 	      if(isDisplayed(tripdelete)){
 	     
	          clickButton(waitForElement(tripdelete));
			  handledSleep(4);
	          implictwait(40);
	          alertaccept();
	          //actionenter();
	         


	          

 	      } 
 	    else{
 	 	    scrollup();

	      }   	 	 	  

         } 	 	 	    

         catch(UnhandledAlertException alert) {
        	 alertaccept();
         }
         catch(Exception e){
       	 
       	  
         }
	 	   

 	    } 	*/
 	      refresh();
 	      }
		return null;
		
		
}

	
}