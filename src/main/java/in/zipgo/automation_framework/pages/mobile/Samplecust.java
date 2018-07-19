package in.zipgo.automation_framework.pages.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class Samplecust {

	public WebDriver driver;
	public void opencustapp() throws MalformedURLException {
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	 

	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	 

	capabilities.setCapability("deviceName", "emulator-5554");

	capabilities.setCapability("platformVersion", "6.0.0");

	capabilities.setCapability("platformName", "Android");

	System.out.println("Appium: pass");
	 
	capabilities.setCapability("appActivity","com.zipgo.customer"); //ZipGo Customer App will Open

	System.out.println("App: pass");
	 
	capabilities.setCapability("appActivity", "com.zipgo.customer.activities.SplashActivity"); 

	 System.out.println("select app: pass");
	  
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
}
}