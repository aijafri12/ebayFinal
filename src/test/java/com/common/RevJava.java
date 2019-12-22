package com.common;

public class RevJava {

	public static void main(String[] args) {
		
		String St="my name is aj";
		String[] r= St.split("\\s");
		
		
		
		String re="";
		for(String d:r) {
		StringBuilder sb= new StringBuilder(d);
		re=re+sb.reverse().toString()+" ";
		
		
		
			
			
		}
		
		System.out.println(re);
		
		
	}

}
