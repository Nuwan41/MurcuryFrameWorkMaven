package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MercuryReservationPage2 {
	private static WebElement element=null;
	
	public static WebElement imgSelectFlight(WebDriver driver){
		
		//element=driver.findElement(By.xpath(""));
		//element=driver.findElement(By.cssSelector("img[width='492']"));
		//element=driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
		element=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/font/b/font"));
		return element;
	}
	public static WebElement imgDepart(WebDriver driver){
		
		element=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/font/b/font"));
		return element;
	}

}
