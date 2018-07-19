package in.zipgo.automation_framework.workflow;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import in.zipgo.automation_framework.pages.mobile.CustomerApp;
import jxl.read.biff.BiffException;

public class CustomerappleveloneImplementation implements Customerapplevelone  {

	@Override
	public CustomerApp opencustapp(CustomerApp open_custApp) {
 		//WebDriver driver2 = null;

		try {			
			open_custApp.opencustapp();
			open_custApp.logincustomerapp();
		    } catch (Exception e) {}
		    return new CustomerApp();
	}

	@Override
	public CustomerApp newbooking(CustomerApp new_Req1) {

		try {
		    new_Req1.upcomingtrip();
			 new_Req1.newreq();
			 
			
		    } catch (Exception e) {}
		    return new CustomerApp();
	}

	@Override
	public CustomerApp validatecustbal_newReq(CustomerApp validatebal) {
		validatebal.validatecustbalancenewreq();
		return null;
	}
	
	@Override
	public CustomerApp cancelbooking(CustomerApp cancel_booking) {
		
		cancel_booking.cancelbooking();
		cancel_booking.cancelamountreturn();
		return null;
	}

	@Override
	public CustomerApp edit_cust_profile(CustomerApp editcust_profile) {
		editcust_profile.editprofile();
		return null;
	}
	
	@Override
	public CustomerApp cust_feedback(CustomerApp customerfeedback) {
		customerfeedback.custfeedback();
		return null;
	}

	
	@Override
	public CustomerApp suggest_new_Routes(CustomerApp suggestroutes) {
		suggestroutes.suggest_new_routest();
		return null;
	}

	@Override
	public CustomerApp log_out_cust_app(CustomerApp logoutcustomerapp) {
		logoutcustomerapp.custlogout();
		return null;
	}

	

	
	

}
