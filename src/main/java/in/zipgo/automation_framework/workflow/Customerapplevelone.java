package in.zipgo.automation_framework.workflow;

import in.zipgo.automation_framework.pages.mobile.CustomerApp;

public interface Customerapplevelone {
	
	public CustomerApp opencustapp(CustomerApp open_custApp);
	
	public CustomerApp newbooking(CustomerApp new_Req1);
	
	public CustomerApp validatecustbal_newReq(CustomerApp validatebal);

	public CustomerApp cancelbooking(CustomerApp cancel_booking);
	
	public CustomerApp edit_cust_profile(CustomerApp editcust_profile);
	
	public CustomerApp cust_feedback(CustomerApp customerfeedback);
	
	public CustomerApp suggest_new_Routes(CustomerApp suggestroutes);
	
	public CustomerApp log_out_cust_app(CustomerApp logoutcustomerapp);
	
	
	
		
	

}
