package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.SignIn_Action;
import pageObjects.MercuryHomePage;
import pageObjects.MercuryReservationPage;
import pageObjects.MercurySignon;

public class Module_TC {
	private static WebDriver driver=null;
	
	public static void main(String[] args){
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		//use page object library
		
		SignIn_Action.Execute(driver, "Rathnayaka", "password");;
		
		System.out.println("Wo hoo... We loged. Time to sign off");
		MercuryReservationPage.lnkSignOff(driver).click();
		
		driver.close();
	}

}
