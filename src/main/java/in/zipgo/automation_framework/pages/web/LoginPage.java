package in.zipgo.automation_framework.pages.web;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
	
    final By mobilelogin               = By.xpath("//input[@id='mobileLogin']");
    final By mobilePassword            = By.xpath("//input[@id='mobilePassword']");
    final By loginbutton               = By.xpath("//button[@class='btn btn-primary btn-block']");
    
    
    
    
    public LoginPage loginscenario(){
    	
    	driver.findElement(mobilelogin).sendKeys("9856985698");
    	driver.findElement(mobilePassword).sendKeys("1234");
    	
    	driver.findElement(loginbutton).click();
        return this;
    }
	

}
