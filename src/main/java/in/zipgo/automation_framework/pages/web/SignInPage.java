package in.zipgo.automation_framework.pages.web;

import org.openqa.selenium.By;


//............................30/12/2017..........................................

public class SignInPage extends BasePage {

 
    private final By corporateLoginButton = By.xpath("//button[@data-provider='corporate-login']");
    private final By errorMessage = By.className("alert-danger");
    private final By loginwithgoogle=By.xpath("//div[text()='Login with Google']");
    
    
    

    public LoginPage clickloginwithgoogle(){
    
	       handledSleep(5);		
           waitForElement(loginwithgoogle).click();
    	   return new LoginPage();
    	
           }
    
    
    public  LoginPage clickCorporateLoginButton() {
           waitForElement(corporateLoginButton).click();
           return new LoginPage();
           }
    
    public String getErrorMessage(){
           return waitForElement(errorMessage).getText();
           }
    }
