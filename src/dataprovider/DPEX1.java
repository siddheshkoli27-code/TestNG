package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPEX1 {
	
	@Test(dataProvider="testdata")
	public void TestChrome(String uname,String password) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@DataProvider(name="testdata")
	public Object[][]TestDataFeed(){
		// Create object array with 3 rows and 2 column- first parameter is row and second is //column
		Object[][]twitterdata = new Object[3][2];
		
		//Enter data to row 0 and column 0
		twitterdata[0][0]="username@gmail.com";
		//Enter data to row 0 and column 1
		twitterdata[0][1]="password1";
		//Enter data to row 1 and column 0
		twitterdata[1][0]="username2@gmail.com";
		//Enter data to row 1 and column 1
		twitterdata[1][1]="password2";
		//Enter data to row 2 and column 0
		twitterdata[2][0]="username2@gmail.com";
		//Enter data to row 2 and column 1
		twitterdata[2][1]="password2";
		
		return twitterdata;
	}
	
	/*return new Object [][]
	 * {
	 * {"abc","abc"},
	 * {"xyz","xyz"}
	 * };
	 */
}

