package in.zipgo.automation_framework.tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import in.zipgo.automation_framework.base.DriverFactory;
import in.zipgo.automation_framework.pages.web.Googlelogin;
import in.zipgo.automation_framework.pages.web.Memberships;
import in.zipgo.automation_framework.pages.web.SignInPage;
import in.zipgo.automation_framework.workflow.Dashboardlevelone;
import in.zipgo.automation_framework.workflow.DashboardleveloneImplementation;
import in.zipgo.automation_framework.workflow.ZipGoWorkFlowImplementations;
import in.zipgo.automation_framework.workflow.ZipGoWorkflows;
import jxl.read.biff.BiffException;

public class RegressionLevelthreeMembership  extends BaseTests {
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
     public void discountbasedmembership() throws BiffException, IOException{
		 Memberships member =new Memberships();
		 member.create_discount_memberships();
              
     }
	 
	  
}
