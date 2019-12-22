import java.util.Arrays;

public class StringFinder {

	public static void main(String[] args) {
		
		
	
		String [] x= { "Nasir", "ronn" ,"SAAD" , "Tapadar"};
		
		
		
		for ( int i=0; i<x.length;i++) {
			
			if(x[i]=="SAAD") {
				
				x[i]="SAADI";
				
				break;
			}
			else 
				System.out.println(" it is not a match");
			
		}
		System.out.println(Arrays.toString(x));

	
	
	}

}
