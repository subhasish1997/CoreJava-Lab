package Lab2212;

import java.util.Scanner;
public class Palindrome
{
		
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number to cheack plaindrome or not : ");
        int number =sc.nextInt();
		int remainder=0;
		int reversedNumber =0; 
	    int temp =number;	
		
		while(number>0)
		{
			remainder =number%10;
			reversedNumber= (reversedNumber*10)+remainder;
			number= number/10;
		}
		
		if(temp==reversedNumber)
		{
			System.out.println("The number is a palindrome");
			
		}
		else
			System.out.println("The number is not a palindrome");
		
	}
	 
   }