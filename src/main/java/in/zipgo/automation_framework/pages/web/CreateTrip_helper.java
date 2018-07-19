
	package in.zipgo.automation_framework.pages.web;

	import org.bouncycastle.util.Arrays.Iterator;
import org.junit.Assert;
import org.openqa.selenium.By;
	import java.io.File;

	import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import in.zipgo.automation_framework.pages.mobile.CustomerApp;
import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

//............................30/12/2017..........................................

	public class CreateTrip_helper extends BasePage {
		
		final By clipchevoronright  = By.xpath("//*[@class='clip-chevron-right']");
		final By bustrips           = By.xpath("//span[text()='Bus Trips']");
		final By createnew          = By.xpath("//a[text()='Create New']");
		final By clickbusname       = By.xpath("//span[text()='Type a bus name or phone']");
		final By sendbusname        = By.xpath("(//input[@class='select2-search__field'])[4]");
		final By selectbusname      = By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
		final By waitforbusname     = By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
		final By maxseats           = By.id("cab_trip_maximum_seats");
		final By racseats           = By.id("cab_trip_max_rac_seats");
		final By actrip             = By.id("select2-cab_trip_ac_bus-container");
		final By routegroup         = By.id("select2-cab_trip_route_group_id-container");
		final By routegroup1        = By.xpath("(//input[@class='select2-search__field'])[4]");
		final By waitforroute       = By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
		final By operatingdate      = By.xpath("//input[@class='form-control date-picker']");
		final By waitfordate        = By.xpath("//td[@class='today day']");
		final By starttime          = By.id("select2-cab_trip_start_hour-container");
		final By starthour          = By.xpath("(//input[@class='select2-search__field'])[4]");
		final By startminute        = By.id("select2-cab_trip_start_minute-container");
		final By sendstartminute    = By.xpath("(//input[@class='select2-search__field'])[4]");
		final By pricerule          = By.id("select2-cab_trip_price_rule_id-container");
		final By selectuniform      = By.xpath("(//li[@role='treeitem'])[3]");
		final By payementplan       = By.id("select2-cab_trip_payment_plan-container");
		final By testplantrip       = By.xpath("//li[text()='TestPlan-Trip']");
		final By categoryname       = By.id("cab_trip_display_category_name");
		final By quicksave          = By.xpath("//button[@class='btn btn-danger btn-sm pull-right']");
		
		final By close              = By.xpath("(//button[@class='close'])[2]");
		
		
		final By datebox            = By.xpath("//input[@id='cab_trip_operating_date']");
		
		
		final By searchdriver       = By.xpath("//input[@type='search']");
		final By drivernames        = By.xpath("//a[@onclick='CabTripOrders.initEditOrder(this)']");

		final By startdatecal       = By.xpath("//input[@id='search_start_date']");
		final By enddatecal         = By.xpath("//input[@id='search_end_date']");
		final By searchcal          = By.xpath("//button[@class='btn btn-teal btn-small']");

		
		final By transportation     = By.xpath("");
		
		
		
		public CreateTrip_helper currenttrip() throws BiffException, IOException {
			
			File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\CurrentTrip.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();   
	 	    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			
			
			String currenttime=dateFormat.format(date);
			String[] currenttimesplit=currenttime.split(":");
			String currenthour=currenttimesplit[0];
			String currentminute=currenttimesplit[1];
			int currenthour1=Integer.parseInt(currenthour);
		    int currentminute1=Integer.parseInt(currentminute);
		    
		    if(currenthour1<10) {
		    	
		    	currenthour=currenthour.substring(1, currenthour.length());
		    }
		    else {
		    	currenthour=currenthour;
		    }
		    if(currentminute1<10) {
		    	currentminute1=currentminute1+10;
		    	currentminute = String.valueOf(currentminute1);
		    }
		    
		   
		    
		    else{
		    	currentminute=currentminute;
		        }
	 	   
			try{	 		
	 			 Sheet rsh=rwb.getSheet(0);
	 	 		 int nour=rsh.getRows();
	 	 	     int nouc=rsh.getColumns();	
	 		
			
			
	        String cabnamedata         =rsh.getCell(1, 0).getContents();
	        String maxSeatsdata        =rsh.getCell(1, 1).getContents();
	        String racSeatsdata        =rsh.getCell(1, 2).getContents();
	        String routeGroupdata      =rsh.getCell(1, 3).getContents();
	        String startHourdata       =currenthour;
	        String startMinutedata     =currentminute;
	        //String attenda             =rsh.getCell(i, 6).getContents();
	        
	        // alertdismiss();
		  
	        //scrollup();
	 		//scrollToElement(createnew);
	        clickButton(waitForElement(createnew));
		    handledSleep(6);
	        implictwait(30);
	        clickButton(waitForElement(clickbusname));
	        implictwait(30);
	        waitForElement(sendbusname).sendKeys(cabnamedata);
			//sendValuesToWebElement(waitForElement(sendbusname),cabnamedata);
	        implictwait(30);
			clickButton(waitForElement(selectbusname));
	        //waitForElement(maxseats).sendKeys(maxSeatsdata);
			//Thread.sleep(2000);
	        //waitForElement(racseats).sendKeys(racSeatsdata);
	        //implictwait(30);
			clickButton(waitForElement(routegroup));
	        implictwait(30);
			sendValuesToWebElement(waitForElement(routegroup1),routeGroupdata);
	        //implictwait(30);
			clickButton(waitForElement(waitforroute));
			clickButton(waitForElement(operatingdate));
	        implictwait(30);
	        clickButton(waitForElement(waitfordate));	        
	        implictwait(30);
	        clickButton(waitForElement(starttime));
	        implictwait(30);
	    	waitForElement(starthour).sendKeys(startHourdata,Keys.ENTER);
	        implictwait(30);
	        clickButton(waitForElement(startminute));
	        implictwait(30);
	    	waitForElement(sendstartminute).sendKeys(startMinutedata,Keys.ENTER);
	    	clickButton(waitForElement(pricerule));
	        implictwait(30);
	        clickButton(waitForElement(selectuniform));
	        clickButton(waitForElement(payementplan));
	        implictwait(30);
	        clickButton(waitForElement(testplantrip));
	    	//waitForElement(categoryname).click();  	    
	        clickButton(waitForElement(quicksave));
		    handledSleep(3);
	    	//waitForElement(close).click();	    	
			
	 		
			}
	 	   catch(ArrayIndexOutOfBoundsException e){
	 		   
	 	   }		   
			return this;
			
		}
		
		public CustomerApp ractrip() throws BiffException, IOException {
			
			
			File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\Rac.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();   
	    	
	 	    try{
	 		
	 		for(int sheets=0;sheets<nous;sheets++){
	 			 Sheet rsh=rwb.getSheet(sheets);
	 	 		 int nour=rsh.getRows();
	 	 	     int nouc=rsh.getColumns();	
	 		
			for(int i=1;i<nour;i++ ){
			
	        String cabnamedata         =rsh.getCell(i, 1).getContents();
	        String maxSeatsdata        =rsh.getCell(i, 2).getContents();
	        String racSeatsdata        =rsh.getCell(i, 3).getContents();
	        String routeGroupdata      =rsh.getCell(i, 4).getContents();
	        String startHourdata       =rsh.getCell(i, 5).getContents();
	        String startMinutedata     =rsh.getCell(i, 6).getContents();
	        //String attenda             =rsh.getCell(i, 6).getContents();
	        
	        // alertdismiss();
		    handledSleep(3);
	        implictwait(30);
	        //scrollup();
	 		//scrollToElement(createnew);
	        clickButton(waitForElement(createnew));
		    handledSleep(6);
	        implictwait(30);
	        clickButton(waitForElement(clickbusname));
	        implictwait(30);
	        waitForElement(sendbusname).sendKeys(cabnamedata);
			//sendValuesToWebElement(waitForElement(sendbusname),cabnamedata);
	        implictwait(30);
			clickButton(waitForElement(selectbusname));
			waitForElement(maxseats).clear();
		    handledSleep(2);
	        waitForElement(maxseats).sendKeys(maxSeatsdata);
		    handledSleep(2);
		    waitForElement(racseats).clear();
		    handledSleep(2);
	        waitForElement(racseats).sendKeys(racSeatsdata);
	        implictwait(30);
			clickButton(waitForElement(routegroup));
	        implictwait(30);
			sendValuesToWebElement(waitForElement(routegroup1),routeGroupdata);
	        implictwait(30);
			clickButton(waitForElement(waitforroute));
			clickButton(waitForElement(operatingdate));
	        implictwait(30);
	        clickButton(waitForElement(waitfordate));	        
	        implictwait(30);
	        clickButton(waitForElement(starttime));
	        implictwait(30);
	    	waitForElement(starthour).sendKeys(startHourdata,Keys.ENTER);
	        implictwait(30);
	        clickButton(waitForElement(startminute));
	        implictwait(30);
	    	waitForElement(sendstartminute).sendKeys(startMinutedata,Keys.ENTER);
	    	clickButton(waitForElement(pricerule));
	        implictwait(30);
	        clickButton(waitForElement(selectuniform));
	        clickButton(waitForElement(payementplan));
	        implictwait(30);
	        clickButton(waitForElement(testplantrip));
	    	//waitForElement(categoryname).click();  	    
	        clickButton(waitForElement(quicksave));
		    handledSleep(3);
	    	//waitForElement(close).click();	    	
			}
	 		}
			}
	 	   catch(ArrayIndexOutOfBoundsException e){
	 		   
	 	   }
			
			return new CustomerApp();
			
		}
		
		
		public CreateTrip_helper entertripdetails() throws BiffException, IOException{
	    
	    	File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets();   
	    	
	 	    try{
	 		
	 		for(int sheets=0;sheets<nous;sheets++){
	 			 Sheet rsh=rwb.getSheet(sheets);
	 	 		 int nour=rsh.getRows();
	 	 	     int nouc=rsh.getColumns();	
	 		
			for(int i=1;i<nour;i++ ){
			
	        String cabnamedata         =rsh.getCell(i, 0).getContents();
	        String maxSeatsdata        =rsh.getCell(i, 1).getContents();
	        String racSeatsdata        =rsh.getCell(i, 2).getContents();
	        String routeGroupdata      =rsh.getCell(i, 3).getContents();
	        String startHourdata       =rsh.getCell(i, 4).getContents();
	        String startMinutedata     =rsh.getCell(i, 5).getContents();
	        //String attenda             =rsh.getCell(i, 6).getContents();
	        
	        // alertdismiss();
		    handledSleep(3);
	        implictwait(30);
	        //scrollup();
	 		//scrollToElement(createnew);
	        clickButton(waitForElement(createnew));
		    handledSleep(6);
	        implictwait(30);
	        clickButton(waitForElement(clickbusname));
	        implictwait(30);
	        waitForElement(sendbusname).sendKeys(cabnamedata);
			//sendValuesToWebElement(waitForElement(sendbusname),cabnamedata);
	        implictwait(30);
			clickButton(waitForElement(selectbusname));
	        //waitForElement(maxseats).sendKeys(maxSeatsdata);
			//Thread.sleep(2000);
	        //waitForElement(racseats).sendKeys(racSeatsdata);
	        implictwait(30);
			clickButton(waitForElement(routegroup));
	        implictwait(30);
			sendValuesToWebElement(waitForElement(routegroup1),routeGroupdata);
	        implictwait(30);
			clickButton(waitForElement(waitforroute));
			clickButton(waitForElement(operatingdate));
	        implictwait(30);
	        clickButton(waitForElement(waitfordate));	        
	        implictwait(30);
	        clickButton(waitForElement(starttime));
	        implictwait(30);
	    	waitForElement(starthour).sendKeys(startHourdata,Keys.ENTER);
	        implictwait(30);
	        clickButton(waitForElement(startminute));
	        implictwait(30);
	    	waitForElement(sendstartminute).sendKeys(startMinutedata,Keys.ENTER);
	    	clickButton(waitForElement(pricerule));
	        implictwait(30);
	        clickButton(waitForElement(selectuniform));
	        clickButton(waitForElement(payementplan));
	        implictwait(30);
	        clickButton(waitForElement(testplantrip));
	    	//waitForElement(categoryname).click();  	    
	        clickButton(waitForElement(quicksave));
		    handledSleep(3);
	    	//waitForElement(close).click();	    	
			}
	 		}
			}
	 	   catch(ArrayIndexOutOfBoundsException e){
	 		   
	 	   }
	 	   
			return this;
	    	
	    }
	    
	 

	public CreateTrip_helper entertomorrowtripdetails() throws BiffException, IOException  {
	    	
	    	File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTommorwoTrip.xls");
	 	    Workbook rwb=Workbook.getWorkbook(datafile);
	 	    int nous=rwb.getNumberOfSheets(); 		
	 	   
	 	    DateFormat df= new SimpleDateFormat("yyyy-MM-dd");

			Date date = new Date();

		    Calendar cal = Calendar.getInstance();

		    cal.setTime(date);

		    cal.add(Calendar.DATE, 1);

		    String dateFinal= df.format(cal.getTime());
	 	    
	    	
	 	    try{
	 		
	 		for(int sheets=0;sheets<nous;sheets++){
	 			 Sheet rsh=rwb.getSheet(sheets);
	 	 		 int nour=rsh.getRows();
	 	 	     int nouc=rsh.getColumns();	
	 		
			for(int i=1;i<nour;i++ ){
			
	        String cabnamedata         =rsh.getCell(i, 0).getContents();
	        String maxSeatsdata        =rsh.getCell(i, 1).getContents();
	        String racSeatsdata        =rsh.getCell(i, 2).getContents();
	        String routeGroupdata      =rsh.getCell(i, 3).getContents();
	        String startHourdata       =rsh.getCell(i, 4).getContents();
	        String startMinutedata     =rsh.getCell(i, 5).getContents();
	        //String attenda             =rsh.getCell(i, 6).getContents();
	        
	        // alertdismiss();
		    handledSleep(3);
	       
	        implictwait(30);
	        //scrollup();
	 		//scrollToElement(createnew);
	        clickButton(waitForElement(createnew));
		    handledSleep(6);
	        implictwait(30);
	        clickButton(waitForElement(clickbusname));
	        implictwait(30);
	        waitForElement(sendbusname).sendKeys(cabnamedata);
			//sendValuesToWebElement(waitForElement(sendbusname),cabnamedata);
	        implictwait(30);
			clickButton(waitForElement(selectbusname));
	        //waitForElement(maxseats).sendKeys(maxSeatsdata);
			//Thread.sleep(2000);
	        //waitForElement(racseats).sendKeys(racSeatsdata);
	        implictwait(30);
			clickButton(waitForElement(routegroup));
	        implictwait(30);
			sendValuesToWebElement(waitForElement(routegroup1),routeGroupdata);
	        implictwait(30);
			clickButton(waitForElement(waitforroute));
			clickButton(waitForElement(operatingdate));
	        implictwait(30);
			sendValuesToWebElement(waitForElement(operatingdate),dateFinal);          
            actionenter();	        
	        clickButton(waitForElement(starttime));
	        implictwait(30);
	    	waitForElement(starthour).sendKeys(startHourdata,Keys.ENTER);
	        implictwait(30);
	        clickButton(waitForElement(startminute));
	        implictwait(30);
	    	waitForElement(sendstartminute).sendKeys(startMinutedata,Keys.ENTER);
	    	clickButton(waitForElement(pricerule));
	        implictwait(30);
	        clickButton(waitForElement(selectuniform));
	        clickButton(waitForElement(payementplan));
	        implictwait(30);
	        clickButton(waitForElement(testplantrip));
	    	//waitForElement(categoryname).click();          
	    
	        clickButton(waitForElement(quicksave));
		    handledSleep(3);
	    	//waitForElement(close).click();
	    	
			}
	 		}
			}
	 	    catch(ArrayIndexOutOfBoundsException e){
	 		   
	 	    }
	    	
	    	
			return this;
	    	
	    	
	    }
	
	public CreateTrip_helper  validate_Create_Trip_today() throws BiffException, IOException{
		
		
		     refresh();
		     handledSleep(5);
		     File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
 	         Workbook rwb=Workbook.getWorkbook(datafile);
 	         int nous=rwb.getNumberOfSheets(); 	   
 		
 		
 			 Sheet rsh=rwb.getSheet(0);
 	 		 int nour=rsh.getRows();
 	 	     int nouc=rsh.getColumns();	
 	         String firstcabnamedata         =rsh.getCell(1, 0).getContents();
 			 
 	         sendValuesToWebElement(waitForElement(searchdriver),firstcabnamedata); 
 	         handledSleep(5);
 	         implictwait(50);
 	         waitForElementsBy(drivernames);
 	         List<WebElement> eachdrivername= waitForElementsBy(drivernames);
 	         java.util.Iterator<WebElement> itr = eachdrivername.iterator();
 	         while(itr.hasNext()) {
 	        	
 	           String driver_name=itr.next().getText();
 	           if(driver_name.contains(firstcabnamedata)) {
 	        	   Assert.assertTrue(true);
 	           }
 	           else {
 	        	   Assert.fail("Driver name is not matching");
 	           }
 	           
 	           
 	         }	        

		
		return this;
		
	}
	   
	
	public CreateTrip_helper validate_Create_Trip_tommorow() throws BiffException, IOException {
		
	         refresh();

		     DateFormat df= new SimpleDateFormat("yyyy-MM-dd");

			 Date date = new Date();

		     Calendar cal = Calendar.getInstance();

		     cal.setTime(date);

		     cal.add(Calendar.DATE, 1);

		     String dateFinal= df.format(cal.getTime());
		     implictwait(30);
		     waitForElement(startdatecal).clear();
		     implictwait(30);
		     sendValuesToWebElement(waitForElement(startdatecal),dateFinal);             
		     implictwait(30);
		     sendValuesToWebElement(waitForElement(enddatecal),dateFinal);             
		     implictwait(30);
		     clickButton(waitForElement(searchcal));
		     implictwait(30);
		     File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTommorwoTrip.xls");
 	         Workbook rwb=Workbook.getWorkbook(datafile);
 	         int nous=rwb.getNumberOfSheets(); 	   
 		
 		
 			 Sheet rsh=rwb.getSheet(0);
 	 		 int nour=rsh.getRows();
 	 	     int nouc=rsh.getColumns();	
 	         String firstcabnamedata         =rsh.getCell(1, 0).getContents();
 			 
 	         sendValuesToWebElement(waitForElement(searchdriver),firstcabnamedata); 
 	         handledSleep(5);
 	         implictwait(50);
 	         waitForElementsBy(drivernames);
 	         List<WebElement> eachdrivername= waitForElementsBy(drivernames);
 	         java.util.Iterator<WebElement> itr = eachdrivername.iterator();
 	         while(itr.hasNext()) {
 	        	
 	           String driver_name=itr.next().getText();
 	           if(driver_name.contains(firstcabnamedata)) {
 	        	   Assert.assertTrue(true);
 	           }
 	           
 	           else {
 			    	Assert.fail("Tommorrow Trip is Not Created Properly");

 	  	           }
 	           
 	         }	    
		     
		
		     return this;
		
		
	         }
	   
	
	   
	
			
			
			
	}
		
		



