package orangehrm.libraray;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.Apputils;

public class Loginpage extends Apputils {
	
	@BeforeTest
	public void login(String uid,String pwd)
	{			
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(uid);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();			
	}
	
	public boolean isAdminModuleDisplayed() {
	boolean	res=false;
	 String curl = driver.getCurrentUrl().toLowerCase();
	 if(curl.contains("dashboard")) {
		 res= true;
	 }
	 return res;
		//return curl.contains("dashoard".toLowerCase());
	}
	
	@AfterTest
	public void logout()
	{
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	
	
}



