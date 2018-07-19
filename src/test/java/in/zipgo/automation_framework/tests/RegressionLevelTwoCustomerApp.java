package in.zipgo.automation_framework.tests;

import java.io.IOException;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.steadystate.css.parser.ParseException;

import in.zipgo.automation_framework.base.DriverFactory;
import in.zipgo.automation_framework.pages.mobile.CustomerApp;
import in.zipgo.automation_framework.pages.mobile.Samplecust;
import in.zipgo.automation_framework.pages.web.CreateOrder;
import in.zipgo.automation_framework.pages.web.CreateTrip_helper;
import in.zipgo.automation_framework.pages.web.Googlelogin;
import in.zipgo.automation_framework.pages.web.HomePageDashboard;
import in.zipgo.automation_framework.pages.web.Notifications;
import in.zipgo.automation_framework.pages.web.SignInPage;
import in.zipgo.automation_framework.workflow.Customerapplevelone;
import in.zipgo.automation_framework.workflow.CustomerappleveloneImplementation;
import in.zipgo.automation_framework.workflow.Dashboardlevelone;
import in.zipgo.automation_framework.workflow.DashboardleveloneImplementation;
import in.zipgo.automation_framework.workflow.ZipGoWorkFlowImplementations;
import in.zipgo.automation_framework.workflow.ZipGoWorkflows;
import jxl.read.biff.BiffException;

public class RegressionLevelTwoCustomerApp extends BaseTests {
	
	
	
	/* Dashboardlevelone dash             =new DashboardleveloneImplementation();
	 CreateTrip_helper createtrip1      =new CreateTrip_helper();	
     HomePageDashboard home             =new HomePageDashboard();
      Googlelogin goglog                 =new Googlelogin();      */
    
     //CreateOrder order                  =new CreateOrder();
     
     
   	/* @Test(priority=1)
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
           Notifications not     =new Notifications();
      	    not.send_notification();
     }
	  
	  @Test(priority=3)
	  public void createTrip() throws BiffException, IOException, InterruptedException, ParseException {		  
          
          Dashboardlevelone dash             =new DashboardleveloneImplementation();
     	  CreateTrip_helper createtrip1      =new CreateTrip_helper();	
          HomePageDashboard home             =new HomePageDashboard();
          CreateOrder order                  =new CreateOrder();
     	  Notifications not     =new Notifications();
     	  not.send_notification();

	       //dash.homepage(home);	     	       
	       //dash.newtrip(createtrip1);
	      // dash.createractrip(createtrip1);
	       //createtrip1.ractrip();
	    
	       //dash.createracorder(order);
	       
	       
	      
	                
	  }*/
	
	     CustomerApp cust                   =new CustomerApp();
		 Customerapplevelone custapp        =new CustomerappleveloneImplementation();
	 	
		 @Test(priority=1)
	     public void login_custapp() throws BiffException, IOException, InterruptedException { 		
		
			 cust.opencustapp();
			 cust.logincustomerapp();
			
   		   //custapp.opencustapp(cust);	
   		  
   		    //cust.notification();
	     }
		 @Test(priority=2)
	     public void add_funds() throws BiffException, IOException, InterruptedException { 				
			
			 //cust.addfunds();
   		  
	     }
		
		 
/*	 	
	 	@Test(priority=2)
	    public void newrequest_custapp() throws BiffException, IOException {
	 		cust.newreq();
		   // custapp.newbooking(cust);	
		   
	 	
	    }
	 	
	 	@Test(priority=3)
	 	public void valcustbal_newReq() {
	 		cust.validatecustbalancenewreq();
	 	}
	 	
	 	//@Test(priority=4)
	 	//public void modifyReg_RegBooking() {
	 		//cust.modifyReg_Regbooking();
	 	//}
	 	
	 	//@Test(priority=5)
	 	//public void valcustbal_modify() {
	 	  //  cust.validatecustbal_modReq();
	 	//}
	 	
	 	@Test(priority=6)
	    public void cancelbooking_custapp() {	 	
		    custapp.cancelbooking(cust);
		    
	    }
	 	
	 	@Test(priority=7)	
	    public void editcustomerprofile_custapp() {	
	 		custapp.edit_cust_profile(cust);
	 		
	    }
	 	
	 	@Test(priority=8)
	 	public void customer_feedback() {
	 		custapp.cust_feedback(cust);
	 		
	 	}
	 	
	 	//@Test(priority=9)
	 	//public void suggestnewroutes() {
	    //custapp.suggest_new_Routes(cust);
	 	//}
	 	
	 	@Test(priority=10)
	 	public void routes() {
	 		  cust.menuroutes();
	 	}
	 	
	 	
	 	@Test(priority=11)
	 	public void changehome_work_location() throws BiffException, IOException {
	 		 cust.homework();
	 	}
	 	
	 	@Test(priority=12)
	 	public void ractrip() throws BiffException, IOException {
	 		
	 		cust.newreq_racTrip();
	 		
	 	}
	 		 	
	 	@Test(priority=13)
	    public void membership_plan() {	 	
	 		
		    cust.membershipplans();

	    }
	 	*/
	    @Test(priority=14)
	    public void logout_customerapp() {	 	
	 		
		    custapp.log_out_cust_app(cust);

	    }
	 	
	
		 
		 
		 
		 
		 
     //@Test(priority=13)
    //public void logout_custom() {	 	
 		
	   //Database mdb=new Database();
	  // mdb.db1();
       //}

    }
	  
 
       
