package in.zipgo.automation_framework.pages.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import in.zipgo.automation_framework.pages.mobile.CustomerApp;

public class Notifications extends BasePage {
	
	final By clipchevoronright              = By.xpath("//i[@class='clip-chevron-right']");

	final By notificationpodcast            = By.xpath("//span[text()='Notification']");
	final By createnewnotification          = By.xpath("(//span[text()='Create New'])[7]");
	final By sendnotificationbutton         = By.xpath("//*[text()='Send Notification']/child::*");
	final By selectnotification             = By.xpath("//span[@title='Select Notification']");
	final By customautomationtest           = By.xpath("//li[text()='custom - Automation Testing']");
	final By recepienttype                  = By.xpath("//span[@title='Select Recipient Type']");
	final By notificationcust               = By.xpath("//li[text()='Customer']");
	final By recepientmethod                = By.xpath("//span[@title='Select Recipient Method']");
	final By choosecustomer                 = By.xpath("//li[text()='Choosen Recipients']");
	final By sendcustmailastag              = By.xpath("//div[@id='search_recipient_addTag']/child::*[2]");
	final By selectcustfromdropdown         = By.xpath("//a[@class='ui-corner-all ui-state-focus']");
	final By notificationsave               = By.xpath("(//input[@class='btn btn-small btn-primary'][@value='Save'])[1]");
	final By aftersavesearch                = By.xpath("//input[@type='search']");
	final By notificationdelivered          = By.xpath("//td[text()='Delivered']");
	final By notificationclose              = By.xpath("(//button[@class='close'])[3]");
	final By notificationtraillist          = By.xpath("//span[text()='Notificaiton Trails List']");
	final By finishednotificationtime       = By.xpath("(//tr[@class='odd'])[1]/child::*[6]");
	final By finishgreen                    = By.xpath("(//tr[@class='odd'])[1]/child::*[3]/child::*");
	final By notifutraledit                 = By.xpath("(//tr[@class='odd'])[1]/child::*[8]/child::a[1]");
	
	
	public Notifications send_notification() {
		
		handledSleep(5);
        implictwait(40);
        clickButton(waitForElement(clipchevoronright));
        handledSleep(5);
        implictwait(40);
        scrolldown();
        implictwait(40);
        clickButton(waitForElement(notificationpodcast));
        handledSleep(2);
        implictwait(40);
        clickButton(waitForElement(createnewnotification));
        handledSleep(2);
        implictwait(40);
        clickButton(waitForElement(sendnotificationbutton));
        handledSleep(1);
        implictwait(40);
        clickButton(waitForElement(selectnotification));
        handledSleep(1);
        implictwait(40);
        clickButton(waitForElement(customautomationtest));
        handledSleep(1);
        implictwait(40);
        clickButton(waitForElement(recepienttype));
        handledSleep(1);
        implictwait(40);
        clickButton(waitForElement(notificationcust));
        handledSleep(1);
        implictwait(40);
        clickButton(waitForElement(recepientmethod));
        handledSleep(2);
        implictwait(40);
        clickButton(waitForElement(choosecustomer));
        handledSleep(2);
        implictwait(40);
		sendValuesToWebElement(waitForElement(sendcustmailastag),"zipgouser@gmail.com");
		handledSleep(2);
        implictwait(40);
        actiondownkey();
        actionenter();
        clickButton(waitForElement(notificationsave));
		handledSleep(2);       
        implictwait(30);
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        f.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(f.format(new Date()));
        String notificationdate=f.format(new Date());
   		handledSleep(2);
        implictwait(30);
        clickButton(waitForElement(notificationclose));
        handledSleep(3);
        implictwait(40);       
        clickButton(waitForElement(notificationpodcast));
        handledSleep(2);
        implictwait(40);
        clickButton(waitForElement(notificationtraillist));
        handledSleep(2);
        implictwait(40);
        String finishedtime=waitForElement(finishednotificationtime).getText();
        String validatefinish=waitForElement(finishgreen).getText();
        clickButton(waitForElement(notifutraledit));
        handledSleep(2);
        implictwait(40);   
        System.out.println(f.format(new Date()));

        if( isDisplayed(notificationdelivered) && finishedtime.contains(notificationdate) &&  validatefinish.contains("finish") ) {
        	System.out.println("Notification Sent");
        }
        else {
        	System.out.println("Notification Not sent");
        } 
        handledSleep(2);
        implictwait(30);
        clickButton(waitForElement(notificationclose));
        refresh();
        		
		return this;
		
	}

	

}
