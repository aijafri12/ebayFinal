package com.common;

import java.io.StringBufferInputStream;

public class ReverseString {

	public static void main(String[] args) {
		
		
	int x[]= {34,78,219,23,56}; 
	int min=x[0];
	int secmin =x[0];
		
	
	
	for( int i=0; i<x.length; i++) {
		if (x[i]<min) {
			min =secmin;
			min=x[i];
			
			
			
			
			
			
			
			
		}else if( x[i]<secmin) {
			
			x[i]=secmin;
			
			
		}
	
		
		
		
		
	}

	System.out.println(min);
	
	System.out.println(secmin);
	
	}
	

}