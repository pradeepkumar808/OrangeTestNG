package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Apputils {
	
     public static WebDriver driver;
     public static String url = "https://flights.qedgetech.com/";
     
     
      @BeforeSuite
     public static void launchApp()
     {
    	 driver = new ChromeDriver();
    	 driver.manage().deleteAllCookies();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
    	 driver.get(url);
     }
    
   @AfterSuite
     public static void closeApp()
     {
    	 driver.close();
     }

} 
