package in.zipgo.automation_framework.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import in.zipgo.automation_framework.pages.mobile.OpenDriverApp;
import in.zipgo.automation_framework.workflow.Driverapplevelone;
import in.zipgo.automation_framework.workflow.DriverappleveloneImplementation;
import jxl.read.biff.BiffException;

public class DriverAppLevelOne {
 
  
  @Test(priority=1)
  public void opendriverapp() throws BiffException, IOException, InterruptedException {			 
	  Driverapplevelone cabapp=new DriverappleveloneImplementation();
	  OpenDriverApp oda=new OpenDriverApp();
	  oda.opentheapp();
	 // cabapp.opendriver(oda);
	  cabapp.cabattendance(oda);
	  cabapp.validatecabprofile(oda);
	  cabapp.cablogout(oda);
	 		 
  }
}
