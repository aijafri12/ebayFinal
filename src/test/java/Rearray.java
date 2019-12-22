
public class Rearray {
	
	// public (access modifier) static( so we can call the method directly by calling class name. without creating object of the class) 
	//void ( so we dont have to give return type)
	
	public static void fizzBuzz(int x, int y) {
		
		for( int i=1; i <=100; i++) {
			
			if ( i%x==0 && i%y==0)
				
				System.out.println("FizzBuzz");
				
			else if ( i%x==0)
			System.out.println("Fizz");
			
			if ( i%y==0)
			
			System.out.println("Buzz");
			 
			else
		System.out.println(i);
			
		}
			
	}public static void main(String[] args) {
		
		
		Rearray.fizzBuzz(5, 7);
		
		
		
		
	}

}
