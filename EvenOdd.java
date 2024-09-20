package com.quastion.third;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Integer No.");
	  int num=sc.nextInt();
	  int rem=0;
	  int num2=num;
	  int ev_sum=0;
	  int od_sum=0;
	  while(num!=0)
	  {
		rem=num%10;
		if(rem%2==0)
		{
		 ev_sum=ev_sum+rem; 
		}
		else
		{
		  od_sum=od_sum+rem;	
		}
		num=num/10;
	  }
	/*  while(num2!=0)
	  {
		  rem=num2%10;
			if(rem%2!=0)
			{
			 od_sum=od_sum+rem; 
			}  
			num2=num2/10;
	  } */
	  System.out.println("Sum Of Even Digits:"+ev_sum);
	  System.out.println("Sum Of Odd Digits:"+od_sum);
	}

}
