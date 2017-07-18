package automationFramework;
 
import org.apache.log4j.xml.DOMConfigurator;
 
import org.openqa.selenium.WebDriver;
 
import org.testng.annotations.*;
 
import pageObjects.*;
 
import utility.*;
 
import appModule.*;
 
public class UDF_TC {
 
    public WebDriver driver;
 
    private String sTestCaseName;
 
    private int iTestCaseRow;
 
    @BeforeMethod
 
  public void beforeMethod() throws Exception {
 
         DOMConfigurator.configure("log4j.xml");
 
         sTestCaseName = this.toString();
         System.out.println(sTestCaseName);

        
         sTestCaseName = Utils.getTestCaseName(this.toString());
         //Nuwas Work
         String name = new Object(){}.getClass().getEnclosingMethod().getName();
         System.out.println("Current Method Name"+name); 
         
         System.out.println(sTestCaseName);
        Log.startTestCase(sTestCaseName);
 
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
 
        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
 
        driver = Utils.openBrowser(iTestCaseRow);
 
        }
 
    @Test
 
  public void main() throws Exception {
    	
        SignIn_Action.Execute(driver);
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("Current Method Name"+name); 
        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
        
        MercuryReservationPage.lnkSignOff(driver).click();
        
        Log.info("Click action is performed on Log Out link");
 	
        }
 
   @AfterMethod
 
  public void afterMethod() {
 
        driver.quit();
 
        }
 
}