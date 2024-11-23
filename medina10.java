//142913828922
public class medina10 {
	public static void main(String[] args) {
        // Define the upper limit as 2 million
        long limit = 2000000;
        
        // Call the method to calculate the sum of primes below the limit
        long sum = sumOfPrimes(limit);
        
        // Print the result
        System.out.println("The sum of all primes below " + limit + " is: " + sum);
    }

    /**
     * This method calculates the sum of all prime numbers below a given limit
     * using the Sieve of Eratosthenes algorithm.
     *
     * @param limit The upper limit (exclusive) up to which primes are summed
     * @return The sum of all prime numbers below the limit
     */
    public static long sumOfPrimes(long limit) {
        // Step 1: Create a boolean array to mark numbers as prime or non-prime
        // Initially, assume all numbers >= 2 are prime.
        boolean[] isPrime = new boolean[(int) limit];
        
        // Set each index to true, indicating every number is a prime candidate
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        // Step 2: Use the Sieve of Eratosthenes algorithm to mark non-prime numbers
        // Loop through each number starting from 2 (the first prime)
        for (int i = 2; i * i < limit; i++) {
            // If the number is marked as prime
            if (isPrime[i]) {
                // Mark all multiples of i (starting from i*i) as non-prime
                for (int j = i * i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Sum all numbers that are still marked as prime
        long sum = 0;
        for (int i = 2; i < limit; i++) {
            // If the number is still marked as prime, add it to the sum
            if (isPrime[i]) {
                sum += i;
            }
        }

        // Return the total sum of all primes below the given limit
        return sum;
    }
}
