package qedge.july12;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    System.out.println("Multiplication table of "+n+" given below:");
		for(int i= 1;i<=10;i++) 
		{
			System.out.println(n+" * "+i+" = "+i*n);
		}
		sc.close();

	}

}
