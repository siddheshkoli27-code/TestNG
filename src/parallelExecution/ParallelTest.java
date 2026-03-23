package parallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	public WebDriver driver;
	
	@Test
	public void FirefoxTest() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("shital");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.close();
		
	}
	
	@Test
	public void ChromeTest() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("Siddhesh");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("test12@gmail.com");
		driver.close();
		
	}

}
