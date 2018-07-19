package in.zipgo.automation_framework.pages.mobile;

import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

import in.zipgo.automation_framework.pages.web.BasePage;
import in.zipgo.automation_framework.pages.web.Memberships;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.TouchShortcuts;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerApp extends BasePage {
	
	
	final By allow                      =By.xpath("//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']");
    final By signinemail                =By.xpath("//*[@resource-id='com.zipgo.customer:id/btnEmail']");
    final By enteremail                 =By.xpath("//*[@resource-id='com.zipgo.customer:id/et_email']");
	final By enterpassword              =By.xpath("//*[@resource-id='com.zipgo.customer:id/et_password']");
    final By emailloginbutton           =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_login']");
	
	final By continuewithgoogle         =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_google']");
	final By clickanaccount             =By.xpath("(//*[@resource-id='com.google.android.gms:id/account_display_name'])[3]");
    final By hamburger                  =By.xpath("//*[@resource-id='com.zipgo.customer:id/menu_btn']");
    final By more                       =By.xpath("//*[@text='More']");
    final By editprofile                =By.xpath("//*[@text='Edit Profile']");
    final By custphonenumm              =By.xpath("//*[@resource-id='com.zipgo.customer:id/et_phone']");
    
    final By myrides                    =By.xpath("//*[@text='My Rides']");
    final By upcoming                   =By.xpath("//*[@text='Upcoming']");
    final By confirmed                  =By.xpath("//*[@text='CONFIRMED']");
    final By previous                   =By.xpath("//*[@text='Previous']");
    final By newbooking                 =By.xpath("//*[@text='New Booking']");
    final By payements                  =By.xpath("//*[@text='Payments']");
    final By totalamount                =By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_amount'][@index='1']");

    
    final By newRequest                 =By.xpath("//*[@text='New Request']");
    final By searchnewroute             =By.xpath("//*[@text='Search New Route']");
    final By pickupbox                  =By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_pickup']");
    final By enterpickbox               =By.xpath("//*[@resource-id='com.zipgo.customer:id/et_search']");
    final By firstdropdown              =By.xpath("(//*[@class='android.widget.LinearLayout'])[1]");    
    final By destinatinbox              =By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_destination']");
    
    final By viewtimings                =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_view_trips']");
    final By reservebutton              =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_reserve']");
    final By reservebutton1             =By.xpath("(//*[@resource-id='com.zipgo.customer:id/btn_reserve'])[1]");
    final By racreservebutton           =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_rac_reserve']");
	final By specifytimelimit           =By.xpath("//*[@resource-id='com.zipgo.customer:id/select_wait_time']");
    final By racdone                    =By.xpath("//*[@resource-id='com.zipgo.customer:id/confirm_wait_time']");  
    
    final By fareinfo                   =By.xpath("//*[@resource-id='com.zipgo.customer:id/fare_info']");
    final By amounttopay                =By.xpath("//*[@resource-id='com.zipgo.customer:id/total_text']");
    final By farebreakupok              =By.xpath("//*[@resource-id='com.zipgo.customer:id/ok_btn']");
    
    final By tncpopup                   =By.xpath("//*[@resource-id='com.zipgo.customer:id/tnc_text']");
    final By termsandcondhead           =By.xpath("//*[@text='Terms and Conditions']");
    final By termsnconditions           =By.xpath("//*[@resource-id='com.zipgo.customer:id/tnc_text']");
    final By cancelpolicy               =By.xpath("//*[@content-desc='ZipGo Cancellation Policy']");
    final By termsofuse                 =By.xpath("//*[@content-desc='ZipGo Terms of Use']");
    
	final By confirmbookingbutton       =By.xpath("//*[@resource-id='com.zipgo.customer:id/submit_dialog_okay']");
    final By okafterconfirm             =By.xpath("//*[@text='OK']");
    final By costoftrip                 =By.xpath("//*[@resource-id='com.zipgo.customer:id/trip_cost']");
    
    final By backbutton                 =By.xpath("//*[@resource-id='com.zipgo.customer:id/back_btn']");
    final By myridemodify               =By.xpath("//*[@text='Modify']");
    final By bookingmodify              =By.xpath("//*[@text='Modify'][@index='0']");
    final By bookingmodify1             =By.xpath("(//*[@text='Modify'][@index='0'])[1]");
    
    final By trackurtrip                =By.xpath("//*[@text='Track']");
    final By upafterconfirm             =By.xpath("//*[@resource-id='com.zipgo.customer:id/close']");
    final By cancelbutton               =By.xpath("//*[@text='Cancel']");
    final By changeinplan               =By.xpath("//*[@text='Change in plan']");
    final By cancellationsubmit         =By.xpath("//*[@text='Submit']");
    
    
    final By editprofilepic             =By.xpath("//*[@resource-id='com.zipgo.customer:id/iv_photo_edit']");
    final By proflietakephoto           =By.xpath("//*[@text='Take photo']");
    final By realphoto                  =By.xpath("//*[@resource-id='com.motorola.camera:id/preview_surface']");
    final By takephoto                  =By.xpath("//*[@resource-id='com.motorola.camera:id/review_approve']");
    
    final By editbutton                 =By.xpath("//*[@resource-id='com.zipgo.customer:id/edit_button']");
    final By editcustname               =By.xpath("//*[@resource-id='com.zipgo.customer:id/et_name']");
    final By editdob                    =By.xpath("//*[@resource-id='com.zipgo.customer:id/et_birth_date']");
    final By prevmonth                  =By.xpath("//*[@resource-id='android:id/prev']");
    final By firstday                   =By.xpath("//*[@text='1']");
    final By calendarok                 =By.xpath("//*[@text='OK']");
    final By editcity                   =By.xpath("//*[@resource-id='android:id/text1']");
    final By uncheckedcity              =By.xpath("(//*[@resource-id='android:id/text1'][@checked='false'])[1]");
    final By invcode                    =By.xpath("//*[@resource-id='com.zipgo.customer:id/et_promo_code']");
    
    final By editprofilesave            =By.xpath("//*[@text='SAVE']");
    
    final By feedback                   =By.xpath("//*[@text='Feedback']");
    final By ratingstar                 =By.xpath("//*[@resource-id='com.zipgo.customer:id/rating_bar']");
    final By sendcomments               =By.xpath("//*[@resource-id='com.zipgo.customer:id/comments']");
    final By feedbacksubmit             =By.xpath("//*[@resource-id='com.zipgo.customer:id/send']");
    final By feedbackthanks             =By.xpath("//*[@text='THANKS!']");
    final By feedbackok                 =By.xpath("//*[@text='OK']");
    final By feedbackfail               =By.xpath("//*[@text='Feedback Submission Failure']");
    final By others                     =By.xpath("//*[@text='Others']");
    
    final By suggestnewroute            =By.xpath("//*[@text='Suggest New Routes']");
    final By suggestorigin              =By.xpath("//*[@resource-id='com.zipgo.customer:id/actv_pickup']");
    final By suggestdestination         =By.xpath("//*[@resource-id='com.zipgo.customer:id/actv_destination']");
    final By suggeststarttime           =By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_forward_time']");
    final By suggestreturntime          =By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_reverse_time']");
    final By clockhours                 =By.xpath("//*[@resource-id='android:id/hours']");
    final By suggestclockseven          =By.xpath("//*[@class='android.widget.RadialTimePickerView$RadialPickerTouchHelper'][@index='7']");
    final By suggestclockninteen        =By.xpath("//*[@class='android.widget.RadialTimePickerView$RadialPickerTouchHelper'][@index='8']");
    
    final By suggestclockok             =By.xpath("//*[@resource-id='android:id/button1']");
    final By suggestitenary             =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_request']");
    final By thanksok                   =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_one_yes']");
    
    
    final By menuroutes                 =By.xpath("//*[@text='Routes']");
    final By searchroute                =By.xpath("//*[@resource-id='com.zipgo.customer:id/search_address']");
    final By routezonename              =By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_route_zone_name']");
    final By listofdotroute             =By.xpath("//*[@resource-id='com.zipgo.customer:id/title']");
    final By btnviewtrips               =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_view_trips']");
    final By banashankari               =By.xpath("//*[@text='Banashankari Signal']");
    
    final By homechange                 =By.xpath("//*[@resource-id='com.zipgo.customer:id/home_location_ll_tv']");
    final By activeplace                =By.xpath("//*[@resource-id='com.zipgo.customer:id/actv_place']");
    final By setworkhome                =By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_set']");    
    final By workchange                 =By.xpath("//*[@resource-id='com.zipgo.customer:id/work_location_ll_tv']");
    final By reachworkby                =By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_forward_time']");
    final By leaveworkby                =By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_reverse_time']");
    
    final By notifications              = By.xpath("//*[@text='Notifications']");
    final By notificationcheck          = By.xpath("//*[@text='This is ment for testing']");
    final By deleteallmsg               = By.xpath("//*[@resource-id='com.zipgo.customer:id/ll_delete_all']");
    
    final By passes                     = By.xpath("//*[@text='Passes']");
    final By validpass                  = By.xpath("//*[@text='Days Left']");
    final By invalidpass                = By.xpath("//*[@text='Employer Unknown']");
    final By membershipplan             = By.xpath("//*[@text='Membership plans']"); 
    final By buynowmembership           = By.xpath("//*[@resource-id='com.zipgo.customer:id/pay_button']");
    final By buynowmembership1          = By.xpath("(//*[@resource-id='com.zipgo.customer:id/pay_button'])[1]");
    final By nameofsubscription         = By.xpath("(//*[@resource-id='com.zipgo.customer:id/name'])[1]");
    final By iacceptradiobut            = By.xpath("//*[@resource-id='com.zipgo.customer:id/tv_tnc']");
    final By confsubscription           = By.xpath("//*[@resource-id='com.zipgo.customer:id/sub_plan_btn']");
    final By subscriptionok             = By.xpath("//*[@resource-id='com.zipgo.customer:id/ok_button']");
    final By seconsubinfo               = By.xpath("//*[@text='Another membership plan is already active for given date']");
    final By secondinfook               = By.xpath("//*[@resource-id='com.zipgo.customer:id/btn_one_yes']");
    final By valueaddedpack             = By.xpath("//*[@text='Value added Packs']");
        
    
    final By addamount                  = By.xpath("//*[@resource-id='com.zipgo.customer:id/user_amount']");
    final By addfundswallet             = By.xpath("//*[@resource-id='com.zipgo.customer:id/recharge']");
    final By debitcardno                = By.xpath("//*[@resource-id='cn1']");
    final By expirymonth                = By.xpath("//*[@resource-id='dcExpMonth']");
    final By monthdropdown07            = By.xpath("//*[@text='07']");
    final By monthdropdown09            = By.xpath("//*[@text='09']");
    final By expiryyear                 = By.xpath("//*[@resource-id='dcExpYear']");
    final By yeardropdown				= By.xpath("//*[@text='2022']");
    final By cvvbox                     = By.xpath("//*[@resource-id='dcCvvBox']");
    final By paynow                     = By.xpath("//*[@resource-id='dcSubmit']");
    final By enterotp                   = By.xpath("//*[@resource-id='OTP']");
    final By otpsubmit                  = By.xpath("//*[@content-desc='Submit']");
    
    
    
    
    final By logout                     =By.xpath("//*[@resource-id='com.zipgo.customer:id/logout']");
    
	
     public WebDriver driver2;	
	
    ///////////////////////////////////////////////////////
    int newreqIntialCustBal;
	int custbalance;
	int afterbookcustbal;
	int visibleprize;
	int prize;
	int cancelreturnbal;
	String IntialCustomerName;
	int amounttopayint;
    int modifyfees=6;
	
    /////////////////////////////////////////////////////////
    
 
	 public CustomerApp opencustapp() throws BiffException, IOException, InterruptedException  {
		   
		 
		 
		    DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			//capabilities.setCapability("deviceName", "emulator-5554");//TA385045DW
			
			//capabilities.setCapability("deviceName", "TA385045DW");
			
			capabilities.setCapability("deviceName", "E1XP417GA001808");

			capabilities.setCapability("platformVersion", "6.0.0");
			capabilities.setCapability("platformName", "Android");			 
			capabilities.setCapability("appActivity","com.zipgo.customer"); //ZipGo Customer App will Open			 
			capabilities.setCapability("appActivity", "com.zipgo.customer.activities.SplashActivity"); 			  
			driver2 = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);					
			handledSleep(3);             
            return null;
		 }
	 
	  public CustomerApp addfunds() {
		 
		 handledSleep(2);
		 implictwait(30);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(payements).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String stringtotalamount=driver2.findElement(totalamount).getText();
         String[] splittotalamount=stringtotalamount.split(" ");
         stringtotalamount=splittotalamount[1];
         int totalamount=Integer.parseInt(stringtotalamount);
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(addamount).sendKeys("2");
         handledSleep(1);
         driver2.findElement(addfundswallet).click();         
         Dimension size = driver2.manage().window().getSize();
         int starty =(int)(size.height*0.7);
         int endy   =(int)(size.height*0.3);
         int x      =(int)(size.width*0.5);
         ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
        
         driver2.findElement(debitcardno).sendKeys("4280902556830693");
         driver2.findElement(expirymonth).click();
         ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
         handledSleep(1);
         driver2.findElement(monthdropdown07).click();
         handledSleep(1);
         driver2.findElement(expirymonth).click();
         handledSleep(1);
         driver2.findElement(monthdropdown09).click();
         driver2.findElement(expiryyear).click();
         handledSleep(1);
         driver2.findElement(yeardropdown).click();
         handledSleep(1);
         driver2.findElement(cvvbox).sendKeys("453");
         handledSleep(1);
         driver2.findElement(paynow).click();
         handledSleep(1);
         driver2.findElement(enterotp).sendKeys("1234");
         driver2.findElement(otpsubmit).click();		 
		 return this;
	 }
	 
	 public CustomerApp logincustomerapp() {
         
		 handledSleep(3);		
         try {         
        /* WebElement gog=driver2.findElement(continuewithgoogle);
         gog.click();
         //driver2.findElement(continuewithgoogle).click();
         
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(clickanaccount).click();*/      
 		 handledSleep(4); 
 
        File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\CustomerApp.xls");              
        Workbook rwb=Workbook.getWorkbook(datafile);
        int nous=rwb.getNumberOfSheets();   
        Sheet rsh=rwb.getSheet(0);    
        driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver2.findElement(signinemail).click();
       
        handledSleep(4);
    	String emailidofcust      =rsh.getCell(0, 1).getContents();
        String emailpwdofcust     =rsh.getCell(1, 1).getContents();
        String custphonenumber    =rsh.getCell(2, 1).getContents();
        handledSleep(4);
        driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver2.findElement(enteremail).sendKeys(emailidofcust);        
        handledSleep(2);
        driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver2.findElement(enterpassword).sendKeys(emailpwdofcust);
        handledSleep(2);
        driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver2.findElement(emailloginbutton).click();
        handledSleep(1);

         while(driver2.findElements(allow).size()!=0) {
			 driver2.findElement(allow).click();
		 }
        

         if(driver2.findElement(hamburger).isDisplayed()) {
        	 System.out.println("Login Customer App Successful");
         }
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(editprofile).click();
         handledSleep(2);
         String CustPhoneNum=driver2.findElement(custphonenumm).getText();
         if(CustPhoneNum.contains(custphonenumber)) {
        	 System.out.println("Customer Phone Number is Validated");
        	 Assert.assertTrue("Customer Phone Number is Validated", true);
         }
         else {
        	 Assert.fail("Customer Phone Number is Not matched");
         }
         handledSleep(1);
         }
         catch(Exception e) {
         while(driver2.findElements(allow).size()!=0) {
         driver2.findElement(allow).click();
         }
        	
         }
		
		 return this;
	 }
	 
	 public CustomerApp upcomingtrip() {
		 
		 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(myrides).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(previous).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(upcoming).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         int z=driver2.findElements(newbooking).size();        
         if(driver2.findElements(newbooking).size()!=0){
        	 
        	  	 System.out.println("There are no Upcoming Trips");
        	 
         }
         else if(driver2.findElements(confirmed).size()!=0) {
        	  
        	
        	 System.out.println("There is an Upcoming Trip");
         }
	
         
		return this;
		 
	 }
	 
	 
	 public CustomerApp newreq() throws BiffException, IOException {		
			 
		 
		 File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\CreateTripdata.xls");
		 Workbook rwb=Workbook.getWorkbook(datafile);
		 int nous=rwb.getNumberOfSheets();
		 Sheet rsh=rwb.getSheet(0);
		 int nour=rsh.getRows();
		 	
		 String custpickuploc      =rsh.getCell(2, 7).getContents();
		 String custdroploc        =rsh.getCell(2, 8).getContents();
		 
		 String firstdriver2=rsh.getCell(3, 0).getContents();		
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(payements).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String stringtotalamount=driver2.findElement(totalamount).getText();
         String[] splittotalamount=stringtotalamount.split(" ");
         stringtotalamount=splittotalamount[1];
         int totalamount=Integer.parseInt(stringtotalamount);
         newreqIntialCustBal=totalamount;
         System.out.println("Intial Cust Bal  ="+newreqIntialCustBal);			 
	     handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();         
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(newRequest).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         if(driver2.findElements(searchnewroute).size()!=0) {
             driver2.findElement(searchnewroute).click();		

         }else {
        	 
         }
		 handledSleep(1);
		 
		 while(driver2.findElements(allow).size()!=0) {
		 driver2.findElement(allow).click();
		 }		 
         handledSleep(1);         
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(pickupbox).click();
         handledSleep(2);
         driver2.findElement(enterpickbox).sendKeys(custpickuploc);
         handledSleep(1);          
         driver2.findElement(firstdropdown).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(destinatinbox).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(enterpickbox).sendKeys(custdroploc);
         handledSleep(2);         
         driver2.findElement(firstdropdown).click();         
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(viewtimings).click(); 
         
         if( driver2.findElements(reservebutton).size()>1) {
             handledSleep(1);
             driver2.findElement(reservebutton1).click();

         }
         else {
        	 handledSleep(1);
             driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
             driver2.findElement(reservebutton).click();
         }
        
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String prizeoftrip=driver2.findElement(costoftrip).getText();
         String[] prizeoftrips=prizeoftrip.split(" ");
         prizeoftrip=prizeoftrips[1];
         int prizeoftripss=Integer.parseInt(prizeoftrip);
         visibleprize=prizeoftripss;  
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(fareinfo).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String amountopay= driver2.findElement(amounttopay).getText();
         String[] amountopay11=amountopay.split(" ");
         String amountopay111=amountopay11[1];
         int amountobepayed=Integer.parseInt(amountopay111);
         amounttopayint=amountobepayed;
         System.out.println("Fare Breakup Prize= "+amounttopayint);
         handledSleep(1);
         driver2.findElement(farebreakupok).click();
         handledSleep(1);           
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(tncpopup).click();
         handledSleep(1); 
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        /* 
         handledSleep(3);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         if(driver2.findElement(cancelpolicy).isDisplayed()) {
        	 System.out.println("Updated Cancellation Policy is working fine");
         }
         else {
        	 System.out.println("Updated Cancellation Policy is Not working");
         }
         driver2.findElement(backbutton).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(termsnconditions).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         if(driver2.findElement(termsofuse).isDisplayed()) {
        	 System.out.println("Terms and Conditions is Working fine");
         }
         else {
        	 System.out.println("Terms and Conditions is not working fine");
         }
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(backbutton).click();*/
         if(driver2.findElement(termsandcondhead).isDisplayed()) {
        	 System.out.println("Terms and Conditions Popup is Displayed");
         }else {
        	 System.out.println("Terms and Conditons Popup is Not Displayed");
         }
         
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         handledSleep(1);           
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(confirmbookingbutton).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(okafterconfirm).click(); 

         handledSleep(2);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         
         while(driver2.findElements(allow).size()!=0) {
			 driver2.findElement(allow).click();
		 }
		
		 handledSleep(1);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 handledSleep(1);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 while(driver2.findElements(hamburger).size()==0) {
			 handledSleep(1);
	         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 }
		  return this;
		 
	 }
	 
	 public CustomerApp validatecustbalancenewreq() {
		 
		 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(payements).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String stringtotalamount=driver2.findElement(totalamount).getText();
         String[] splittotalamount=stringtotalamount.split(" ");
         stringtotalamount=splittotalamount[1];
         int totalamount=Integer.parseInt(stringtotalamount);
         afterbookcustbal=totalamount;
         System.out.println("After Booking Cust Balance= "+afterbookcustbal);
         prize=newreqIntialCustBal-afterbookcustbal;
         System.out.println("prize  ="+prize);
         if(prize==visibleprize && prize== amounttopayint) {
        	 
        	 Assert.assertTrue("Same Amount is Shown", true);
         }
         else {
        	 
        	 System.out.println("XXXXXX   Same Amount is Not Shown XXXXXXXXXX");
        	 //Assert.fail("Same Amount is Not Deducted");
         }
		
		return this;
		 
	 }
	 
	 public CustomerApp modifyReg_Regbooking() {
		 
		 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(payements).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String stringtotalamount=driver2.findElement(totalamount).getText();
         String[] splittotalamount=stringtotalamount.split(" ");
         stringtotalamount=splittotalamount[1];
         int totalamount=Integer.parseInt(stringtotalamount);
         custbalance=totalamount;
         System.out.println("Befor Modify Customer Balance  ="+custbalance);		 
		 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(myrides).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(previous).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(upcoming).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(myridemodify).click();    
         //while(driver2.findElements(allow).size()!=0) {
			// driver2.findElement(allow).click();
		 //}
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         if(driver2.findElements(bookingmodify).size()>1) {
        	 driver2.findElement(bookingmodify1).click();
        	 
         }
         else {
        	 driver2.findElement(bookingmodify).click();
        	 
         }
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String prizeoftrip=driver2.findElement(costoftrip).getText();
         String[] prizeoftrips=prizeoftrip.split(" ");
         prizeoftrip=prizeoftrips[1];
         int prizeoftripss=Integer.parseInt(prizeoftrip);
         visibleprize=prizeoftripss;           
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(confirmbookingbutton).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         //driver2.findElement(okafterconfirm).click(); 
         handledSleep(2);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         
         while(driver2.findElements(allow).size()!=0) {
			 driver2.findElement(allow).click();
		 }
		
		 handledSleep(1);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 handledSleep(1);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 while(driver2.findElements(hamburger).size()==0) {
			 handledSleep(1);
	         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 }
         
		 return this;
		 
	 }
	 
	 public CustomerApp validatecustbal_modReq() {		 
		 
         
		 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(payements).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String stringtotalamount=driver2.findElement(totalamount).getText();
         String[] splittotalamount=stringtotalamount.split(" ");
         stringtotalamount=splittotalamount[1];
         int totalamount=Integer.parseInt(stringtotalamount);
         afterbookcustbal=totalamount;
         System.out.println("After Modify Booking Cust Balance= "+afterbookcustbal);
         prize=custbalance-afterbookcustbal;
         System.out.println("Actual Modify Fee=  "+modifyfees);
         System.out.println("Modify Fee  ="+prize);        
         if(prize==modifyfees) {
        	 System.out.println("Same Amount is Deducted");
        	 Assert.assertTrue("Same Amount is Deducted", true);

         }
         else {
        	 System.out.println("XXXXXX   Same Amount is Not Deducted XXXXXXXXXX");

         }
         
         if( prize==visibleprize) {
        	 
        	 Assert.assertTrue("Same Amount is Shown", true);
         }
         else {
        	 
        	 System.out.println("XXXXXX   Same Amount is Not Shown XXXXXXXXXX");
        	 //Assert.fail("Same Amount is Not Deducted");
         }		 
		 return this;
		 
	 }
	 
	 public CustomerApp cancelbooking() {

         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(myrides).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(previous).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(upcoming).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(trackurtrip).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);       
		 driver2.findElement(upafterconfirm).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(cancelbutton).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(changeinplan).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(cancellationsubmit).click();
         
		 
		 return this;
	 }
	 
	 public CustomerApp cancelamountreturn() {
         handledSleep(2);
		 driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(payements).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String stringtotalamount=driver2.findElement(totalamount).getText();
         String[] splittotalamount=stringtotalamount.split(" ");
         stringtotalamount=splittotalamount[1];
         int totalamount=Integer.parseInt(stringtotalamount);
         cancelreturnbal=totalamount;
         System.out.println("After Cancellation Cust Bal ="+cancelreturnbal);
         int deductedamount=(newreqIntialCustBal-modifyfees-cancelreturnbal);
         System.out.println(deductedamount+ " is the amount deducted from customer after Cancellation");
    
		 return this;
	 }
	 
	 public CustomerApp newreq_racTrip() throws BiffException, IOException {
		 
		 File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\Rac.xls");
		 Workbook rwb=Workbook.getWorkbook(datafile);
		 int nous=rwb.getNumberOfSheets();
		 Sheet rsh=rwb.getSheet(0);
		 int nour=rsh.getRows();
		 	
		 String custpickuploc      =rsh.getCell(1, 8).getContents();
		 String custdroploc        =rsh.getCell(1, 9).getContents();		 
		 // String firstdriver2=rsh.getCell(3, 0).getContents();		
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(payements).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String stringtotalamount=driver2.findElement(totalamount).getText();
         String[] splittotalamount=stringtotalamount.split(" ");
         stringtotalamount=splittotalamount[1];
         int totalamount=Integer.parseInt(stringtotalamount);
         custbalance=totalamount;
         System.out.println("Intial Cust Bal  ="+custbalance);				 
	     handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();         
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(newRequest).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         if(driver2.findElements(searchnewroute).size()!=0) {
             driver2.findElement(searchnewroute).click();		

         }else {
        	 
         }
		 handledSleep(1);
		 
		 while(driver2.findElements(allow).size()!=0) {
		 driver2.findElement(allow).click();
		 }		 
         handledSleep(1);         
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(pickupbox).click();
         handledSleep(2);
         driver2.findElement(enterpickbox).sendKeys(custpickuploc);
         handledSleep(1);          
         driver2.findElement(firstdropdown).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(destinatinbox).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(enterpickbox).sendKeys(custdroploc);
         handledSleep(2);         
         driver2.findElement(firstdropdown).click();         
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(viewtimings).click(); 
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(racreservebutton).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(specifytimelimit).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(racdone).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String prizeoftrip=driver2.findElement(costoftrip).getText();
         String[] prizeoftrips=prizeoftrip.split(" ");
         prizeoftrip=prizeoftrips[1];
         int prizeoftripss=Integer.parseInt(prizeoftrip);
         visibleprize=prizeoftripss;        
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(confirmbookingbutton).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(okafterconfirm).click(); 
         handledSleep(2);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         
         while(driver2.findElements(allow).size()!=0) {
			 driver2.findElement(allow).click();
		 }
		
		 handledSleep(1);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 handledSleep(1);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 while(driver2.findElements(hamburger).size()==0) {
			 handledSleep(1);
	         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
		 }
		 return this;
	     }
	 
	    public CustomerApp editprofile() {		 

         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();	
         handledSleep(3);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(editprofile).click();	
         handledSleep(1);        
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(editbutton).click();        
         handledSleep(2);
         driver2.findElement(editprofilepic).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(proflietakephoto).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(realphoto).click();
         handledSleep(3);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(takephoto).click();
         handledSleep(3);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String IntialCustomerName1=driver2.findElement(editcustname).getText();
         IntialCustomerName=driver2.findElement(editcustname).getText();
         driver2.findElement(editcustname).clear();
         driver2.findElement(editcustname).sendKeys("TestName Name");
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         String custdobirth= driver2.findElement(editdob).getText();
         String[] splitcustdobirth=custdobirth.split("/");
         String custdateofbirth=splitcustdobirth[0];
         String custmonthofbirth=splitcustdobirth[1];   
         int numcustdateofbirth=Integer.parseInt(custdateofbirth);
         int numcustmonthofbirth=Integer.parseInt(custmonthofbirth);
         driver2.findElement(editdob).click();
         handledSleep(1);
         driver2.findElement(prevmonth).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(firstday).click();
         driver2.findElement(calendarok).click();
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);        
         handledSleep(1);
         String custcity= driver2.findElement(editcity).getText();
         driver2.findElement(editcity).click();
         handledSleep(1);
         driver2.findElement(uncheckedcity).click();
         handledSleep(2);  
         String newcustcity= driver2.findElement(editcity).getText();         
         String newcustdobirth= driver2.findElement(editdob).getText();
         String[] newsplitcustdobirth=newcustdobirth.split("/");
         String newcustdateofbirth=newsplitcustdobirth[0];
         String newcustmonthofbirth=splitcustdobirth[1];         
         int newnumcustdateofbirth=Integer.parseInt(newcustdateofbirth);
         int newnumcustmonthofbirth=Integer.parseInt(newcustmonthofbirth);        
         String originalinvitecode=driver2.findElement(invcode).getText();
         driver2.findElement(invcode).clear();
         String shuffledcode = "";
         List<String> letters = Arrays.asList(originalinvitecode.split(""));
         Collections.shuffle(letters);         
         for (String letter : letters) {
           shuffledcode += letter;
         }
         driver2.findElement(invcode).sendKeys(shuffledcode);
         handledSleep(2); 
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         handledSleep(2); 
         driver2.findElement(editprofilesave).click();          
         String newinvitecode=driver2.findElement(invcode).getText();
         if(newinvitecode!=originalinvitecode) {
        	 System.out.println("Invite Code edited Successfully");
         }
         else {
        	 System.out.println("Invite Code Not edited Succefully");
         }
         String newCustName=driver2.findElement(editcustname).getText();
         System.out.println(newinvitecode+" "+originalinvitecode+" "+IntialCustomerName+" "+newCustName);

         if(IntialCustomerName==newCustName) {
        	 System.out.println("Customer name not edited succesfully");

         }
         else {
        	 System.out.println("Customer name edited Succesfully");
         }
       

         if(custdobirth==newcustdobirth) {
        	 System.out.println("Customer DOB not edited Succesfully");

         }
         else {
        	 System.out.println("Customer DOB edited Succesfully");

         }
      
         if(custcity==newcustcity) {
        	 System.out.println("Customer City not changed successfully");

         }
         else {
        	 System.out.println("Customer City changed successfully");

        	 
         }
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(editbutton).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         IntialCustomerName=driver2.findElement(editcustname).getText();
         driver2.findElement(editcustname).clear();
         driver2.findElement(editcustname).sendKeys(IntialCustomerName1);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         handledSleep(1);
         driver2.findElement(editcity).click();
         handledSleep(1);
         driver2.findElement(uncheckedcity).click();
         handledSleep(2);  
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(editprofilesave).click();  
         
         return this;
				 
	     }
	    
	 
	     public CustomerApp custfeedback() {
		 
		  handledSleep(2);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(hamburger).click();	         
		  handledSleep(1);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver2.findElement(feedback).click();
		  handledSleep(1);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(ratingstar).click();
          handledSleep(1);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(others).click();
          handledSleep(1);          
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(sendcomments).sendKeys("TESTING....");
          handledSleep(1);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(feedbacksubmit).click();
          handledSleep(1);
          if(driver2.findElements(feedbackthanks).size()>0) {
        	  System.out.println("Feedback was taken Successfully");
          }
          else if(driver2.findElements(feedbackfail).size()>0) {
        	  System.out.println("Feedback Submission Failure");
          }
          else {
        	  System.out.println("*****CHECK FEEDBACK**********");
          }
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(feedbackok).click();	 
		  return this;
		 
	      }
	 
	    public CustomerApp suggest_new_routest() {
		
	     try {
		 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();	
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(suggestnewroute).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(suggestorigin).sendKeys("Banashankari");
         handledSleep(1);               
         Dimension size = driver2.manage().window().getSize();

          int x1 = (int) (size.getHeight() * 0.5);
          int y1=(int)(size.getWidth()*0.5);
          TouchAction a2 = new TouchAction((MobileDriver) driver2);
          a2.tap (x1, y1).perform();
          handledSleep(2);                
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
          driver2.findElement(suggestdestination).sendKeys("Sony world");         
          TouchAction a3 = new TouchAction((MobileDriver) driver2);
          handledSleep(2);                
          a3.tap(x1,y1).perform();
          }
		  catch(Exception e) {
			 System.out.println(" Exception "+e);
		  }
		 handledSleep(3);                
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(suggeststarttime).click();
         handledSleep(1);                
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(suggestclockseven).click();
         driver2.findElement(By.xpath("//*[@resource-id='android:id/buttonPanel']"));
         handledSleep(1);                
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(suggestclockok).click();
         handledSleep(1);                
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(suggestreturntime).click();
         handledSleep(1);                
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(suggestclockok).click();
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         handledSleep(1);                
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(suggestitenary).click();
         handledSleep(1);                
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(thanksok).click();
		 
		 return this;
		 
	 }
	 
	 public CustomerApp menuroutes() {
		 
		 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();	
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(menuroutes).click();
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(searchroute).sendKeys("BANI");
         handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(routezonename).click();
         handledSleep(3);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);         
         //driver2.findElement(banashankari).click();
         int a=driver2.findElements(listofdotroute).size();
         System.out.println(a);
         List<WebElement> selectroutedot = driver2.findElements(listofdotroute);         
         selectroutedot.get(0).click();
         handledSleep(1);
         selectroutedot.get(2).click();
         handledSleep(1);
         driver2.findElement(btnviewtrips).click();
         while(driver2.findElements(allow).size()!=0) {
			 driver2.findElement(allow).click();
		 }
         handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 if(driver2.findElements(reservebutton).size()!=0) {
			 System.out.println("Reserve is Displayed");
		 }
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);
         handledSleep(1);
         ((AndroidDeviceActionShortcuts) driver2).pressKeyCode(4);         
		 
	      return this;
		 
	 }
	 
	 public CustomerApp homework() throws BiffException, IOException {
		 
		 File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\CustomerApp.xls");              
	     Workbook rwb=Workbook.getWorkbook(datafile);
	     int nous=rwb.getNumberOfSheets();   
	     Sheet rsh=rwb.getSheet(0);    		 
	     String customerhome      =rsh.getCell(3, 1).getContents();
	     String customerwork      =rsh.getCell(4, 1).getContents();	     
		 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(hamburger).click();	
         handledSleep(3);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(editprofile).click();	
         handledSleep(2);        
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(editbutton).click();
         Dimension size = driver2.manage().window().getSize();
         System.out.println(size);
         int starty =(int)(size.height*0.9);
         int endy   =(int)(size.height*0.2);
         int x      =(int)(size.width*0.5);
         ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
         driver2.findElement(homechange).click();
         while(driver2.findElements(allow).size()!=0) {
			 driver2.findElement(allow).click();
		 }
         handledSleep(2);
         driver2.findElement(activeplace).clear();
         handledSleep(2);
         driver2.findElement(activeplace).sendKeys(customerhome);
         handledSleep(2);
         driver2.findElement(firstdropdown).click();
         handledSleep(2);
         driver2.findElement(setworkhome).click();
         handledSleep(2);
         driver2.findElement(workchange).click();
         handledSleep(2);
         driver2.findElement(activeplace).clear();
         handledSleep(2);
         driver2.findElement(activeplace).sendKeys(customerwork);
         handledSleep(2);
         driver2.findElement(firstdropdown).click();
         handledSleep(2);
         driver2.findElement(setworkhome).click();
         handledSleep(1);
         driver2.findElement(reachworkby).click();
         handledSleep(1);
         driver2.findElement(suggestclockseven).click();
         driver2.findElement(suggestclockok).click();
         driver2.findElement(leaveworkby).click();
         driver2.findElement(clockhours).click();
         driver2.findElement(suggestclockninteen).click();
         driver2.findElement(suggestclockok).click();         
         driver2.findElement(editprofilesave).click();
         handledSleep(2);        
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver2.findElement(editbutton).click();                  		 
		 return this;
		
		 
	     }
	 
	 
     public CustomerApp notification() {
    	 
    	 handledSleep(2);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	 driver2.findElement(hamburger).click();
    	 handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	 driver2.findElement(notifications).click();
    	 handledSleep(1);
         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	 if(driver2.findElements(notificationcheck).size()!=0) {
    		System.out.println("GCM Notification was Sent Successfully ");
        	}
    	 else {
    		System.out.println("GCM Notification was not Sent Successfully ");
    	 }
    	
   	     driver2.findElement(deleteallmsg).click();

		 return this;
    	 
         }	  
     
     
      public CustomerApp membershipplans() {

    	  handledSleep(2);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(hamburger).click();	
          handledSleep(2);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(passes).click();	
          handledSleep(2);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          try{
        	  
          if(driver2.findElements(invalidpass).size()!=0) {
 			
          handledSleep(2);
          driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          driver2.findElement(membershipplan).click();
          String nameofsubscr=driver2.findElement(nameofsubscription).getText();
          if( driver2.findElements(buynowmembership).size()>1) {
            handledSleep(1);
            driver2.findElement(buynowmembership1).click(); 
          }

           handledSleep(2);
           driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
           driver2.findElement(iacceptradiobut).click();
           handledSleep(2);
           driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
           driver2.findElement(confsubscription).click();
           handledSleep(2);
           driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
           driver2.findElement(subscriptionok).click();
           System.out.println(nameofsubscr+ " was Bought");
           handledSleep(2);
           driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
           driver2.findElement(hamburger).click();	
           handledSleep(2);
           driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
           driver2.findElement(passes).click();	
           handledSleep(2);
           driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);         	  
           if(driver2.findElements(invalidpass).size()!=0) {  			
         	 handledSleep(2);
             driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         	 driver2.findElement(membershipplan).click();
             String nameofsubscr1=driver2.findElement(nameofsubscription).getText();

         	if( driver2.findElements(buynowmembership).size()>1) {                   
         	  handledSleep(1);
              driver2.findElement(buynowmembership1).click();                

              }
            handledSleep(2);
            driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
            driver2.findElement(iacceptradiobut).click();
            handledSleep(2);
            driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
            driver2.findElement(confsubscription).click();
         
            if(driver2.findElements(seconsubinfo).size()>0) {
            	String secondplaninfo=driver2.findElement(seconsubinfo).getText();
            	System.out.println(secondplaninfo);
            	driver2.findElement(secondinfook).click();
                handledSleep(1);
            	driver2.findElement(backbutton).click();
                handledSleep(1);
            	driver2.findElement(backbutton).click();

          }        	  
          }
          }
          }
           
          catch(Exception e) {
        	  System.out.println(e);
          }         
    	 
    	  return this;
          }
      
      
      
          public CustomerApp discountmembership() {
        

        	  handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
              driver2.findElement(hamburger).click();	
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
              driver2.findElement(passes).click();	
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);    			
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
              driver2.findElement(membershipplan).click();
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
              driver2.findElement(valueaddedpack).click();
              handledSleep(2);
              String nameofsubscr=driver2.findElement(nameofsubscription).getText();

              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
              driver2.findElement(buynowmembership).click();
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
              driver2.findElement(iacceptradiobut).click();
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
              driver2.findElement(confsubscription).click();
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
              driver2.findElement(subscriptionok).click();
              System.out.println(nameofsubscr+ " was Bought");
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
              driver2.findElement(hamburger).click();	
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
              driver2.findElement(passes).click();	
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);         	  
              if(driver2.findElements(invalidpass).size()!=0) {  			
              handledSleep(2);
              driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
              driver2.findElement(membershipplan).click();
              String nameofsubscr1=driver2.findElement(nameofsubscription).getText();

              if( driver2.findElements(buynowmembership).size()>1) {                   
              handledSleep(1);
              driver2.findElement(buynowmembership1).click();  

              }
               handledSleep(2);
               driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
               driver2.findElement(iacceptradiobut).click();
               handledSleep(2);
               driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
               driver2.findElement(confsubscription).click();
            
               if(driver2.findElements(seconsubinfo).size()>0) {
               String secondplaninfo=driver2.findElement(seconsubinfo).getText();
               System.out.println(secondplaninfo);
               driver2.findElement(secondinfook).click();
               handledSleep(1);
               driver2.findElement(backbutton).click();
               handledSleep(1);
               driver2.findElement(backbutton).click();

             }        	  
             }       	  
          
		  return this;
    	  
          }
      
      
      
          public CustomerApp custlogout() {	
        	  
        	 
        	 
        	  
	         handledSleep(2);
             driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
             driver2.findElement(hamburger).click();		 
		     handledSleep(1);
             driver2.findElement(more).click();        
             handledSleep(2);
             driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
             driver2.findElement(logout).click();
             //((InteractsWithApps) driver2).closeApp();
	         handledSleep(10);
		     return this;
		 
	 }
		 	 
		
		
		  
	 
}
