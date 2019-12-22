package com.common;

import java.util.Arrays;

public class RandomPractice {

	public static void main(String[] args) {
		
		String []name = {" Saad", "aj", "Nasir", " tapadar"};
		
		for (int i=0 ;i<name.length;  i++) {
			
			if ( name[i]=="aj") {
				
				name[i]="Abdullah";
				
				break;
				
				
				
			}else 
				System.out.println( " it is not a match");
			
		}
	
			System.out.println(Arrays.toString(name));
		
		
		
	
	}
}
