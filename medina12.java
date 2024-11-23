//76576500
public class medina12 {
	 public static void main(String[] args) {
	        int triangleIndex = 1; // Start with the first triangular number
	        int numberOfDivisors = 0; // Initialize the divisor count to 0

	        // Loop until we find a triangular number with more than 500 divisors
	        while (numberOfDivisors <= 500) {
	            // Calculate the nth triangular number
	            int triangleNumber = calculateTriangleNumber(triangleIndex);
	            
	            // Calculate the number of divisors for the triangular number
	            numberOfDivisors = countDivisors(triangleNumber);
	            
	            // Check if this triangular number has more than 500 divisors
	            if (numberOfDivisors > 500) {
	                System.out.println("The first triangular number with over 500 divisors is: " + triangleNumber);
	                break; // We found the answer, so exit the loop
	            }

	            // Move to the next triangular number
	            triangleIndex++;
	        }
	    }

	    // Method to calculate the nth triangular number
	    public static int calculateTriangleNumber(int n) {
	        return n * (n + 1) / 2; // Formula for the nth triangular number
	    }

	    // Method to count the number of divisors of a given number
	    public static int countDivisors(int number) {
	        int divisorCount = 0; // Initialize divisor count

	        // Loop through potential divisors from 1 up to the square root of the number
	        for (int i = 1; i * i <= number; i++) {
	            if (number % i == 0) { // Check if i is a divisor
	                divisorCount += 2; // Count both i and number / i as divisors

	                // If i and number / i are the same, we counted one extra, so subtract one
	                if (i * i == number) {
	                    divisorCount--;
	                }
	            }
	        }

	        return divisorCount; // Return the total divisor count
	    }
}
