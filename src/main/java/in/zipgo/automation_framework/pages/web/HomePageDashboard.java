
	package in.zipgo.automation_framework.pages.web;

	import org.openqa.selenium.By;
	

	//............................30/12/2017..........................................


	public class HomePageDashboard extends BasePage {
		
		
		final By clipchevoronright    =By.xpath("//*[@class='clip-chevron-right']");
		final By transportation       =By.xpath("//span[text()='Transportation']");
		final By bustrips             =By.xpath("//span[text()='Bus Trips']");
		

		
		
		
		   
        public HomePageDashboard clicktransportation(){
		       handledSleep(3);
			   waitForElement(clipchevoronright).click();
		       waitForElement(transportation).click();	 
		       return this;
	           }
		  		   
		 public HomePageDashboard selectBustrip(){
			    implictwait(30);
			    waitForElement(bustrips).click();
		    	return null;
		        }
		   
		   
	}


