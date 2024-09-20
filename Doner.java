package com.quastion.second;

import java.util.Scanner;

public class Doner 
{

	public static void main(String[] args) throws InvalidDonerException
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        
        System.out.println("Enter Your Weight:");
        int weight=sc.nextInt();
        
        try
        {
          if(age>=21 && age<=60 && weight>=40 && weight<=70)
         {
          System.out.println("Congrats!");	
         }
          else
          {
        	throw  new InvalidDonerException("You Are Not Eligible");	 
          }
        }
        catch(InvalidDonerException d)
        {                                                                                 
          System.out.println(d.getMessage());
        }
        
	}

}
