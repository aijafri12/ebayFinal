package com.common;

import java.util.HashSet;
import java.util.Iterator;

public class NewJava {

	public static void main(String[] args) {
		
		
		
		

		
		HashSet<String> hs =new HashSet<String>();
		
	
		hs.add("sharif");
		hs.add("tapa");
		hs.add("sagar");
		hs.add("sharif");
		hs.add("nasir");
		hs.remove("nasir");
		//System.out.println(hs);
		Iterator<String> i= hs.iterator();
		
	
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		}
		
	}


