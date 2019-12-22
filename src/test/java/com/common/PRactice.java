package com.common;

import java.util.Arrays;
import java.util.Scanner;

public class PRactice {

	
	 static void Fizz( int a, int b) { 
	 
		
	
		
		for ( int i=1; i<= 100; i++) {
			
			
			if( i%a==0 && i%b==0) 
				System.out.println("FizzBuzz");
			
			
			else if(i%a==0)
			System.out.println("Fizz");
			
			
			if ( i%b==0)
				System.out.println("Buzz");
			
			else
				System.out.println(i);
		}
	       
	 }
		public static void main (String[] args) {
			
			PRactice.Fizz(5, 7);
	
	 
}
}
