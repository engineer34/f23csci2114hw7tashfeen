//104743
public class medina7 {
	 public static void main(String[] args) {
	        int target = 10001;  // The target prime position
	        int count = 0;       // Counter for the number of primes found
	        int number = 1;      // Number to test for primality, starting at 1

	        while (count < target) {
	            number++;            // Move to the next number
	            if (isPrime(number)) {
	                count++;         // Increment the count if the number is prime
	            }
	        }

	        System.out.println("The 10,001st prime number is: " + number);
	    }

	    /**
	     * Method to check if a number is prime.
	     *
	     * @param n - the number to check
	     * @return true if n is prime, false otherwise
	     */
	    public static boolean isPrime(int n) {
	        if (n <= 1) return false;       // 1 and below are not prime
	        if (n <= 3) return true;        // 2 and 3 are prime numbers
	        if (n % 2 == 0 || n % 3 == 0) return false; // Exclude multiples of 2 and 3

	        // Check divisors from 5 up to the square root of n
	        for (int i = 5; i * i <= n; i += 6) {
	            if (n % i == 0 || n % (i + 2) == 0) return false;
	        }
	        return true;
	    }
}
