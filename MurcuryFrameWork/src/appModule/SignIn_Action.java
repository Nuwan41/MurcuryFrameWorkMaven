package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.MercuryHomePage;
import pageObjects.MercurySignon;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class SignIn_Action {
	
	/*public static void Execute(WebDriver driver,String sUserName,String sPassword){
		//use page object library
		
		
		MercuryHomePage.lnk_SignOn(driver).click();
		MercurySignon.txtUserName(driver).sendKeys(sUserName);
		MercurySignon.txtPassWord(driver).sendKeys(sPassword);
		MercurySignon.btnSubmit(driver).submit();
	}*/
	
	public static void Execute(WebDriver driver) throws Exception{
		 
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(1, 1);
		Log.info("Username picked from Excel is "+ sUserName );
		String sPassword = ExcelUtils.getCellData(1, 2);
		Log.info("Password picked from Excel is "+ sPassword );

		MercuryHomePage.lnk_SignOn(driver).click();
		Log.info("Click action performed on Sign On link");
		MercurySignon.txtUserName(driver).sendKeys(sUserName);
		Log.info("User Name Entered In the User Name Text Box");
		MercurySignon.txtPassWord(driver).sendKeys(sPassword);
		Log.info("Password Entered In the Password Text Box");
		MercurySignon.btnSubmit(driver).submit();
		Log.info("Submit Button Clicked");

    }
	
	public static void Execute(WebDriver driver,int testCaseRow) throws Exception{
		 
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(testCaseRow,Constant.Col_UserName);
		Log.info("Username picked from Excel is "+ sUserName );
		String sPassword = ExcelUtils.getCellData(testCaseRow, Constant.Col_Password);
		Log.info("Password picked from Excel is "+ sPassword );

		MercuryHomePage.lnk_SignOn(driver).click();
		Log.info("Click action performed on Sign On link");
		MercurySignon.txtUserName(driver).sendKeys(sUserName);
		Log.info("User Name Entered In the User Name Text Box");
		MercurySignon.txtPassWord(driver).sendKeys(sPassword);
		Log.info("Password Entered In the Password Text Box");
		MercurySignon.btnSubmit(driver).submit();
		Log.info("Submit Button Clicked");

    }

}
