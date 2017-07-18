package automationFramework;

//import static org.testng.Assert.assertTrue;

//import org.apache.bcel.generic.Select;
import org.apache.log4j.xml.DOMConfigurator;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.*;
 
import pageObjects.*;
 
import utility.*;
 
import appModule.*;
 
public class MecuryTours_TestCases_Neth {
 
    public WebDriver driver;
 
    private String sTestCaseName;
 
    private int iTestCaseRow;
    
    private boolean assertStatus;
    
    private WebElement element;
 
    @BeforeMethod
 
  public void beforeMethod() throws Exception {
 
         DOMConfigurator.configure("log4j.xml");  
         ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
 
    }
 
    @Test
 
  public void TestCase1() throws Exception {
    	
    	sTestCaseName=new Object(){}.getClass().getEnclosingMethod().getName().toString();    	             
               
        System.out.println(sTestCaseName);
        Log.startTestCase(sTestCaseName);
    	
        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);        
        driver = Utils.openBrowser(iTestCaseRow);
    	
    	//driver=appModule.OpenTestCase.OpenTestCaseNumber(sTestCaseName);
    	
        SignIn_Action.Execute(driver,iTestCaseRow);    
        
        MercuryReservationPage.radButtonRoundTrip(driver).click();
        Log.info("Click action is performed on Round Trip Radio Button");
        Thread.sleep(400);
        
        MercuryReservationPage.drpDownPassangers(driver, 2); 
        Log.info("Returned Back to Tc after Drop Down Passengers Selected on MercuryReservationPage");
        Thread.sleep(400);
        
        MercuryReservationPage.drpDownDepartingFrom(driver, "london");
        Log.info("Returned Back to Tc after Drop Down Departing From Selected on MercuryReservationPage");
        Thread.sleep(400);
        
        MercuryReservationPage.drpDepartingOnMonth(driver, "6");
        Log.info("Returned Back to Tc");
        Thread.sleep(400);
        
        MercuryReservationPage.drpDepartingOnDate(driver, "7");
        Log.info("Returned Back to Tc");
        Thread.sleep(400);
        
        //MercuryReservationPage.drpDownArivingIn(driver, "Paris");
       // Log.info("Returned Back to Tc after Drop Down Ariving In Selected on MercuryReservationPage");
        
      //***** Delete code for ArivingIn If Tc is one way trip. End point marked with stars *****
        
        //*****Update Departing ArivingIn Airport(Acapulco,Frankfurt,London,New York,Paris,Portland,San Francisco,Seattle,Sydney,Zurich)
        MercuryReservationPage.drpDownArivingIn(driver, "Paris");
        Log.info("Returned Back to Tc after Drop Down Ariving In Selected on MercuryReservationPage");
        Thread.sleep(400);
        
        //*****Update ArivingIn Month(1-12)
        MercuryReservationPage.drpArivingInMonth(driver, "7");;
        Log.info("Returned Back to Tc");
        Thread.sleep(400);
        
        //*****Update ArivingIn Date(1-31)
        MercuryReservationPage.drpArivingInDate(driver, "16");
        Log.info("Returned Back to Tc");
        Thread.sleep(400);
        
        //******************************** ArivingIn code End point ************************************
        
        MercuryReservationPage.radButtonsServiceClss(driver, "Business").click();
        Log.info("Click action is performed on Service Class Economy Radio Button"); 
        Thread.sleep(400);
        
      //*****Update Airline Preference(No Preference,Blue Skies Airlines,Unified Airlines,Pangea Airlines)
        MercuryReservationPage.drpAirline(driver, "Pangea Airlines");
        Thread.sleep(400);
        
        MercuryReservationPage.btnContinue(driver).click();
        Log.info("Continue Button Is Clicked");  
        Thread.sleep(400);
        
        appModule.MurcuryAssertStatus.MercuryReservationPageAssert(driver);
        Log.info("Returned Back to Tc");                          
        
        }
    
    @Test
    
    public void TestCase2() throws Exception {
      	
    	sTestCaseName = new Object(){}.getClass().getEnclosingMethod().getName().toString();    	
      	     	                              
          System.out.println(sTestCaseName);
          Log.startTestCase(sTestCaseName);
      	
          iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);        
          driver = Utils.openBrowser(iTestCaseRow);
      	
          SignIn_Action.Execute(driver,iTestCaseRow);   
          
          MercuryReservationPage.radButtonOneWayTrip(driver).click();
          Log.info("Click action is performed on One Way Trip Radio Button");
          
          MercuryReservationPage.drpDownPassangers(driver, 4);  
          Log.info("Returned Back to Tc after Drop Down Passengers Selected on MercuryReservationPage");
          
          MercuryReservationPage.drpDownDepartingFrom(driver, "Sydney");
          Log.info("Returned Back to Tc after Drop Down Departing From Selected on MercuryReservationPage");
          
          MercuryReservationPage.drpDepartingOnMonth(driver, "8");
          Log.info("Returned Back to Tc");
          MercuryReservationPage.drpDepartingOnDate(driver, "8");
          Log.info("Returned Back to Tc");
          
          MercuryReservationPage.drpDownArivingIn(driver, "San Francisco");
          Log.info("Returned Back to Tc after Drop Down Ariving In Selected on MercuryReservationPage");
          
          MercuryReservationPage.radButtonsServiceClss(driver, "Business").click();
          Log.info("Click action is performed on Service Class Business Radio Button");
          
          //*****Update Airline Preference(No Preference,Blue Skies Airlines,Unified Airlines,Pangea Airlines)
          MercuryReservationPage.drpAirline(driver, "Unified Airlines");
          
          MercuryReservationPage.btnContinue(driver).click();
          Log.info("Continue Button Is Clicked"); 
                   
          appModule.MurcuryAssertStatus.MercuryReservationPageAssert(driver);
          Log.info("Returned Back to Tc");
            	
          }
    
 @Test
    //*****Update the Test Case Number
   public void TestCase3() throws Exception {
      	
    	sTestCaseName = new Object(){}.getClass().getEnclosingMethod().getName().toString();    	
      	     	                              
          System.out.println(sTestCaseName);
          Log.startTestCase(sTestCaseName);
      	
          iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);        
          driver = Utils.openBrowser(iTestCaseRow);
      	
          SignIn_Action.Execute(driver,iTestCaseRow);   
          
          //*****Update Test Case on This Place Onwards
          
          //*****Update Oneway/Twoway Method
          MercuryReservationPage.radButtonRoundTrip(driver).click();
          Log.info("Click action is performed on Round Trip Radio Button");
          
          //*****Update Number of Passengers(1-4)
          MercuryReservationPage.drpDownPassangers(driver, 4);  
          Log.info("Returned Back to Tc after Drop Down Passengers Selected on MercuryReservationPage");
          
          //*****Update Departing Airport(Acapulco,Frankfurt,London,New York,Paris,Portland,San Francisco,Seattle,Sydney,Zurich)
          MercuryReservationPage.drpDownDepartingFrom(driver, "Seattle");
          Log.info("Returned Back to Tc after Drop Down Departing From Selected on MercuryReservationPage");
          
          //*****Update Departing Month(1-12)
          MercuryReservationPage.drpDepartingOnMonth(driver, "12");
          Log.info("Returned Back to Tc");
          
          //*****Update Departing Date(1-31)
          MercuryReservationPage.drpDepartingOnDate(driver, "5");
          Log.info("Returned Back to Tc");
          
          //***** Delete code for ArivingIn If Tc is one way trip. End point marked with stars *****
          
          //*****Update Departing ArivingIn Airport(Acapulco,Frankfurt,London,New York,Paris,Portland,San Francisco,Seattle,Sydney,Zurich)
          MercuryReservationPage.drpDownArivingIn(driver, "New York");
          Log.info("Returned Back to Tc after Drop Down Ariving In Selected on MercuryReservationPage");
          
          //*****Update ArivingIn Month(1-12)
          MercuryReservationPage.drpArivingInMonth(driver, "1");;
          Log.info("Returned Back to Tc");
          
          //*****Update ArivingIn Date(1-31)
          MercuryReservationPage.drpArivingInDate(driver, "1");
          Log.info("Returned Back to Tc");
          
          //******************************** ArivingIn code End point ************************************
          
          //*****Update Departing Class(Economy,Business,First)
          MercuryReservationPage.radButtonsServiceClss(driver, "First").click();
          Log.info("Click action is performed on Service Class Business Radio Button");
          
          //*****Update Airline Preference(No Preference,Blue Skies Airlines,Unified Airlines,Pangea Airlines)
          MercuryReservationPage.drpAirline(driver, "Blue Skies Airlines");
          
          MercuryReservationPage.btnContinue(driver).click();
          Log.info("Continue Button Clicked");
          
          //Checking Assert for Test Case Pass
          appModule.MurcuryAssertStatus.MercuryReservationPageAssert(driver);
          Log.info("Returned Back to Tc");                
            	
          }
    	
    
 
   @AfterMethod
 
  public void afterMethod() {
 
        //driver.close();
        driver.quit();
        Log.info("Browser Closed");
 
        }
 
}