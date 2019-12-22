package com.common;

import java.util.Arrays;

public class Rearray1 {

	public static void main(String[] args) {
		
		
		
		

		
		
		
		int x[]= {23,12,45,67};
		int temp;
		
		for( int i=0; i<x.length/2;i++ ) {
			temp=x[i];
			
			x[i]=x[x.length-i-1];
		x[x.length-i-1]=temp;

		}
		
		System.out.println(Arrays.toString(x));
		
	}

}
