package com.common;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		
		
		int x[]= {23,45,67,89,23,12};
		
		int temp ;
		
		for (int i=0; i<x.length/2; i++) {
			temp=x[i];
			x[i]=x[x.length-i-1];
			x[x.length-i-1]=temp;
		}
		
		
		
		
		
		System.out.println(Arrays.toString(x));
		
		
		
	}

}
