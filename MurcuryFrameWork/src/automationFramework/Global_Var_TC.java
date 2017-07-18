package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;
import appModule.SignIn_Action;
import pageObjects.MercuryReservationPage;

public class Global_Var_TC {
	private static WebDriver driver=null;
	
	public static void main(String[] args){
	//use page object library
		
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(Constant.Url);
		
	SignIn_Action.Execute(driver, Constant.UserName, Constant.Password);
	
	System.out.println("Wo hoo... We loged. Time to sign off");
	MercuryReservationPage.lnkSignOff(driver).click();
	
	driver.close();
	}
}
