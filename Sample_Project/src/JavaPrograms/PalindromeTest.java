package JavaPrograms;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int temp=num;
		int rem=0,rev=0;
		while(num>0)
		{
			rem=num%10;
			rev = rev*10+rem;
			num = num/10;
		}
     if(rev==temp)
     {
    	System.out.println(temp + " is Palindrome"); 
     }
     else
     {
    	 System.out.println(temp + " is not Palindrome"); 
     }
	}
   
}
