
class PrimeNumber {

	public static void main(String[] args) { // a number is divisible by 1 only  and itself its a prime number

		int num = 8;

		boolean isprime = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				isprime = false;
				break;

			} // end if
		} // end for

		if (isprime == true)
			System.out.println(num +" is a prime number");

		else
			System.out.println(num +" not a prime number");

	}

}
