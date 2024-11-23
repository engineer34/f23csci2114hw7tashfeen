//232792560
public class medina5 {
	 public static void main(String[] args) {
	        // Define the limit up to which we want to find the LCM (i.e., numbers 1 to 20)
	        int limit = 20;

	        // Variable to hold the result of the LCM calculation, initialized to 1
	        long lcm = 1;

	        // Loop through each number from 1 up to the limit
	        for (int i = 1; i <= limit; i++) {
	            // Update the LCM by calculating the LCM of the current result and the next number
	            lcm = lcm(lcm, i);
	        }

	        // Output the final result, which is the LCM of all numbers from 1 to the limit
	        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to " + limit + " is: " + lcm);
	    }

	    /**
	     * Method to calculate the LCM (Least Common Multiple) of two numbers.
	     * Uses the formula LCM(a, b) = (a * b) / GCD(a, b).
	     *
	     * @param a - the first number
	     * @param b - the second number
	     * @return the LCM of a and b
	     */
	    public static long lcm(long a, long b) {
	        // Calculate the LCM by dividing the product of a and b by their GCD
	        return a * (b / gcd(a, b));
	    }

	    /**
	     * Method to calculate the GCD (Greatest Common Divisor) of two numbers
	     * using Euclid's algorithm, which is efficient for large numbers.
	     *
	     * @param a - the first number
	     * @param b - the second number
	     * @return the GCD of a and b
	     */
	    public static long gcd(long a, long b) {
	        // Continue looping until b becomes 0
	        while (b != 0) {
	            // Temporary variable to hold the current value of b
	            long temp = b;

	            // Update b to the remainder of a divided by b
	            b = a % b;

	            // Set a to the old value of b (stored in temp)
	            a = temp;
	        }
	        // When b reaches 0, a contains the GCD
	        return a;
	    }
	    // I used al to create comments and notes for me because I couldn't understand the code really well and struggled the most on this one.
}

