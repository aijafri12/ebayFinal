package com.common;

public class Fibonacchi {

	public static void main(String[] args) { //long is a data type to find out fibonacchi number 
		
	long n1=0;
	long n2=1;
	
	
	
		System.out.print(n1+ " " +n2);
		
		
		for( int i=2; i<=50; i++) {
			
			long  n3= n1+n2;
			
			n1=n2;
			n2=n3;
			
			System.out.print(" "+ n3);
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
