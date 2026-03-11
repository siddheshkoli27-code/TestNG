package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_withoutPriority_Alphabet {

	WebDriver driver;
	// Method 1: Open Brower say Firefox
	@Test
	public void openBrowser() {
	driver = new FirefoxDriver();
	}
	// Method 2: Launch Google.com
	@Test
	public void launchGoogle() {
	driver.get("http://www.google.co.in");
	}
	// Method 3: Perform a search using "Facebook"
	@Test
	public void peformSeachAndClick1stLink() {
	driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
	}
	// Method 4: Verify Google search page title.
	@Test
	public void FaceBookPageTitleVerification() throws Exception {
	driver.findElement(By.xpath(".//*[@value='Search']")).click();

	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"),
	true);
	}
	}

