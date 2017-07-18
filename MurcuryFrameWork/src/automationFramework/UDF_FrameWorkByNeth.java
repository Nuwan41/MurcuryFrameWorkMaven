package automationFramework;

import org.apache.log4j.xml.DOMConfigurator;
 
import org.openqa.selenium.WebDriver;
 
import org.testng.annotations.*;
 
import pageObjects.*;
 
import utility.*;
 
import appModule.*;
 
public class UDF_FrameWorkByNeth {
 
    public WebDriver driver;
 
    private String sTestCaseName;
 
    private int iTestCaseRow;
 
    @BeforeMethod
 
  public void beforeMethod() throws Exception {
 
         DOMConfigurator.configure("log4j.xml");  
         ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
 
    }
 
    @Test
 
  public void TestCase1() throws Exception {
    	
    	String Mtd_TestCaseName = new Object(){}.getClass().getEnclosingMethod().getName().toString();
    	
    	sTestCaseName=Mtd_TestCaseName;
    	//sTestCaseName = this.toString();  
        //sTestCaseName = Utils.getTestCaseName(this.toString());
               
        //Nuwas Work                  
        
        
        System.out.println(sTestCaseName);
        Log.startTestCase(sTestCaseName);
    	
        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);        
        driver = Utils.openBrowser(iTestCaseRow);
    	
        SignIn_Action.Execute(driver,iTestCaseRow);        
             
        MercuryReservationPage.lnkSignOff(driver).click();
        
        Log.info("Click action is performed on Log Out link");
 	
        }
    
    @Test
    
    public void TestCase2() throws Exception {
      	
      	String Mtd_TestCaseName = new Object(){}.getClass().getEnclosingMethod().getName().toString();
      	
      	sTestCaseName=Mtd_TestCaseName;
      	//sTestCaseName = this.toString();  
          //sTestCaseName = Utils.getTestCaseName(this.toString());
                 
          //Nuwas Work                  
          
          
          System.out.println(sTestCaseName);
          Log.startTestCase(sTestCaseName);
      	
          iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);        
          driver = Utils.openBrowser(iTestCaseRow);
      	
          SignIn_Action.Execute(driver,iTestCaseRow);        
               
          MercuryReservationPage.lnkSignOff(driver).click();
          
          Log.info("Click action is performed on Log Out link");
   	
          }
@Test
    
    public void TestCase3() throws Exception {
      	
      	String Mtd_TestCaseName = new Object(){}.getClass().getEnclosingMethod().getName().toString();
      	
      	sTestCaseName=Mtd_TestCaseName;
      	//sTestCaseName = this.toString();  
          //sTestCaseName = Utils.getTestCaseName(this.toString());
                 
          //Nuwas Work                  
          
          
          System.out.println(sTestCaseName);
          Log.startTestCase(sTestCaseName);
      	
          iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);        
          driver = Utils.openBrowser(iTestCaseRow);
      	
          SignIn_Action.Execute(driver,iTestCaseRow);        
               
          MercuryReservationPage.lnkSignOff(driver).click();
          
          Log.info("Click action is performed on Log Out link");
   	
          }

@Test

public void TestCase4() throws Exception {
  	
  	String Mtd_TestCaseName = new Object(){}.getClass().getEnclosingMethod().getName().toString();
  	
  	sTestCaseName=Mtd_TestCaseName;
  	//sTestCaseName = this.toString();  
      //sTestCaseName = Utils.getTestCaseName(this.toString());
             
      //Nuwas Work                  
      
      
      System.out.println(sTestCaseName);
      Log.startTestCase(sTestCaseName);
  	
      iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);        
      driver = Utils.openBrowser(iTestCaseRow);
  	
      SignIn_Action.Execute(driver,iTestCaseRow);        
           
      MercuryReservationPage.lnkSignOff(driver).click();
      
      Log.info("Click action is performed on Log Out link");
	
      }

@Test
public void TestCase5() throws Exception {
  	
  	String Mtd_TestCaseName = new Object(){}.getClass().getEnclosingMethod().getName().toString();
  	
  	sTestCaseName=Mtd_TestCaseName;
  	//sTestCaseName = this.toString();  
      //sTestCaseName = Utils.getTestCaseName(this.toString());
             
      //Nuwas Work                  
      
      
      System.out.println(sTestCaseName);
      Log.startTestCase(sTestCaseName);
  	
      iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);        
      driver = Utils.openBrowser(iTestCaseRow);
  	
      SignIn_Action.Execute(driver,iTestCaseRow);        
           
      MercuryReservationPage.lnkSignOff(driver).click();
      
      Log.info("Click action is performed on Log Out link");
	
      }
    
    
 
   @AfterMethod
 
  public void afterMethod() {
 
        driver.quit();
 
        }
 
}