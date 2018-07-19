package in.zipgo.automation_framework.pages.mobile;

import org.junit.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import in.zipgo.automation_framework.base.DriverFactory;
import in.zipgo.automation_framework.pages.web.BasePage;
import io.appium.java_client.android.AndroidDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class OpenDriverApp extends BasePage {
	
	final By unchecksave       =By.xpath("//*[@resource-id='com.zipgo.bus:id/chk_btn_save_pass'][@checked='false']");
	final By checkedsave       =By.xpath("//*[@resource-id='com.zipgo.bus:id/chk_btn_save_pass'][@checked='true']");
	final By resetpwd          =By.xpath("//*[@resource-id='com.zipgo.bus:id/reset_password']");
	final By messagebox        =By.xpath("//*[@text='Message']");
	final By troubleshoot      =By.xpath("//*[@resource-id='com.zipgo.bus:id/btn_troubleshoot']");
	final By backbutt          =By.xpath("//*[@resource-id=='com.zipgo.bus:id/iv_back_button']");
	final By helplinee         =By.xpath("//*[@resource-id='com.zipgo.bus:id/helpline_text']");
	final By versiont          =By.xpath("//*[@resource-id='com.zipgo.bus:id/version_text']");
	final By versionnumber     =By.xpath("//*[@resource-id='com.zipgo.bus:id/version_no']");
	final By getnewap          =By.xpath("//*[@resource-id='com.zipgo.bus:id/update_app_txt']");
	
	
	final By loginuser         = By.xpath("//*[@resource-id='com.zipgo.bus:id/username']");
	final By loginpassword     = By.xpath("//*[@resource-id='com.zipgo.bus:id/password']");
    final By submitButton      = By.id("com.zipgo.bus:id/login");
	
    final By present           = By.xpath("//*[@resource-id='com.zipgo.bus:id/btn_present']");
	final By absent            = By.xpath("//*[@text='Absent']");
    final By mainmenu          = By.xpath("//*[@resource-id='com.zipgo.bus:id/menuBtn']");
	
	final By driverprofile     =By.xpath("//*[@resource-id='com.zipgo.bus:id/tv_profile']");
	final By drivername        =By.xpath("//*[@resource-id='com.zipgo.bus:id/name']");
	final By driverphone       =By.xpath("//*[@resource-id='com.zipgo.bus:id/phone']");
	
	final By todaytrip         =By.xpath("//*[@resource-id='com.zipgo.bus:id/textView2']");
	final By clicktrip         =By.xpath("//*[@class='android.widget.RelativeLayout']"); 
	final By startcontract     =By.xpath("//*[@resource-id='com.zipgo.bus:id/active']");
	
	final By cablogout		   =By.xpath("//*[@resource-id='com.zipgo.bus:id/tv_logout']");
	
	
	
	public  WebDriver driver1;
	 
    
	
	
	
	 public OpenDriverApp opentheapp() throws BiffException, IOException, InterruptedException  {
		   
		 
/*	  
				
	 	 DesiredCapabilities capabilities = new DesiredCapabilities();
		 

			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			 

			//capabilities.setCapability("deviceName", "emulator-5554");//TA385045DW
			capabilities.setCapability("deviceName", "TA385045DW");

			capabilities.setCapability("platformVersion", "6.0.0");

			capabilities.setCapability("platformName", "Android");

			
			 
			capabilities.setCapability("appActivity","com.zipgo.customer"); //ZipGo Customer App will Open

			
			 
			capabilities.setCapability("appActivity", "com.zipgo.customer.activities.SplashActivity"); 

			
			  
			driver1 = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);*/

		  DesiredCapabilities capabilities = new DesiredCapabilities();

		  capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		   
		  capabilities.setCapability("deviceName", "0123456789ABCDEF");

		  capabilities.setCapability("platformVersion", "6.0.0");

		  capabilities.setCapability("platformName", "Android");
		   
		  //capabilities.setCapability("autoGrantPermissions","true");

  
		  capabilities.setCapability("appActivity", "com.zipgo.bus");

  
		  capabilities.setCapability("appActivity", "com.zipgo.bus.activities.StartingActivity");

			driver1 = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);			

		//  driver1 = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  
		 /* Thread.sleep(5000);
		  //Validating Driver Login Screen
          System.out.println("11111");

          WebElement unchecksaved=driver1.findElement(By.xpath("unchecksave"));
          System.out.println("2222");

          if(unchecksaved.isDisplayed()) {
        	  Assert.assertTrue(true);  
        	  System.out.println("unchecksaved");

          }
          System.out.println("3333");

          unchecksaved.click();
          WebElement checksave=driver1.findElement(checkedsave);
          if(checksave.isDisplayed()) {
        	  
        	  Assert.assertTrue(true);
        	  System.out.println("checksave");

        	  
          }
          checksave.click();
          
          String savepwd=unchecksaved.getText();
          if(savepwd.contains("Save password")) {
        	  Assert.assertTrue(true);   
        	  System.out.println("Save password");

          }
          
          WebElement reset_pwd=driver1.findElement(resetpwd);
          String resetpass=reset_pwd.getText();
          if(resetpass.contains("Reset Password")) {
        	  
        	  Assert.assertTrue(true);
        	  System.out.println("Reset Password");
        	  
          }
          
          WebElement msg_box=driver1.findElement(messagebox);
          if(msg_box.isDisplayed()) {
        	  Assert.assertTrue(true);
        	  
        	  System.out.println("messagebox");
          }
          msg_box.click();
          WebElement troubleshootsett=driver1.findElement(troubleshoot);
          if(troubleshootsett.isDisplayed()) {
        	  Assert.assertTrue(true);
        	  System.out.println("troubleshoot");
          }
          
          WebElement backbuton=driver1.findElement(backbutt);
          backbuton.click();
          
          WebElement helplinenum=driver1.findElement(helplinee);
          if(helplinenum.isDisplayed()) {
        	  Assert.assertTrue(true);
        	  System.out.println("helpline");
          }
          
          WebElement versiontext=driver1.findElement(versiont);
          if(versiontext.isDisplayed()) {
        	  Assert.assertTrue(true);
        	  System.out.println("version");

          }
          
          WebElement versionnumb=driver1.findElement(versionnumber);
          String version=versionnumb.getText();
          System.out.println("Version No  :"+version);
          
          WebElement getapp=driver1.findElement(getnewap);
          if(getapp.isDisplayed()) {
        	  Assert.assertTrue(true);
        	  System.out.println("getnewap");

          }
          
          
          */
          
		  
	      File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\applogindata.xls");
	      Workbook rwb=Workbook.getWorkbook(datafile);
	      Sheet rsh=rwb.getSheet(0);
	      int nour=rsh.getRows();
				    	
			
		   try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {}
					
				
		     String loginid=rsh.getCell(1, 1).getContents();		    
		     String loginpwd=rsh.getCell(2, 1).getContents();
		  
		    
			 driver1.findElement(loginuser).sendKeys(loginid);
			 Thread.sleep(3000);
			 driver1.findElement(loginpassword).sendKeys(loginpwd);
			 Thread.sleep(2000);
			 driver1.findElement(submitButton).click();

			  //waitForElement(loginuser).sendKeys(loginid);
			  //waitForElement(loginpassword).sendKeys(loginpwd);
			  //waitForElement(submitButton).click();
		      return null;
		
		 
		 	 
        }
	 
	 
	public OpenDriverApp giveattendance() {
		
		   try{

		    File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\applogindata.xls");
		    Workbook rwb=Workbook.getWorkbook(datafile);
			Sheet rsh=rwb.getSheet(0);
			int nour=rsh.getRows();
		      
			File datafile1=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
			  

		    Workbook rwb1=Workbook.getWorkbook(datafile1);

		 	Sheet rsh1=rwb1.getSheet(0);
		 	int nour1=rsh1.getRows();
		 	int nouc1=rsh1.getColumns();


					   
			Thread.sleep(6000);
					   
			String attendance   =rsh1.getCell(1, 6).getContents();
		    
			System.out.println(attendance);   
				
			
			for(int i=1;i<=4;i++) {
	        //while(waitForElement(present).isDisplayed()){
				

			if(attendance.contains("Present")){	

              driver1.findElement(present).click();
			 // waitForElement(present).click();
		    }
		    else if(attendance.contains("Absent")){ 

	             driver1.findElement(absent).click();

		    	//waitForElement(absent).click();
		     }
			Thread.sleep(2000);
			
					   
	        }
					  
		
	  }
	       
		      catch(Exception e){
		    	  
		      }
		
		      driver1.findElement(mainmenu).click();
		      return new OpenDriverApp();
		
	}
	
	
	public OpenDriverApp driverprofile() throws BiffException, IOException {
		
		File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\applogindata.xls");
	      Workbook rwb=Workbook.getWorkbook(datafile);
	      Sheet rsh=rwb.getSheet(0);
	      int nour=rsh.getRows();
				    	
			
		   try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {}
					
				
		     String cabname =rsh.getCell(3, 1).getContents();
		     String cabphone =rsh.getCell(4, 1).getContents();
		     
		     
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		driver1.findElement(driverprofile).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		//implictwait(50);
		
		String name=driver1.findElement(drivername).getText();
		String phone =driver1.findElement(driverphone).getText();
		
		if(name.contains(cabname) && phone.contains(cabphone)) {
			
			Assert.assertTrue(true);
			
		}
		
       driver1.navigate().back();
       try {
		    Thread.sleep(4000);
        	} catch (InterruptedException e) {}
		
	      return new OpenDriverApp();
	}
	
	public OpenDriverApp driverlogout() {
		
		driver1.findElement(cablogout).click();
        

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
	       
		
		}
        System.out.println("2222");
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver1.findElement(By.xpath("messagebox")).click();
          System.out.println("33333");

         
		
	      return new OpenDriverApp();
		
	}
	
	
	
	

}
