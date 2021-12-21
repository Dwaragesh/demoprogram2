package com.java;

import java.util.Scanner;

public class greatestofnumbers {

	public static void main(String[] args) 
	{
		int first;
		int second;
		int third;
		
		
		System.out.println("\n Enter three integers: \n");
		
		Scanner sc = new Scanner(System.in);
		
		first = sc.nextInt();
		second = sc.nextInt();
		third = sc.nextInt();
		
		if(first>second)
		{
			if(first>third)
				System.out.println("Greatest numer is:"+first);
			else
				System.out.println("Greatest numer is:"+third);
		}
		else
		{
			if(second>third)
				System.out.println("Greatest numer is:"+second);
			else
				System.out.println("Greatest numer is:"+third);
		}
	}

}
