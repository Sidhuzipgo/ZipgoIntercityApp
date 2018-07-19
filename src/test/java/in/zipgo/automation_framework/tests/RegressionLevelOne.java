
	
	package in.zipgo.automation_framework.tests;

	import in.zipgo.automation_framework.base.DriverFactory;

	import in.zipgo.automation_framework.base.TestGroups;
import in.zipgo.automation_framework.pages.mobile.CustomerApp;
import in.zipgo.automation_framework.pages.mobile.DriverLandingScreen;
import in.zipgo.automation_framework.pages.mobile.DriverLoginScreen;
import in.zipgo.automation_framework.pages.mobile.OpenDriverApp;
import in.zipgo.automation_framework.pages.mobile.Samplecust;
import in.zipgo.automation_framework.pages.web.CancelCabTrip;
import in.zipgo.automation_framework.pages.web.CreateOrder;
import in.zipgo.automation_framework.pages.web.CreateTrip_helper;
	import in.zipgo.automation_framework.pages.web.DashboardPage;
import in.zipgo.automation_framework.pages.web.DeleteTrips;
import in.zipgo.automation_framework.pages.web.DriverAttendance;
import in.zipgo.automation_framework.pages.web.Googlelogin;
    import in.zipgo.automation_framework.pages.web.HomePageDashboard;
	import in.zipgo.automation_framework.pages.web.LoginPage;
    import in.zipgo.automation_framework.pages.web.ManualDelay;
    import in.zipgo.automation_framework.pages.web.SignInPage;
import in.zipgo.automation_framework.pages.web.Start_EndTrip;
import in.zipgo.automation_framework.pages.web.TransferTrip;
import in.zipgo.automation_framework.pages.web.ValidateDriverAppAttendance;
import in.zipgo.automation_framework.utils.Excel;
	import in.zipgo.automation_framework.utils.ExcelContext;
    import in.zipgo.automation_framework.workflow.Dashboardlevelone;
    import in.zipgo.automation_framework.workflow.DashboardleveloneImplementation;
import in.zipgo.automation_framework.workflow.Driverapplevelone;
import in.zipgo.automation_framework.workflow.DriverappleveloneImplementation;
import in.zipgo.automation_framework.workflow.ZipGoWorkFlowImplementations;
	import in.zipgo.automation_framework.workflow.ZipGoWorkflows;
import io.appium.java_client.android.AndroidDriver;
import jxl.read.biff.BiffException;
	import jxl.write.WriteException;
	import jxl.write.biff.RowsExceededException;

	import java.io.IOException;
	import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	
	public class RegressionLevelOne extends BaseTests {
		
		 
		 @Test(priority=1)
	      public void opendashboard() throws MalformedURLException {
		       
				DriverFactory.createWebDriverInstance();	               
		        ZipGoWorkflows zgw = new ZipGoWorkFlowImplementations();
		        SignInPage signInPage = zgw.openSignInPage();
	            zgw.navigateToLoginPage(signInPage);       
		  }
		  
		 @Test(priority=2)
	      public void logintodashboard(){
	           Dashboardlevelone dash=new DashboardleveloneImplementation();
	           Googlelogin goglog=new Googlelogin();      
	           dash.logintogmail(goglog);       
	      }
		 
		 
		  
		 
		 @Test(priority=3)
		  public void createTrip() throws BiffException, IOException, InterruptedException, ParseException {		  
	           Dashboardlevelone dash=new DashboardleveloneImplementation();
	           HomePageDashboard home=new HomePageDashboard();
		       dash.homepage(home);
		       CreateTrip_helper createtrip1 =new CreateTrip_helper();		       
		       dash.newtrip(createtrip1);
		       dash.tmrwtrip(createtrip1);
		       dash.validatetrips(createtrip1);		          
		  }
		  
		  @Test(priority=4)
		  public void cabtripattendance() throws BiffException, IOException {
	           Dashboardlevelone dash=new DashboardleveloneImplementation();
               DriverAttendance attend=new DriverAttendance();
               dash.cabattendance(attend);
               
		  }
		 
		  @Test(priority=5)
		  public void manualDelay() {
	           Dashboardlevelone dash=new DashboardleveloneImplementation();
               ManualDelay delacab1=new ManualDelay();
               dash.delaycab(delacab1);
		  }
		  
		 /* @Test(priority=6)
		  public void cancelfirsttrip() {
	           Dashboardlevelone dash=new DashboardleveloneImplementation();
	           CancelCabTrip cancelfirsttrip=new CancelCabTrip();
	           dash.canceltrip(cancelfirsttrip);
	           dash.verifycancelcab(cancelfirsttrip);
		  }
		  
		  
		  @Test(priority=7)
		  public void transfercabtrip() {
	           Dashboardlevelone dash=new DashboardleveloneImplementation();
	           TransferTrip transfercabtrip=new TransferTrip();
	           dash.transfercab(transfercabtrip);

		  }		 
		
		  
		  @Test(priority=8)
		  public void startendtrip() {
			  Dashboardlevelone dash=new DashboardleveloneImplementation();
			  Start_EndTrip startend_cab=new Start_EndTrip();
			  dash.startencab(startend_cab);
			  
		  }
		  
		  @Test(priority=9)
	      public void opendashboard1() throws MalformedURLException  {		        
				DriverFactory.createWebDriverInstance();				
		        ZipGoWorkflows zgw = new ZipGoWorkFlowImplementations();
		        SignInPage signInPage = zgw.openSignInPage();
	            zgw.navigateToLoginPage(signInPage);       
		  }
		  
		  @Test(priority=10)
	      public void logintodashboard1(){
	           Dashboardlevelone dash=new DashboardleveloneImplementation();
	           Googlelogin goglog=new Googlelogin();      
	           dash.logintogmail(goglog);       
	      }
		  
		  
		  @Test(priority=11)
		  public void createnewOrder() throws BiffException, IOException {			  
	          Dashboardlevelone dash=new DashboardleveloneImplementation();
			  CreateOrder neworder=new CreateOrder();
			  dash.createanorder(neworder);
			  dash.validateorder(neworder);
			 
		  }
		  
		  @Test(priority=12)
		  public void validate_cab_attendance() {
			  Dashboardlevelone dash=new DashboardleveloneImplementation();
              DriverAttendance attend=new DriverAttendance();
              dash.validatecabattendance(attend);
		  }
		  		 
		 
		  @Test(priority=13)
		  public void opendriverapp() throws BiffException, IOException, InterruptedException {			 
			  Driverapplevelone cabapp=new DriverappleveloneImplementation();
			  OpenDriverApp oda=new OpenDriverApp();
			  cabapp.opendriver(oda);
			  cabapp.cabattendance(oda);
			  cabapp.validatecabprofile(oda);
			  cabapp.cablogout(oda);
			 		 
		  }
		 
		  @Test(priority=14)
          public void validatedriverappattendance() throws BiffException, IOException {
			  Dashboardlevelone dash=new DashboardleveloneImplementation();
			  ValidateDriverAppAttendance vdapp=new ValidateDriverAppAttendance();
			  dash.validatedriverappattendance(vdapp);
			 
		  }
		  
		
		 
		  @Test(priority=15)
		   public void deletetrips() throws BiffException, IOException, InterruptedException {			 
		        DeleteTrips deletecab=new DeleteTrips();
		        deletecab.deletealltrips();			 
			 
	       }
		@Test(priority=15)
		public void Customerapp() throws BiffException, IOException, InterruptedException {
			 CustomerApp cust=new CustomerApp();
			 cust.opencustapp();
			 cust.logincustomerapp();
			 cust.upcomingtrip();
			 cust.newreq();
			 
		}
		
		
	*/
     	  
		
		
	 }

