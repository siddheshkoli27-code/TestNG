package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotations {
	
	public String baseURL="https://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	public String expected=null;
	public String actual=null;
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.out.println("Before launching Firefox");
		driver=new FirefoxDriver();
		driver.get(baseURL);
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void verifyHomePageTitle() throws InterruptedException {
		String expectedTitle= "Welcome: Mercury Tours";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}
	
	@Test(priority=0)
	public void register() throws InterruptedException {
		driver.findElement(By.linkText("REGISTER")).click();
		expected="Register: Mercury Tours";
		actual=driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test(priority=1)
	public void support() throws InterruptedException {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected="Under Construction: Mercury Tours";
		actual=driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(expected, actual);
	}
	
	@AfterMethod
	public void goBacktoHomepage() {
		driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}