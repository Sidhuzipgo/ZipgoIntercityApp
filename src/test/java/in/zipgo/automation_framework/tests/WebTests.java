package in.zipgo.automation_framework.tests;

import in.zipgo.automation_framework.base.DriverFactory;
import in.zipgo.automation_framework.base.TestGroups;
import in.zipgo.automation_framework.pages.web.DashboardPage;
import in.zipgo.automation_framework.pages.web.LoginPage;
import in.zipgo.automation_framework.pages.web.SignInPage;
import in.zipgo.automation_framework.utils.Excel;
import in.zipgo.automation_framework.utils.ExcelContext;
import in.zipgo.automation_framework.workflow.ZipGoWorkFlowImplementations;
import in.zipgo.automation_framework.workflow.ZipGoWorkflows;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebTests {

    @Test(dataProvider = "testData", groups = {TestGroups.SMOKE})
    public void loginTests(String username, String password, String isLoggedIn) {
    	
    	 try {
			DriverFactory.createWebDriverInstance();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ZipGoWorkflows zgw = new ZipGoWorkFlowImplementations();
        SignInPage signInPage = zgw.openSignInPage();
        LoginPage loginPage = zgw.navigateToLoginPage(signInPage);
        DashboardPage dashboardPage = null;
        boolean isLoginSuccessful = Boolean.valueOf(isLoggedIn);
        if (isLoginSuccessful) {
            dashboardPage = (DashboardPage) zgw.loginToAsAdministrator(loginPage, username, password, DashboardPage.class);
        } else {
            signInPage = (SignInPage) zgw.loginToAsAdministrator(loginPage, username, password, SignInPage.class);
            assertTrue(signInPage.getErrorMessage().contains("Username or password did not match"));
        }
    }

    @DataProvider(name = "testData", parallel = false)
    public static Object[][] getTestData() {
        ExcelContext context = new ExcelContext();
        context.setExcelFile("testData/Web.xlsx");
        context.setSheetName("login");
        Excel excelObj = new Excel(context);
        String[][] testData = excelObj.getData("username", "password", "isLoggedIn");
        return testData;
    }
}
