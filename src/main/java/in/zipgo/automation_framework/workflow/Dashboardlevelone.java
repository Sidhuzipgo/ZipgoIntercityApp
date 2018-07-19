
	package in.zipgo.automation_framework.workflow;

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

     public interface Dashboardlevelone {
		

	    public LoginPage navigateToLoginPage(SignInPage signInPage);
	    
		public Googlelogin logintogmail(Googlelogin goglog);
		
		public HomePageDashboard homepage(HomePageDashboard home);
		
		public CreateTrip_helper newtrip(CreateTrip_helper createtrip);
		
		public CreateTrip_helper tmrwtrip(CreateTrip_helper createtmrwtrip);
		
		public CreateTrip_helper validatetrips(CreateTrip_helper validate_Trip);
		
		public CreateTrip_helper createractrip(CreateTrip_helper create_rac_trip);
		
		public ManualDelay delaycab(ManualDelay delaytrip);
		
		public CancelCabTrip canceltrip(CancelCabTrip cancelthecabtrip);
		
		public CancelCabTrip verifycancelcab(CancelCabTrip cancelthecabtrip);
		
		public TransferTrip transfercab(TransferTrip transferdriver);
		
		public Start_EndTrip startencab(Start_EndTrip startendcab);
		
		public CreateOrder createanorder(CreateOrder create_new_order);
		
		public CreateOrder validateorder(CreateOrder create_new_order);
		
		public CreateOrder createracorder(CreateOrder create_rac_order);
		
		public DriverAttendance cabattendance(DriverAttendance attendance);

		public DriverAttendance validatecabattendance(DriverAttendance validateattendance);
		
		public ValidateDriverAppAttendance validatedriverappattendance(ValidateDriverAppAttendance validatedriverapp);
	}

	


