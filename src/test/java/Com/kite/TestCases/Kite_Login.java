package Com.kite.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Kite_Login {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	
	@Test(dataProvider = "DataProvider")
	
	public void OrangeHRM(String Username , String Password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Google Crome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Kunal");
//		Element Xpath
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Welcome Fouziya')]")).isDisplayed());
		Thread.sleep(1000);
		driver.quit();}
	
	@DataProvider(name = "DataProvider")
	public Object[][] TestData() {
		Object Data[][] = new Object[4][2];
		
//		Correct Username and Correct Password
		Data[0][0] = "Admin";
		Data[0][1] = "admin123";
		
//		Correct Username and Wrong Password
		Data[1][0] = "Admin";
		Data[1][1] = "admin123456";
		
//		Wrong Username and Correct Password
		Data[2][0] = "Admin123456";
		Data[2][1] = "admin123";
		
//		Wrong Username and Wrong Password
		Data[3][0] = "Admin123456";
		Data[3][1] = "admin123456";
		
		return Data;
	}
}
