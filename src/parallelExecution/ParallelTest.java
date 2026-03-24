package parallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	@Test
	public void FirefoxTest() throws InterruptedException {
		driver.set(new FirefoxDriver());
		driver.get().get("https://www.saucedemo.com/");
		driver.get().findElement(By.id("user-name")).sendKeys("shital");
		driver.get().findElement(By.id("password")).sendKeys("secret_sauce");
		driver.get().close();
		
	}
	
	@Test
	public void ChromeTest() throws InterruptedException {
		driver.set(new ChromeDriver());
		driver.get().get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		driver.get().findElement(By.id("userName")).sendKeys("Siddhesh");
		Thread.sleep(2000);
		driver.get().findElement(By.id("userEmail")).sendKeys("test12@gmail.com");
		driver.get().close();
		
	}

}
