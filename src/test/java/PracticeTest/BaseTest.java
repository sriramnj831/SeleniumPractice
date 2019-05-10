package PracticeTest;

import PracticePage.Base;

public class BaseTest extends Base{
	
	public static void main(String args[]){
		reverseString();
		reverseInteger();
	}
	
	public static void reverseString(){
		
		String str = "Madam";
		for(int i=str.length()-1; i>=0; i--){
			str.charAt(i);
		}
		System.out.println("Reverse String is: "+str);
	}
	
	public static void reverseInteger(){
		
		long num = 543210;
		long temp = 0;
		
		while(num !=0){
			
			temp = temp*10 + num%10;
			num = num/10;
			
		}
		System.out.println("Reverse Integer is: "+temp);
		
	}
	
}
