package appModule;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.MercuryReservationPage2;
import utility.Log;

public class MurcuryAssertStatus {
	
	private static boolean assertStatus;
	
	public static void MercuryReservationPageAssert(WebDriver driver) throws InterruptedException{
		
		assertStatus=MercuryReservationPage2.imgDepart(driver).getText().equals("DEPART");
        //assertStatus=MercuryReservationPage2.imgDepart(driver).isDisplayed();
        System.out.println(assertStatus);
        Assert.assertTrue(assertStatus);  
        
        Log.info("Test Case Passed");
        
        Thread.sleep(1000);
        Log.info("Waited for 1S");
		
	}

}
