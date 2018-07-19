package in.zipgo.automation_framework.workflow;


import java.io.IOException;

import in.zipgo.automation_framework.pages.mobile.OpenDriverApp;
import jxl.read.biff.BiffException;

public class DriverappleveloneImplementation implements Driverapplevelone{

	@Override
	public OpenDriverApp opendriver(OpenDriverApp opencabapp) {
		
		try {
			return opencabapp.opentheapp();
		
		} catch (Exception e) {
			
		}
		return null;
	}

	@Override
	public OpenDriverApp cabattendance(OpenDriverApp cabattendance) {
		
		
		return cabattendance.giveattendance();
	}

	@Override
	public OpenDriverApp validatecabprofile(OpenDriverApp cabprofile) {
		
		try {
			cabprofile.driverprofile();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OpenDriverApp cablogout(OpenDriverApp cablogout) {
		cablogout.driverlogout();
		return null;
	}


	
	
}
