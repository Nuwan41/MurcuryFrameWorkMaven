package pageObjects;

import java.util.List;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class MercuryReservationPage {
	private static WebElement element=null;
	
	public static WebElement lnkSignOff(WebDriver driver){
		element=driver.findElement(By.linkText("SIGN-OFF"));
		Log.info("SIGN-OFF link found");
		return element;
	}
	public static WebElement radButtonRoundTrip(WebDriver driver){
		//element=driver.findElement(By.cssSelector("input[value='roundtrip']"));
		element=(new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='roundtrip']")));
		
		Log.info("Round Trip Radio Button Found");
		return element;
	}
	public static WebElement radButtonOneWayTrip(WebDriver driver){
		//element=driver.findElement(By.cssSelector("input[value='oneway']"));
		element=(new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='oneway']")));
		Log.info("One Way Radio Button Found");
		return element;
	}
	public static WebElement radButtonsServiceClss(WebDriver driver,String ServiceClass){
		List<WebElement> serviceRadioButtons=driver.findElements(By.name("servClass"));
		/*List<WebElement> serviceRadioButtons=(List<WebElement>) (new WebDriverWait(driver, 10))
		  .until(ExpectedConditions.presenceOfElementLocated(By.name("servClass")));*/
		
		if(ServiceClass.equalsIgnoreCase("Economy")){
			element= serviceRadioButtons.get(0);
		}
		else if(ServiceClass.equalsIgnoreCase("Business")){
			element= serviceRadioButtons.get(1);
		}
		else if(ServiceClass.equalsIgnoreCase("First")){
			element= serviceRadioButtons.get(2);
		}
	return element;
	}
	public static void drpDownPassangers(WebDriver driver,int PassengerCount){
		//element=driver.findElement(By.name("passCount"));
		element=(new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.name("passCount")));
		Log.info("Passenger Count Element Found");
		Select oSelect=new Select(element);
		oSelect.selectByIndex(PassengerCount-1);
		Log.info("Passenger Count Element Index Selected for "+PassengerCount+" Passengers");
		
	}
	
	public static void drpDownDepartingFrom(WebDriver driver,String strDepartingFrom){
		element=driver.findElement(By.name("fromPort"));
		Log.info("Departing From Element Found");
		Select oSelect=new Select(element);
		//oSelect.selectByVisibleText(strDepartingFrom);
		if(strDepartingFrom.equalsIgnoreCase("Acapulco")){
			oSelect.selectByVisibleText("Acapulco");	
		}
		else if (strDepartingFrom.equalsIgnoreCase("Frankfurt")){
			oSelect.selectByVisibleText("Frankfurt");
		}
		else if (strDepartingFrom.equalsIgnoreCase("London")){
			oSelect.selectByVisibleText("London");
		}
		else if (strDepartingFrom.equalsIgnoreCase("New York")){
			oSelect.selectByVisibleText("New York");
		}
		else if (strDepartingFrom.equalsIgnoreCase("Paris")){
			oSelect.selectByVisibleText("Paris");
		}
		else if (strDepartingFrom.equalsIgnoreCase("Portland")){
			oSelect.selectByVisibleText("Portland");
		}
		else if (strDepartingFrom.equalsIgnoreCase("San Francisco")){
			oSelect.selectByVisibleText("San Francisco");
		}
		else if (strDepartingFrom.equalsIgnoreCase("Seattle")){
			oSelect.selectByVisibleText("Seattle");
		}
		else if (strDepartingFrom.equalsIgnoreCase("Sydney")){
			oSelect.selectByVisibleText("Sydney");
		}
		else if (strDepartingFrom.equalsIgnoreCase("Zurich")){
			oSelect.selectByVisibleText("Zurich");
		}
		else {
			oSelect.selectByVisibleText(strDepartingFrom); 
		}
		Log.info("Departing From Element Selected for "+strDepartingFrom);
		
	}
	
	public static void drpDownArivingIn(WebDriver driver,String strArivingIn){
		element=driver.findElement(By.name("toPort"));
		Log.info("Departing From Element Found");
		Select oSelect=new Select(element);
		//oSelect.selectByVisibleText(strDepartingFrom);
		if(strArivingIn.equalsIgnoreCase("Acapulco")){
			oSelect.selectByValue("Acapulco");	
			
		}
		else if (strArivingIn.equalsIgnoreCase("Frankfurt")){
			oSelect.selectByValue("Frankfurt");
		}
		else if (strArivingIn.equalsIgnoreCase("London")){
			oSelect.selectByValue("London");
		}
		else if (strArivingIn.equalsIgnoreCase("New York")){
			oSelect.selectByValue("New York");
		}
		else if (strArivingIn.equalsIgnoreCase("Paris")){
			oSelect.selectByValue("Paris");
		}
		else if (strArivingIn.equalsIgnoreCase("Portland")){
			oSelect.selectByValue("Portland");
		}
		else if (strArivingIn.equalsIgnoreCase("San Francisco")){
			oSelect.selectByValue("San Francisco");
		}
		else if (strArivingIn.equalsIgnoreCase("Seattle")){
			oSelect.selectByValue("Seattle");
		}
		else if (strArivingIn.equalsIgnoreCase("Sydney")){
			oSelect.selectByValue("Sydney");
		}
		else if (strArivingIn.equalsIgnoreCase("Zurich")){
			oSelect.selectByValue("Zurich");
		}
		else {
			oSelect.selectByValue(strArivingIn); 
		}
		Log.info("Departing From Element Selected for "+strArivingIn);
		
	}
	//Departing Month
	public static void drpDepartingOnMonth(WebDriver driver,String Month){
		element=driver.findElement(By.name("fromMonth"));
		Log.info("Found the Web Element Drop Down Departing Month ");
		Select oSelect=new Select(element);
		
		oSelect.selectByValue(Month);
		Log.info("Selected the "+Month+ " as Departing Month");
	}
	//Departing Date
	public static void drpDepartingOnDate(WebDriver driver,String Date){
		element=driver.findElement(By.name("fromDay"));
		Log.info("Found  the Web Element Drop Down Departing Day ");
		Select oSelect=new Select(element);
		
		oSelect.selectByValue(Date);
		Log.info("Selected the "+Date+ " as Departing Date");
	}
	public static void drpArivingInMonth(WebDriver driver,String Month){
		element=driver.findElement(By.name("toMonth"));
		Log.info("Found the Web Element Drop Down Ariving In Month ");
		Select oSelect=new Select(element);
		
		oSelect.selectByValue(Month);
		Log.info("Selected the "+Month+ " as Ariving In Month");
	}
	//Departing Date
	public static void drpArivingInDate(WebDriver driver,String Date){
		element=driver.findElement(By.name("toDay"));
		Log.info("Found  the Web Element Drop Down ArivingIn Day ");
		Select oSelect=new Select(element);
		
		oSelect.selectByValue(Date);
		Log.info("Selected the "+Date+ " as ArivingIn Date");
	}
	
	//Airline Preference Element
	public static WebElement drpAirline(WebDriver driver,String Airline){
		
		element=driver.findElement(By.name("airline"));		
		Log.info("Airline Preference Element Found");
		
		Select oSelect=new Select(element);
		oSelect.selectByVisibleText(Airline);
		Log.info("Airline Selected");
		
		return element;
	}
	
	public static WebElement btnContinue(WebDriver driver){
		element=driver.findElement(By.name("findFlights"));
		Log.info("Button Continue Element is Found");
		return element;
	}

}
