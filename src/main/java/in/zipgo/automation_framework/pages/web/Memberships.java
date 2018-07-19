package in.zipgo.automation_framework.pages.web;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Memberships extends BasePage {
	
	
	final By clipchevoronright     = By.xpath("//*[@class='clip-chevron-right']");
    final By customers             = By.xpath("//span[text()='Customers']");
	final By membershipplans       = By.xpath("//span[text()='Membership Plans (MP)']");
	final By nodataavilable        = By.xpath("//td[text()='No data available in table']");
	final By membershipdelete      = By.xpath("//a[text()='Delete']");
	final By creatememberplan      = By.xpath("//span[text()='Create Membersip Plan']");
	final By memeberplanname       = By.id("membership_plan_name");
	final By memberplancode        = By.id("membership_plan_code");
	final By tradearedd            = By.id("select2-membership_plan_tradearea_id-container");
	final By bangaloredd           = By.xpath("//li[text()='Bangalore, India']");
	final By memberprice           = By.id("membership_plan_price");
	final By memberactualprice     = By.id("membership_plan_actual_price");
	final By membershipdisp        = By.id("membership_plan_display_on_app");
	final By disclabel             = By.id("membership_plan_discount_label_for_app");
	final By isvalpack             = By.xpath("(//span[@class='switch-label'])[2]");
	final By memplanstartbefor     = By.id("membership_plan_booking_start_before");
	final By discpercent           = By.id("membership_plan_discount");
	final By planstartdate         = By.id("membership_plan_start_date");
	final By planenddate           = By.id("membership_plan_end_date");
	final By planduration          = By.id("membership_plan_duration_value");
	final By validityduration      = By.xpath("//input[@id='membership_plan_validity_duration']");
	final By plancategory          = By.id("select2-membership_plan_membership_plan_category_id-container");
	final By moneysavepack         = By.xpath("//li[text()='Money saving Packs']");
	final By valueaddedpack        = By.xpath("//li[text()='Value added Packs']");
	final By planroutes            = By.id("membership_plan_link_routes");
	final By plantimings           = By.id("membership_plan_timings");
	final By supportmail           = By.id("membership_plan_support_agent_mails");
	final By membershipsave        = By.xpath("//input[@class='btn btn-info btn-sm']");
	final By membershipclose       = By.xpath("(//button[@class='close'])[3]");

	final By membershipsearch      = By.xpath("//input[@type='search']");
	final By plannamecheck         = By.xpath("//td[@class='sorting_1']");
	
	
	
    String givendiscountname;
    String givencode;
	
	public Memberships create_discount_memberships() throws BiffException, IOException {
		
		 handledSleep(2);
		 File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\Memberships.xls");
	     Workbook rwb=Workbook.getWorkbook(datafile);
		 Sheet rsh=rwb.getSheet(0);  
			 	
			    String discountName         =rsh.getCell(0, 1).getContents();  
			    String discountcode         =rsh.getCell(1, 1).getContents();	
			    String membershipprice      =rsh.getCell(2, 1).getContents();
			    String discountlabel        =rsh.getCell(3, 1).getContents();
			    String bookbefore           =rsh.getCell(4, 1).getContents();
			    String discountpercent      =rsh.getCell(5, 1).getContents();    
	  
		String shuffledcodename = null;
		List<String> letters = Arrays.asList(discountName.split(""));
		Collections.shuffle(letters);         
		for (String letter : letters) {
		shuffledcodename += letter;
		}
	    givendiscountname=shuffledcodename;	
	    
	    
	    String shufflecodecode=null;
		List<String> letters1 = Arrays.asList(discountName.split(""));
		Collections.shuffle(letters1);         
		for (String letter1 : letters1) {
			shufflecodecode += letter1;
			}
		givencode=shufflecodecode;
		
		handledSleep(3);
        implictwait(30);       
        clickButton(waitForElement(clipchevoronright));
        handledSleep(1);
        implictwait(30);
        clickButton(waitForElement(customers));
        scrolldown();
        handledSleep(1);
        implictwait(30);
        clickButton(waitForElement(membershipplans));
        handledSleep(1);
        implictwait(30);
        refresh();        
        clickButton(waitForElement(creatememberplan));
        handledSleep(1);
        implictwait(30);   	    
		sendValuesToWebElement(waitForElement(memeberplanname),givendiscountname);
		sendValuesToWebElement(waitForElement(memberplancode),givencode);
        clickButton(waitForElement(tradearedd));
        handledSleep(2);
        clickButton(waitForElement(bangaloredd));
		sendValuesToWebElement(waitForElement(memberprice),membershipprice);
		sendValuesToWebElement(waitForElement(memberactualprice),membershipprice);
        clickButton(waitForElement(membershipdisp));
		sendValuesToWebElement(waitForElement(disclabel),discountlabel);
		sendValuesToWebElement(waitForElement(memplanstartbefor),bookbefore);
		sendValuesToWebElement(waitForElement(discpercent),discountpercent);
        clickButton(waitForElement(planstartdate));
        actionenter();
        DateFormat df= new SimpleDateFormat("yyyy-MM-dd");

		Date date = new Date();

	    Calendar cal = Calendar.getInstance();

	    cal.setTime(date);

	    cal.add(Calendar.DATE, 1);

	    String dateFinal= df.format(cal.getTime());
		sendValuesToWebElement(waitForElement(planenddate),dateFinal);
		sendValuesToWebElement(waitForElement(planduration),"1");
		waitForElement(validityduration).clear();
		sendValuesToWebElement(waitForElement(validityduration),"1");
        clickButton(waitForElement(isvalpack));
        handledSleep(2);
        clickButton(waitForElement(plancategory));
        clickButton(waitForElement(valueaddedpack));
		sendValuesToWebElement(waitForElement(planroutes),"All routes");
		sendValuesToWebElement(waitForElement(plantimings),"All Day");
		sendValuesToWebElement(waitForElement(supportmail),"siddhartha@zipgo.in");
		handledSleep(2);
		implictwait(30);
        clickButton(waitForElement(membershipsave));
		handledSleep(2);
        scrollup();
		handledSleep(2);
        clickButton(waitForElement(membershipclose));
        refresh();
        handledSleep(3);
        waitForElement(membershipsearch).clear();
		sendValuesToWebElement(waitForElement(membershipsearch),givendiscountname);
		String membershipname=waitForElement(plannamecheck).getText();
		if(membershipname.contains(givendiscountname)) {
			System.out.println("Membership Created");
			
		}
		else {
			System.out.println("Membership Not Created");
		}        
		return this;
		
	    }
	
	   public String nameofdiscountgiven() {
		return givendiscountname;
		
	    }
	   
	   public String nameofdiscountcodegiven() {
		return givencode;
		
		
	     }
	

}
