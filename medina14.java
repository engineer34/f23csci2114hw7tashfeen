//837799
//525
public class medina14 {
	public static void main(String[] args) {
        // Variables to keep track of the longest chain and the number that produces it
        int longestChainLength = 0;
        int numberWithLongestChain = 0;

        // Iterate over all numbers from 1 to 999,999
        for (int i = 1; i < 1_000_000; i++) {
            int chainLength = collatzChainLength(i);  // Find chain length for the current number

            // Check if this chain length is the longest found so far
            if (chainLength > longestChainLength) {
                longestChainLength = chainLength;
                numberWithLongestChain = i;
            }
        }

        // Output the result
        System.out.println("The number under one million with the longest Collatz chain is: " + numberWithLongestChain);
        System.out.println("The length of the chain is: " + longestChainLength);
    }

    // Method to calculate the Collatz chain length for a given starting number
    private static int collatzChainLength(long n) {
        int length = 1; // Start with length 1 because the initial number is part of the chain

        // Repeat the Collatz process until n becomes 1
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;  // If n is even, divide it by 2
            } else {
                n = 3 * n + 1;  // If n is odd, apply the 3n + 1 formula
            }
            length++;  // Increase the length of the chain after each step
        }

        return length;  // Return the total chain length for the starting number
    }
}
