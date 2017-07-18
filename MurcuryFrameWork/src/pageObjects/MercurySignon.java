package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class MercurySignon {
	private static WebElement element=null;
	
	public static WebElement txtUserName(WebDriver driver){
	//element=driver.findElement(By.name("userName"));
		//element=driver.findElement(By.xpath("//*[@name='register']/table/tbody/tr[1]/td[2]/input"));
		element=(new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='register']/table/tbody/tr[1]/td[2]/input")));
		
	
	Log.info("Username text box found");
	return element;
	}
	
	public static WebElement txtPassWord(WebDriver driver){
	element=driver.findElement(By.cssSelector("input[name='password']"));
	Log.info("PassWord text box found");
		return element;
	}
	public static WebElement btnSubmit(WebDriver driver){
	element=driver.findElement(By.name("login"));
	Log.info("Submit button found");
		return element;
	}
}
