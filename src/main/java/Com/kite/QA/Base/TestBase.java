package Com.kite.QA.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.kite.QA.Util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	
	public static Properties proper;
	
	public TestBase() throws IOException {
		proper = new Properties();
		
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Maven\\src\\main\\java\\"
				+ "Com\\kite\\QA\\Config\\Config.Properties");
		
		proper.load(File);}
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Software\\Google Crome\\chromedriver_win32\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITE_WAIT, TimeUnit.SECONDS);
		
		driver.get(proper.getProperty("URL"));
	}
	
	
	
	
	
}
