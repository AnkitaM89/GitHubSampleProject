package qedge.july12;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count;
		System.out.print("Enter n value : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Prime numbers between 1 to "+n+" are ");
		i=2;
		while(i<=n) 
		{
			count=0;
			j=1;
			while(j<=i)
			{
				if(i%j==0)
					count++;
				j++;
			}
			
			if(count==2)
				System.out.print(i+"  "); 
			i++;
		}
		sc.close();
	}

}


