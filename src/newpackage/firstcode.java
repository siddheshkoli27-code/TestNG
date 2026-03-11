package newpackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstcode {

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	
	@Test
	public void verifyHomepageTitle() {
	System.out.println("launching Chrome browser");
	
	WebDriver driver =  new ChromeDriver();
	driver.get(baseUrl);
	String expectedTitle = "12345";
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
//	if(expectedTitle==actualTitle) {
//		System.out.println("Test is passed");
//	} else {
//		System.out.println("Failed");
//	}
	Assert.assertEquals(actualTitle, expectedTitle);
	driver.close();
	}
	}