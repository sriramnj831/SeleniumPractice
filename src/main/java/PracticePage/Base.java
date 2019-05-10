package PracticePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sriram N J\\Downloads\\chromedriver_win32.exe");
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void setup(){
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void teardown(){
		
		driver.quit();
		
		
	}
}
