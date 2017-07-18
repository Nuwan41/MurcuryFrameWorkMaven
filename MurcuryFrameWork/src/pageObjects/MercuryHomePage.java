package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class MercuryHomePage {
	private static WebElement element=null;
	
	public static WebElement lnk_SignOn(WebDriver driver){
		element=driver.findElement(By.linkText("SIGN-ON"));
		
		Log.info("My SIGN-ON link element found");
		return element;
	}
	public static WebElement lnk_Registor(WebDriver driver){
		element=driver.findElement(By.linkText("REGISTER"));
		Log.info("My Return link element found");
		return element;
	}

}
