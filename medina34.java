//40730
public class medina34 {
	public static void main(String[] args) {
        // Precompute the factorials of digits 0 to 9 and store in an array
        int[] factorials = new int[10];
        factorials[0] = 1; // 0! is defined as 1
        for (int i = 1; i < 10; i++) {
            factorials[i] = factorial(i); // Calculate factorial of each digit 1 to 9
        }

        // Set an upper limit to search for "curious" numbers.
        // We use 2,540,160 because beyond this point, a number cannot be represented by the sum of its digit factorials
        int limit = 2540160;
        int sumOfCuriousNumbers = 0; // Initialize sum to store the result

        // Iterate over all numbers from 10 to the limit (we start from 10 because single-digit numbers aren't included)
        for (int i = 10; i <= limit; i++) {
            // Check if the number is equal to the sum of the factorials of its digits
            if (i == sumOfFactorialsOfDigits(i, factorials)) {
                sumOfCuriousNumbers += i; // Add "curious" number to the sum
            }
        }

        // Output the total sum of all "curious" numbers
        System.out.println("The sum of all curious numbers is: " + sumOfCuriousNumbers);
    }

    // Helper function to calculate the factorial of a single digit
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by each integer from 1 to n
        }
        return result; // Return the factorial of n
    }

    // Helper function to calculate the sum of the factorials of the digits of a given number
    public static int sumOfFactorialsOfDigits(int number, int[] factorials) {
        int sum = 0;
        // Loop through each digit in the number
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += factorials[digit]; // Add the factorial of this digit to the sum
            number /= 10; // Remove the last digit from the number
        }
        return sum; // Return the sum of the factorials of the digits
    }
}
