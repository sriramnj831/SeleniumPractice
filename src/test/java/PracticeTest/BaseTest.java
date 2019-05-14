package PracticeTest;

import java.util.ExcelReader;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import PracticePage.Base;

public class BaseTest extends Base{
	
	@FindBy(xpath="//div")
	static WebElement all;
	
	
	public static void main(String args[]){
		reverseString();
		reverseInteger();
		diagonalDifference();
//		login();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sriram N J\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		for(WebElement ele : elements){
			System.out.println("All: "+ele.getTagName() +" : "+ele.getText());
		}
	}
	
	
	public static void reverseString(){
		
		String str = "Madam";
		System.out.println("Before String is: "+str);
		for(int i=str.length()-1; i>=0; i--){
			str.charAt(i);
		}
		System.out.println("Reverse String is: "+str);
	}
	
	public static void reverseInteger(){
		
		long num = 543210;
		System.out.println("Number before reversal : "+num );
		long temp = 0;
		
		while(num !=0){
			
			temp = temp*10 + num%10;
			num = num/10;
			
		}
		System.out.println("Reverse Integer is: "+temp);
		
		
	}
	
	public static void login(){
		
		System.out.println("All : "+all);
		
		
	}
	
	public static void diagonalDifference(){
		int arr[][] = {
				{ -6,2,3},
		{4,7,9},
		{-15,8,-2}
		};
		int d1 = 0;
		int d2 = 0;
		int num = 3;
		for(int i=0; i<num; i++){
			d1 += arr[i][i];
			d2 += arr[i][num-i-1];
		}
		
		
		if(d1>d2){
			System.out.println("L2R:"+d1);
		}else{
			System.out.println("R2L:"+d2);
		}
	
		System.out.println(Math.abs(d1-d2));
	}
	
	@DataProvider
	public Object[][] getLoginData() throws Exception{
		Object[][] data = ExcelReader.getTestData("Login");
		return data;
	}
	
}
