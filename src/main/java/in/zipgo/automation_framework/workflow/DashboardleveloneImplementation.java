
	package in.zipgo.automation_framework.workflow;

	import java.io.IOException;

	import in.zipgo.automation_framework.base.Configurations;
	import in.zipgo.automation_framework.base.DriverFactory;
import in.zipgo.automation_framework.pages.web.CancelCabTrip;
import in.zipgo.automation_framework.pages.web.CreateOrder;
import in.zipgo.automation_framework.pages.web.CreateTrip_helper;
import in.zipgo.automation_framework.pages.web.DriverAttendance;
import in.zipgo.automation_framework.pages.web.Googlelogin;
import in.zipgo.automation_framework.pages.web.HomePageDashboard;
	import in.zipgo.automation_framework.pages.web.LoginPage;
import in.zipgo.automation_framework.pages.web.ManualDelay;
import in.zipgo.automation_framework.pages.web.SignInPage;
import in.zipgo.automation_framework.pages.web.Start_EndTrip;
import in.zipgo.automation_framework.pages.web.TransferTrip;
import in.zipgo.automation_framework.pages.web.ValidateDriverAppAttendance;
import jxl.read.biff.BiffException;

	public class DashboardleveloneImplementation implements Dashboardlevelone {

		

		
		@Override
		public LoginPage navigateToLoginPage(SignInPage signInPage) {		 
		   return signInPage.clickloginwithgoogle();
		}
		
		@Override
		public Googlelogin logintogmail(Googlelogin goglog) {

			goglog.entergoogleusername();
			goglog.entergooglepwd();
			return null;
		}

		@Override
		public HomePageDashboard homepage(HomePageDashboard home)  {			
			
				home.clicktransportation();			
			    home.selectBustrip();
			    return null;
		}

		@Override
		public CreateTrip_helper newtrip(CreateTrip_helper createtrip) {
			
			      try {				
				  createtrip.currenttrip();
				  createtrip.entertripdetails();		
			      } 
			      catch (Exception e) {
				  e.printStackTrace();
			      } 
			      return null;
		}

		@Override
		public CreateTrip_helper tmrwtrip(CreateTrip_helper createtmrwtrip) {			
			
				 try {
			     createtmrwtrip.entertomorrowtripdetails();				
				 } catch (Exception e) {}			
			     return null;
		}
		
		@Override
		public CreateTrip_helper validatetrips(CreateTrip_helper validate_Trip) {
			    try {
				validate_Trip.validate_Create_Trip_today();
				validate_Trip.validate_Create_Trip_tommorow();			
			    } catch (Exception e) {}
			    return null;
		}
		
		@Override
		public CreateTrip_helper createractrip(CreateTrip_helper create_rac_trip) {
			
			try {
				create_rac_trip.ractrip();			
			} catch (Exception e) {}			
			return null;
		}

		@Override
		public ManualDelay delaycab(ManualDelay delaytrip) {
			  delaytrip.manualdelay();
			  return null;
		}
		
		@Override
		public CancelCabTrip canceltrip(CancelCabTrip cancelthecabtrip) {
			 cancelthecabtrip.cancelTrip1();
			 cancelthecabtrip.verifyCancellation();
			 return null;
		}
		
		@Override
		public CancelCabTrip verifycancelcab(CancelCabTrip cancelthecabtrip) {
			
			cancelthecabtrip.verifyCancellation();
			return null;
		}

		@Override
		public TransferTrip transfercab(TransferTrip transferdriver) {
			transferdriver.transfertrip();
			return null;
		}
		
		@Override
		public Start_EndTrip startencab(Start_EndTrip startendcab) {
			
			startendcab.start_trip();
			startendcab.endtrip();
			return null;
		}
		
		@Override
		public CreateOrder createanorder(CreateOrder create_new_order) {
			
			try {
				create_new_order.create_neworder1();			
			    } catch (Exception e) {}
			
			return null;
		}
		
		@Override
		public CreateOrder validateorder(CreateOrder create_new_order) {
			try {
				create_new_order.validate_newOrder();			
			    } catch (Exception e) {}

			return null;
		}

		@Override
		public CreateOrder createracorder(CreateOrder create_rac_order) {
			
			try {
				create_rac_order.create_new_rac_order();
				}catch (Exception e) {}
			return null;
		}
		
		@Override
		public DriverAttendance cabattendance(DriverAttendance attendance) {
			try {
				attendance.navigatetoDashboard();
				attendance.givepresent();
				attendance.giveabsent();
				
			} 
			
			catch (Exception e) {
				e.printStackTrace();
			}			
					
			return null;
		}

		@Override
		public DriverAttendance validatecabattendance(DriverAttendance validateattendance) {
			try {
				validateattendance.validateattendace();
			}  catch (Exception e) {}
			return null;
		}

		@Override
		public ValidateDriverAppAttendance validatedriverappattendance(ValidateDriverAppAttendance validatedriverapp) {
			try {
				validatedriverapp.validatedriverapp();			
			} catch (Exception e) {				
			}
			return null;
		}

		

		

		

		
		
		

	
		
		

		
		

		

		

		

		
		
		
		

	}


