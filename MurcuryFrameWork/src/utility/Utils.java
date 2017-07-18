package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
	 public static WebDriver driver = null;
	 
	    public static WebDriver openBrowser(int iTestCaseRow) throws Exception{
	 
	        String sBrowserName;
	 
	        try{
	 
	        sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
	        //sBrowserName="Chrome";
	        if(sBrowserName.equals("Firefox")){
	        	
	        	System.setProperty("webdriver.gecko.driver", "C:\\Nuwan\\selenium\\GekoDriver 0.15.0\\geckodriver.exe");
	            driver = new FirefoxDriver();              
	            Log.info("New Firefox driver instantiated");	 
	            	            
	            }
	        if(sBrowserName.equals("Chrome")){
	        	
	            String exePath = "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.29\\chromedriver.exe";
	            
	    		System.setProperty("webdriver.chrome.driver", exePath);
	    		driver = new ChromeDriver();  		
	 
	            Log.info("New Chrome driver instantiated");	 
	            	            
	            }
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   	 
            Log.info("Implicit wait applied on the driver for 5 seconds");
 
            driver.get(Constant.Url);
 
            Log.info("Web application launched successfully");
            
            driver.manage().window().maximize();
            
            Log.info("Browser Maximized");
	 
	        }catch (Exception e){
	 
	            Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
	 
	        }
	 
	        return driver;
	 
	    }
	    
	    public static String getTestCaseName(String sTestCase)throws Exception{
	    	 
	        String value = sTestCase;
	 
	        try{
	 
	            int posi = value.indexOf("@");
	 
	            value = value.substring(0, posi);
	 
	            posi = value.lastIndexOf(".");    
	 
	            value = value.substring(posi + 1);
	 
	            return value;
	 
	                }catch (Exception e){
	 
	            Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
	 
	            throw (e);
	 
	        }
	    }
	 

}
