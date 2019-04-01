package in.zipgo.automation_framework.tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import in.zipgo.automation_framework.base.DriverFactory;
import in.zipgo.automation_framework.pages.web.Booking;
import in.zipgo.automation_framework.pages.web.LoginPage;
import in.zipgo.automation_framework.pages.web.SignInPage;
import in.zipgo.automation_framework.workflow.ZipGoWorkFlowImplementations;
import in.zipgo.automation_framework.workflow.ZipGoWorkflows;

public class Intercitywebsite {
  
    @Test(priority=1)
    public void opendashboard() throws MalformedURLException {
       
	    	DriverFactory.createWebDriverInstance();	               
            ZipGoWorkflows zgw = new ZipGoWorkFlowImplementations();
            SignInPage signInPage = zgw.openSignInPage();
            zgw.navigateToLoginPage(signInPage);        
    }
  
  
    @Test(priority=2)        
    public void logintoagentwebsite(){
	  
            LoginPage login =new LoginPage();
            login.loginscenario();
                    
    }
  
   @Test(priority=3)
    public void booking(){
	   
	        Booking book = new Booking();
	        // book.createBooking(); 
	                  
    }  
    
  
  
    @Test(priority=4)
    public void CancelAllBookings(){
	   
	        Booking book = new Booking();
	        book.CancelAllBooking(); 
	                  
    } 
  
    @Test(priority=5)
    public void Partial_Cancellation(){
	   
	        Booking book = new Booking();
	        book.PartialCancellation(); 
	                  
    }
  
    
    @Test(priority=6)
    public void Edit_Booking(){
	   
	        Booking book = new Booking();
	        book.EditBooking(); 
	                  
    }
    
  
  
  
  
}
