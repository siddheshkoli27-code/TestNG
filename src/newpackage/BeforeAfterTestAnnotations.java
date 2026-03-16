package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotations {

		String baseURL="https://demo.guru99.com/test/newtours/";
		public WebDriver driver;
		
		@BeforeTest
		public void launchBrowser() {
			System.out.println("Launching Firefox Brownser");
			driver= new FirefoxDriver();
			driver.get(baseURL);
		}
		
		@Test
		public void verifyHomepageTitle() {
			String expected="Welcome: Mercury Tours";
			String actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
	}
		@AfterTest
		public void terminateBrowser() {
			driver.close();
		}

}
