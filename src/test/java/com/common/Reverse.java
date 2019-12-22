package com.common;
  
public class Reverse {

	public static void main(String[] args) {
		
		
		int x[]= {23,13,56,78,9,23,1234};
		
		int small= x[0];
	
		int secsmall= x[0];
		
		
	for ( int i =0; i<x.length;i++) {
		
		if ( small> x[i]){
			secsmall=small;
			small=x[i];
			
			
			
			
		}else if( secsmall>x[i]) {
			
			secsmall=x[i];
			
		}
		
		
	}System.out.println(small);
	System.out.println(secsmall);
	}


}

