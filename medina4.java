//906609
public class medina4 {
	public static void main(String[] args) {
        int largestPalindrome = 0;

        // Iterate through all products of two 3-digit numbers
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;
                
                // Check if the product is a palindrome and is greater than the current largest palindrome
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
//Outputs largest palindrome made from the product of two 3-digit numbers
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + largestPalindrome);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        // While loop to Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        // Checks if the original number is equal to its reverse
        return original == reverse;
    }
}
