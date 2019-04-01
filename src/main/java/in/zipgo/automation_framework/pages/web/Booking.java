package in.zipgo.automation_framework.pages.web;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Booking extends BasePage{
	
	
	final By from                            = By.xpath("(//*[@role='combobox'])[1]");
	final By selectdropdown                  = By.xpath("//a[@class='dropdown-item']");
	final By to                              = By.xpath("(//*[@role='combobox'])[2]");
	final By date                            = By.xpath("//input[@id='your_unique_id']");
	final By searchbutton                    = By.xpath("//button[@class='searchButton btn btn-secondary']");
	final By firsttriponlist                 = By.xpath("(//a[@class='view-trip'])[1]");
	final By firstfreeseat                   = By.xpath("(//td[@class='each-seat seater'])[1]");
	final By secondfreeseat                  = By.xpath("(//td[@class='each-seat seater'])[2]");
	final By customerName                    = By.xpath("//input[@id='customerName']");
	final By customerphone                   = By.xpath("//input[@id='customerNo']");
	final By malebutton                      = By.xpath("//input[@value='M']");
    final By malebuttonone                   = By.xpath("(//input[@value='M'])[1]");
    final By malebuttontwo                   = By.xpath("(//input[@value='M'])[2]");
	final By pickuppoint                     = By.xpath("//select[@name='pickup']");
	final By droppoint                       = By.xpath("//select[@name='dropoff']");
	final By originalfare                    = By.xpath("//div[@class='totalFare text-right col col-sm-7']");
	final By customerfare                    = By.xpath("//input[@id='fare']");
	final By bookseatbutton                  = By.xpath("//button[@class='bookButton pull-right btn btn-success btn-lg']");
	final By viewbooking                     = By.xpath("//a[text()='View Booking']");
	final By pnrnumber                       = By.xpath("(//a[@target='_blank'])[1]");
	final By confirmpnr                      = By.xpath("(//label[@class='form-control-label'])[2]");
	final By confirmstatus                   = By.xpath("//span[@class='badge badge-success']");
	
	final By createBooking                   = By.xpath("//a[text()='Create New Booking']");
	final By cancelbooking                   = By.xpath("//a[text()='Cancel Booking']");
	final By selectall                       = By.xpath("//*[text()='Select All']");
	final By selectallamount                 = By.xpath("(//input[@type='text'])[6][@class='form-control']");
	final By confirmandcancel                = By.xpath("//button[text()='Confirm and Cancel']");
	final By cancelyes                       = By.xpath("//button[text()='Yes']");
	final By searchbar                       = By.xpath("//input[@placeholder='Search']");
	
	final By selectoneseat                   = By.xpath("(//*[text()='Select'])[1]");
	final By selectoneamount                 = By.xpath("(//input[@class='form-control'])[9]");
	
	final By mybookings                      = By.xpath("//*[text()='My Bookings']");
	final By selecttype                      = By.xpath("//label[text()='Status']/following::*[1]");
	final By confirmedtrips                  = By.xpath("//*[text()='Confirmed']");
	final By searchtrips                     = By.xpath("//button[text()='Search']");
	final By confirmlist                     = By.xpath("//span[@class='badge badge-success']");
	final By editname                        = By.xpath("//input[@name='name']");
	final By editphone                       = By.xpath("//input[@name='phoneNo']");
	final By savechange                      = By.xpath("//button[text()='Save Changes']");
	
	
	
	
	
	
	
	
	public Booking createBooking() {
		 
		    handledSleep(3);
	        implictwait(30);
			sendValuesToWebElement(waitForElement(from),"chan");
			handledSleep(1);
	        implictwait(30);
	        clickButton(waitForElement(selectdropdown));	       
	        handledSleep(2);
	        implictwait(30);
			sendValuesToWebElement(waitForElement(to),"DEL");
			//handledSleep(4);
	        implictwait(30);
	        clickButton(waitForElement(selectdropdown));	       
	        handledSleep(2);
	        implictwait(30);
	        waitForElement(date).clear();	 
	        handledSleep(4);
	        implictwait(30);
		     
		    DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		    Date currentDate = new Date();
	        Calendar c = Calendar.getInstance();
	        c.setTime(currentDate);	       
	        c.add(Calendar.DATE, 2); 	       
	        Date currentDatePlusOne = c.getTime();
	        System.out.println(dateFormat.format(currentDatePlusOne));
	        waitForElement(date).sendKeys(dateFormat.format(currentDatePlusOne));	
	        handledSleep(2);
	        implictwait(30);
	        clickButton(waitForElement(searchbutton));	 
	        handledSleep(2);
	        implictwait(30);	        
	        clickButton(waitForElement(firsttriponlist));	 
	        handledSleep(2);
	        implictwait(30);
	        clickButton(waitForElement(firstfreeseat));	 
	        handledSleep(2);
	        implictwait(30);
	        clickButton(waitForElement(secondfreeseat));
	        handledSleep(2);
	        implictwait(30);
	        scrolldown();
			sendValuesToWebElement(waitForElement(customerName),"ContactTest1");
			handledSleep(2);
	        implictwait(30);
			sendValuesToWebElement(waitForElement(customerphone),"9898912345");
	        scrolldown();
	        clickButton(waitForElement(malebuttonone));
	        clickButton(waitForElement(malebuttontwo));
	        handledSleep(2);
	        implictwait(30);
	        scrolldown();
	        clickButton(waitForElement(pickuppoint));
	        handledSleep(2);
	        implictwait(30);
	        actiondownkey();
	        handledSleep(2);
	        implictwait(30);
	        actionenter();
	        handledSleep(2);
	        implictwait(30);	        
	        clickButton(waitForElement(droppoint));
	        handledSleep(2);
	        implictwait(30);
	        actiondownkey();
	        handledSleep(2);
	        implictwait(30);
	        actionenter();
	        handledSleep(2);
	        implictwait(30);
	        scrolldown();
	        String fare=driver.findElement(originalfare).getText();
	        String[] farearray=fare.split(" ");
	        fare=farearray[1]; 
	        int fareinteger=Integer.parseInt(fare);
	        int customerinteger =fareinteger+100;
	        String customerfares = Integer.toString(customerinteger);
			sendValuesToWebElement(waitForElement(customerfare),customerfares);
		    handledSleep(2);
		    implictwait(30);
	        clickButton(waitForElement(bookseatbutton));
	        handledSleep(4);
		    implictwait(30);
		    String pnrnum=driver.findElement(pnrnumber).getText();	
		    System.out.println("PNR=="+pnrnum);
		    handledSleep(2);
		    implictwait(30);
		    clickButton(waitForElement(viewbooking));
		    handledSleep(2);
		    implictwait(30);
		    switchToLastTab();
		    handledSleep(4);
		    implictwait(30);
		    String confPNR=driver.findElement(confirmpnr).getText();	
		    System.out.println("Conf pnr=="+confPNR);
		    int a =driver.findElements(confirmstatus).size();
		    System.out.println(a);
		    if(a>0 && confPNR.contains(pnrnum)) {
		    	
		    	System.out.println("Booking was Successfull");
		    }
		    else {
		    	System.out.println("Booking was Not confirmed");
		    }


	        return this;
	    }
	 
	 
	
	public Booking CancelAllBooking() {
		
		handledSleep(3);
        implictwait(30);		
        clickButton(waitForElement(createBooking));			 
	    handledSleep(3);
        implictwait(30);
		sendValuesToWebElement(waitForElement(from),"chan");
		handledSleep(1);
        implictwait(30);
        clickButton(waitForElement(selectdropdown));	       
        handledSleep(2);
        implictwait(30);
		sendValuesToWebElement(waitForElement(to),"DEL");
		//handledSleep(4);
        implictwait(30);
        clickButton(waitForElement(selectdropdown));	       
        handledSleep(2);
        implictwait(30);
        waitForElement(date).clear();	 
        handledSleep(4);
        implictwait(30);
	     
	    DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	    Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);	       
        c.add(Calendar.DATE, 2); 	       
        Date currentDatePlusOne = c.getTime();
        System.out.println(dateFormat.format(currentDatePlusOne));
        waitForElement(date).sendKeys(dateFormat.format(currentDatePlusOne));	
        handledSleep(2);
        implictwait(30);
        clickButton(waitForElement(searchbutton));	 
        handledSleep(2);
        implictwait(30);	        
        clickButton(waitForElement(firsttriponlist));	 
        handledSleep(2);
        implictwait(30);
        clickButton(waitForElement(firstfreeseat));	 
        handledSleep(2);
        implictwait(30);
        clickButton(waitForElement(secondfreeseat));
        handledSleep(2);
        implictwait(30);
        scrolldown();
		sendValuesToWebElement(waitForElement(customerName),"ContactTest1");
		handledSleep(2);
        implictwait(30);
		sendValuesToWebElement(waitForElement(customerphone),"9898912345");
        scrolldown();
        clickButton(waitForElement(malebuttonone));
        clickButton(waitForElement(malebuttontwo));
        handledSleep(2);
        implictwait(30);
        scrolldown();
        clickButton(waitForElement(pickuppoint));
        handledSleep(2);
        implictwait(30);
        actiondownkey();
        handledSleep(2);
        implictwait(30);
        actionenter();
        handledSleep(2);
        implictwait(30);	        
        clickButton(waitForElement(droppoint));
        handledSleep(2);
        implictwait(30);
        actiondownkey();
        handledSleep(2);
        implictwait(30);
        actionenter();
        handledSleep(2);
        implictwait(30);
        scrolldown();
        String fare=driver.findElement(originalfare).getText();
        String[] farearray=fare.split(" ");
        fare=farearray[1]; 
        int fareinteger=Integer.parseInt(fare);
        int customerinteger =fareinteger+100;
        String customerfares = Integer.toString(customerinteger);
		sendValuesToWebElement(waitForElement(customerfare),customerfares);
	    handledSleep(2);
	    implictwait(30);
        clickButton(waitForElement(bookseatbutton));
        handledSleep(4);
	    implictwait(30);
	    String pnrnum=driver.findElement(pnrnumber).getText();	
	    System.out.println("PNR=="+pnrnum);
	    handledSleep(2);
	    implictwait(30);
	    clickButton(waitForElement(viewbooking));
	    handledSleep(2);
	    implictwait(30);
	    switchToLastTab();
	    handledSleep(4);
	    implictwait(30);
	    String confPNR=driver.findElement(confirmpnr).getText();	
	    System.out.println("Conf pnr=="+confPNR);
	    int a =driver.findElements(confirmstatus).size();
	    System.out.println(a);
	    if(a>0 && confPNR.contains(pnrnum)) {
	    	
	    	handledSleep(2);
	 	    implictwait(30);
		    clickButton(waitForElement(cancelbooking));
		    handledSleep(2);
		    implictwait(30);
		    clickButton(waitForElement(selectall));
		    handledSleep(5);
		    implictwait(30);
		    //(//input[@class='form-control'])[8]
		    //waitForElement(selectallamount).clear();
		    String amount ="1";
			sendValuesToWebElement(waitForElement(selectallamount),amount);
			handledSleep(2);
	 	    implictwait(30);
		    clickButton(waitForElement(confirmandcancel));
		    handledSleep(2);
	 	    implictwait(30);
		    clickButton(waitForElement(cancelyes));
		    handledSleep(2);
	 	    implictwait(30);
			//sendValuesToWebElement(waitForElement(searchbar),confPNR);	    


	    }
	    else {
	    	System.out.println("Booking was Not confirmed");
	    }


        return this;
    }
	 
	public Booking PartialCancellation() {
		
		handledSleep(3);
        implictwait(30);		
        clickButton(waitForElement(createBooking));			 
	    handledSleep(3);
        implictwait(30);
		sendValuesToWebElement(waitForElement(from),"chan");
		handledSleep(1);
        implictwait(30);
        clickButton(waitForElement(selectdropdown));	       
        handledSleep(2);
        implictwait(30);
		sendValuesToWebElement(waitForElement(to),"DEL");
		//handledSleep(4);
        implictwait(30);
        clickButton(waitForElement(selectdropdown));	       
        handledSleep(2);
        implictwait(30);
        waitForElement(date).clear();	 
        handledSleep(4);
        implictwait(30);
	     
	    DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	    Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);	       
        c.add(Calendar.DATE, 2); 	       
        Date currentDatePlusOne = c.getTime();
        System.out.println(dateFormat.format(currentDatePlusOne));
        waitForElement(date).sendKeys(dateFormat.format(currentDatePlusOne));	
        handledSleep(2);
        implictwait(30);
        clickButton(waitForElement(searchbutton));	 
        handledSleep(2);
        implictwait(30);	        
        clickButton(waitForElement(firsttriponlist));	 
        handledSleep(2);
        implictwait(30);
        clickButton(waitForElement(firstfreeseat));	 
        handledSleep(2);
        implictwait(30);
        clickButton(waitForElement(secondfreeseat));
        handledSleep(2);
        implictwait(30);
        scrolldown();
		sendValuesToWebElement(waitForElement(customerName),"ContactTest1");
		handledSleep(2);
        implictwait(30);
		sendValuesToWebElement(waitForElement(customerphone),"9898912345");
        scrolldown();
        clickButton(waitForElement(malebuttonone));
        clickButton(waitForElement(malebuttontwo));
        handledSleep(2);
        implictwait(30);
        scrolldown();
        clickButton(waitForElement(pickuppoint));
        handledSleep(2);
        implictwait(30);
        actiondownkey();
        handledSleep(2);
        implictwait(30);
        actionenter();
        handledSleep(2);
        implictwait(30);	        
        clickButton(waitForElement(droppoint));
        handledSleep(2);
        implictwait(30);
        actiondownkey();
        handledSleep(2);
        implictwait(30);
        actionenter();
        handledSleep(2);
        implictwait(30);
        scrolldown();
        String fare=driver.findElement(originalfare).getText();
        String[] farearray=fare.split(" ");
        fare=farearray[1]; 
        int fareinteger=Integer.parseInt(fare);
        int customerinteger =fareinteger+100;
        String customerfares = Integer.toString(customerinteger);
		sendValuesToWebElement(waitForElement(customerfare),customerfares);
	    handledSleep(2);
	    implictwait(30);
        clickButton(waitForElement(bookseatbutton));
        handledSleep(4);
	    implictwait(30);
	    String pnrnum=driver.findElement(pnrnumber).getText();	
	    System.out.println("PNR=="+pnrnum);
	    handledSleep(2);
	    implictwait(30);
	    clickButton(waitForElement(viewbooking));
	    handledSleep(2);
	    implictwait(30);
	    switchToLastTab();
	    handledSleep(4);
	    implictwait(30);
	    String confPNR=driver.findElement(confirmpnr).getText();	
	    System.out.println("Conf pnr=="+confPNR);
	    int a =driver.findElements(confirmstatus).size();
	    System.out.println(a);
	    if(a>0 && confPNR.contains(pnrnum)) {
	    	
	    	handledSleep(2);
	 	    implictwait(30);
		    clickButton(waitForElement(cancelbooking));
		    handledSleep(2);
		    implictwait(30);
		    clickButton(waitForElement(selectoneseat));
		    handledSleep(2);
		    implictwait(30);
		    //(//input[@class='form-control'])[8]
		    //waitForElement(selectallamount).clear();
			sendValuesToWebElement(waitForElement(selectoneamount),"1");
			handledSleep(2);
	 	    implictwait(30);
		    clickButton(waitForElement(confirmandcancel));
		    handledSleep(2);
	 	    implictwait(30);
		    clickButton(waitForElement(cancelyes));
		    handledSleep(2);
	 	    implictwait(30);
			//sendValuesToWebElement(waitForElement(searchbar),confPNR);	    


	    }
	    else {
	    	System.out.println("Booking was Not confirmed");
	    }


        return this;
    }
	
	
	public Booking EditBooking() {
		
		handledSleep(2);
 	    implictwait(30);
	    clickButton(waitForElement(mybookings));
	    handledSleep(4);
 	    implictwait(30); 	   
	    clickButton(waitForElement(selecttype));
	    handledSleep(1);
 	    implictwait(30); 	
	    clickButton(waitForElement(confirmedtrips));
	    handledSleep(1);
 	    implictwait(30); 
	    clickButton(waitForElement(searchtrips));
	    handledSleep(3);
 	    implictwait(30); 
        List<WebElement> confirmbookings = driver.findElements(confirmlist);	
        confirmbookings.get(0).click();
        handledSleep(3);
 	    implictwait(30); 
 	    waitForElement(editname).clear();
 	    handledSleep(3);
	    implictwait(30);
		sendValuesToWebElement(waitForElement(editname),"EditName");
		handledSleep(3);
		implictwait(30);
		waitForElement(editphone).clear();
	 	handledSleep(3);
		implictwait(30);
		sendValuesToWebElement(waitForElement(editphone),"9897987612");
		handledSleep(3);
		implictwait(30);
	    clickButton(waitForElement(savechange));

		return this;
	}

	
	
	
	
	
	
	

}
