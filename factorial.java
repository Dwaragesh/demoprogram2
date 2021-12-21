package com.java;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) 
	{
		
		int fact,counter,counter1;
		System.out.println("\n Enter factorial value: \n");
		 Scanner sc = new Scanner(System.in);
		 counter = sc.nextInt();
		 fact=1;
		 counter1 = counter;
		 while(counter>=1)
		 {
			 fact = fact*counter;
			 counter--;
		 }
		  
		  System.out.println()
				 
		

	}

}
