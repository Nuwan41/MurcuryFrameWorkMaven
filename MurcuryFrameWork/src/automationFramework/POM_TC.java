package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.SignIn_Action;
import pageObjects.MercuryHomePage;
import pageObjects.MercuryReservationPage;
import pageObjects.MercurySignon;

public class POM_TC {
	private static WebDriver driver=null;
	
	public static void main(String[] args){
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		//use page object library

		MercuryHomePage.lnk_SignOn(driver).click();
		MercurySignon.txtUserName(driver).sendKeys("Rathnayaka");
		MercurySignon.txtPassWord(driver).sendKeys("password");
		MercurySignon.btnSubmit(driver).submit();
		
		System.out.println("Wo hoo... We loged. Time to sign off");
		MercuryReservationPage.lnkSignOff(driver).click();
		
		driver.close();
	}

}
