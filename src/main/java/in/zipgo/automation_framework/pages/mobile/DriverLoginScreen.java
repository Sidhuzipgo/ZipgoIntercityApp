package in.zipgo.automation_framework.pages.mobile;

import in.zipgo.automation_framework.pages.web.BasePage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class DriverLoginScreen extends BasePage {

   
	final By loginuser         = By.xpath("//*[@resource-id='com.zipgo.bus:id/username']");
	final By loginpassword     = By.xpath("//*[@resource-id='com.zipgo.bus:id/password']");
    final By submitButton      = By.id("com.zipgo.bus:id/login");

    public DriverLoginScreen enterUsername(String username)  {
    	  
	  
		  waitForElement(loginuser).sendKeys(username);
		 
		      return this;
    }

    public DriverLoginScreen enterPassword(String password) {
        waitForElement(loginpassword).sendKeys(password);
        return this;
    }

    public <T extends BasePage> T clickSubmit(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        waitForElement(submitButton).click();
        return (T) clazz.newInstance();
    }
    
    
    public DriverLoginScreen logindriverapp() throws BiffException, IOException {
    	File datafile=new File("C:\\Users\\Lenovo\\Documents\\autoscripts\\src\\test\\resources\\testData\\applogindata.xls");
		Workbook rwb=Workbook.getWorkbook(datafile);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		    	
	
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		 String loginid=rsh.getCell(1, 1).getContents();
		 String loginpwd=rsh.getCell(2, 1).getContents();
  
	  waitForElement(loginuser).sendKeys(loginid);
	  waitForElement(loginpassword).sendKeys(loginpwd);
	  waitForElement(submitButton).click();
      try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}        return this;
    	
    }
}
