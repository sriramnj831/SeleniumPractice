package PracticeTest;

import java.util.ExcelReader;

import org.testng.annotations.DataProvider;

import PracticePage.Base;

public class BaseTest extends Base{
	
	public static void main(String args[]){
		reverseString();
		reverseInteger();
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
	
	@DataProvider
	public Object[][] getLoginData() throws Exception{
		Object[][] data = ExcelReader.getTestData("Login");
		return data;
	}
	
}
