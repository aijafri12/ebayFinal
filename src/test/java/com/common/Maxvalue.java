

package com.common;

import java.util.Arrays;

public class Maxvalue {

	
	      public static void main(String [] args) {
	    	 
	    	  String [] x= {"SAAD", "SAMAD", "Tapa", "AJ", " Ronn"};
	    	  
	    	 
	    	  for ( int i=0; i<x.length; i++) {
	    		  
	    		  if ( x[i]=="Tapa"  ) {
	    			  
	    			  
	    			  x[i]="Tapadar";
	    			  
	    			  break;
	    			  
	    	
	    			  
	    			  
	    		  }else 
	    			  System.out.println("it is not a match");
	    		  
	    		  
	    		  
	    	  }
	    	  System.out.println(Arrays.toString(x));
	    	
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	          
	          
	     }
}