package in.zipgo.automation_framework.pages.web;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import in.zipgo.automation_framework.pages.mobile.CustomerApp;
import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CreateOrder extends BasePage {
	
	final By clipchevoronright     = By.xpath("//i[@class='clip-chevron-right']");
	final By clipcart              = By.xpath("//i[@class='clip-cart']");
	final By sidebarorders         = By.xpath("//span[text()='Orders']");
	final By createneworder        = By.xpath("//a[@class='btn-new-order']/child::*");
    final By custiddropdown        = By.xpath("//span[@id='select2-customer_id-container']/following::*[1]");
    final By selectcustid          = By.xpath("(//span[@class='select2-selection__arrow'])[7]");
    final By pickupdropdown        = By.xpath("//span[@id='select2-order_start_location_attributes_stop_point_id-container']");
    final By enterpickuplocation   = By.xpath("");
    final By destinationdropdown   = By.xpath("//span[@id='select2-order_end_location_attributes_stop_point_id-container']");
    
    final By reqtripradiobut       = By.xpath("//input[@name='order[cab_trip_id]']");
    
    final By enterbox              = By.xpath("//input[@class='select2-search__field']");
    final By savebutton            = By.xpath("//a[@class='btn btn-orange btn-submit-order']/child::*[2]");
    
    
    final By ordermsg              = By.xpath("//div[@class='modal-body']/child::*[1]");
    final By neworderclose         = By.xpath("(//button[@class='close'])[3]");
    
    final By sidebooking           = By.xpath("//span[text()='Bookings']");
    final By bookingsearch         = By.xpath("//input[@type='search']");
    final By afterbookphone        = By.xpath("//a[@onclick='manageOrder.phoneClicked(this)']");
    
    final By ordersearchby         = By.xpath("//span[@title='Search By']");
    final By searchbyemail         = By.xpath("//li[text()='Email']");
    final By orderkeyword          = By.xpath("//input[@name='search[keyword]']");
    final By ordersearch           = By.xpath("//input[@value='Search']");
    
    final By ordercreatetime       = By.xpath("//tr[@class='odd']/child::*[3]");
    
    final By transportation        = By.xpath("//span[text()='Transportation']");
	final By bustrips              = By.xpath("//span[text()='Bus Trips']");
	final By search                = By.xpath("//input[@type='search']");
	final By glyphicon             = By.xpath("//span[@class='glyphicon glyphicon-edit']");
	final By ordersinpopup         = By.xpath("(//a[text()='Orders'])[1]");
	final By listoforder           = By.xpath("(//tr[@class='odd']/child::td[1])[4]");

    
    
    public  CreateOrder  create_neworder1() throws BiffException, IOException  {
    	
    	    handledSleep(5);
            implictwait(40);
	        clickButton(waitForElement(clipcart));
	        implictwait(30);
		    waitForElement(createneworder).click();
		    
  	   

    	  // waitForElement(selectcustid).click();
		  File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateOrder.xls");
	 	  Workbook rwb=Workbook.getWorkbook(datafile);
	 	  Sheet rsh=rwb.getSheet(0);
      
	      String customer1         =rsh.getCell(1, 1).getContents();
	      System.out.println(customer1);
	      handledSleep(5);
	      clickButton(waitForElement(custiddropdown));
		  sendValuesToWebElement(waitForElement(enterbox),customer1);
	      handledSleep(2);

		  actionenter();
		  File datafile1=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	  Workbook rwb1=Workbook.getWorkbook(datafile1);
	 	  int nous=rwb1.getNumberOfSheets();   
		  Sheet rsh1=rwb1.getSheet(0);

	      String pickuploc      =rsh1.getCell(1, 7).getContents();
	      String droploc        =rsh1.getCell(1, 8).getContents();
	     
	    
	      implictwait(30);
		  clickButton(waitForElement(pickupdropdown));
		  sendValuesToWebElement(waitForElement(enterbox),pickuploc);
		  actionenter();
		  implictwait(30);
		  clickButton(waitForElement(destinationdropdown));
		  sendValuesToWebElement(waitForElement(enterbox),droploc);
		  actionenter();
	      handledSleep(2);
		  selectradiobutton(waitForElement(reqtripradiobut));
	      handledSleep(2);
		  clickButton(waitForElement(savebutton));
	      handledSleep(2);
	      WebElement ordersuccesmsg=waitForElement(ordermsg);
	      String messegeshown=ordersuccesmsg.getText();
	      System.out.println("Message  :"+messegeshown);
		  if(messegeshown.contains(" Your order is saved successfully!")) {
			  
			  Assert.assertTrue("Order Created Sucessfully", true);
			    implictwait(40);
			    clickButton(waitForElement(neworderclose));
			    refresh();
			 
		  }
		  else if(messegeshown.contains("Customer has insufficient balance"))
		  {
			  implictwait(30);
			  refresh();
			  Assert.fail("Order not created Sucessfully");
			  
			 
		  }
		 

		    implictwait(30);
		    refresh();
		    return this;
      
    }
    
    public  CustomerApp  create_new_rac_order() throws BiffException, IOException  {
    	
	    handledSleep(5);
        implictwait(40);
        clickButton(waitForElement(clipcart));
        implictwait(30);
	    waitForElement(createneworder).click();
	    
	   

	  // waitForElement(selectcustid).click();
	  File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\Rac.xls");
 	  Workbook rwb=Workbook.getWorkbook(datafile);
 	  Sheet rsh=rwb.getSheet(0);
  
      String customer1         =rsh.getCell(1, 10).getContents();
      System.out.println(customer1);
      handledSleep(5);
      clickButton(waitForElement(custiddropdown));
	  sendValuesToWebElement(waitForElement(enterbox),customer1);
      handledSleep(2);

	  actionenter();
	  File datafile1=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\Rac.xls");
 	  Workbook rwb1=Workbook.getWorkbook(datafile1);
 	  int nous=rwb1.getNumberOfSheets();   
	  Sheet rsh1=rwb1.getSheet(0);

      String pickuploc      =rsh1.getCell(1, 8).getContents();
      String droploc        =rsh1.getCell(1, 9).getContents();
     
    
      implictwait(30);
	  clickButton(waitForElement(pickupdropdown));
	  sendValuesToWebElement(waitForElement(enterbox),pickuploc);
	  actionenter();
	  implictwait(30);
	  clickButton(waitForElement(destinationdropdown));
	  sendValuesToWebElement(waitForElement(enterbox),droploc);
	  actionenter();
      handledSleep(2);
	  selectradiobutton(waitForElement(reqtripradiobut));
      handledSleep(2);
	  clickButton(waitForElement(savebutton));
      handledSleep(2);
      WebElement ordersuccesmsg=waitForElement(ordermsg);
      String messegeshown=ordersuccesmsg.getText();
      System.out.println("Message  :"+messegeshown);
	  if(messegeshown.contains(" Your order is saved successfully!")) {
		  
		  Assert.assertTrue("Order Created Sucessfully", true);
		    implictwait(40);
		    clickButton(waitForElement(neworderclose));
		    refresh();
		 
	  }
	  else if(messegeshown.contains("Customer has insufficient balance"))
	  {
		  implictwait(30);
		  refresh();
		  Assert.fail("Order not created Sucessfully");
		  
		 
	  }
	 

	    implictwait(30);
	    refresh();
	    return new CustomerApp();
  
}
    
    
		 public CreateOrder validate_newOrder() throws BiffException, IOException {
			 
			File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateOrder.xls");
		 	Workbook rwb=Workbook.getWorkbook(datafile);
		 	Sheet rsh=rwb.getSheet(0);
		 	  
		    String customer1         =rsh.getCell(1, 1).getContents();

		    implictwait(60);
			clickButton(waitForElement(clipchevoronright));
	    	implictwait(40);
			clickButton(waitForElement(sidebarorders));
	    	implictwait(40);
			clickButton(waitForElement(sidebooking));
	    	implictwait(40);
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
	    	moveToElement(bookingsearch);
	    	handledSleep(3);
			clickButton(waitForElement(ordersearchby));
			clickButton(waitForElement(searchbyemail));
			

			sendValuesToWebElement(waitForElement(orderkeyword),customer1);
		    handledSleep(2);
			clickButton(waitForElement(ordersearch));

			String custphonenum =getTextFromElement(afterbookphone);	
			System.out.println("Customer Phone Num:  "+custphonenum);
		    String custphonenumber         =rsh.getCell(2, 1).getContents();
		    refresh();
		    handledSleep(2);
		    
		    String ordertime=getTextFromElement(ordercreatetime);
		    System.out.println(ordertime);
		    String[] splittime =ordertime.split(":");
		    String splithour=splittime[0];
		    String splitminute=splittime[1];
		    int splithour1=Integer.parseInt(splithour);
		    int splitminute1=Integer.parseInt(splitminute);
		    
		    
		    
		    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			
			
			String currenttime=dateFormat.format(date);
			String[] currenttimesplit=currenttime.split(":");
			String currenthour=currenttimesplit[0];
			String currentminute=currenttimesplit[1];
			int currenthour1=Integer.parseInt(currenthour);
		    int currentminute1=Integer.parseInt(currentminute);
		    
		    
		    if(splithour1==currenthour1 && splitminute1==currentminute1 ) {
		    	Assert.assertTrue(true);

		    }
		    else if(splithour1==currenthour1 || splithour1==currenthour1+1 &&  splitminute1==currentminute1+1 || splitminute1==currentminute1+2 ) {
		    	Assert.assertTrue(true);

		    }
		    
		    else {
		    	Assert.fail("Time is Not Matching ");
		    	//Assert.fail();
		    }
		    
		    if( custphonenum.contains(custphonenumber)) {
		    	Assert.assertTrue(true);

		    }
		    else {
		    	Assert.fail("Customer Phone Number Not Matching");

		    	
		    }

		  
		     
   	        navigatetobackpage();
		    return this;
    	
    	
       }
	
		 public CreateOrder board_customer() {
				
				
		     clickButton(waitForElement(clipchevoronright));
		     handledSleep(2);
		     implictwait(50);
		     

			return this;
			
		}

   }
