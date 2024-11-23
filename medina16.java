//1366
import java.math.BigInteger;
public class medina16 {
	public static void main(String[] args) {
        // Calculate 2^1000 using BigInteger to handle the large number
        BigInteger number = BigInteger.valueOf(2).pow(1000);

        // Convert the result to a string to access each digit
        String numberStr = number.toString();

        // Variable to store the sum of the digits
        int sumOfDigits = 0;

        // Loop through each character in the string representation of the number
        for (int i = 0; i < numberStr.length(); i++) {
            // Convert each character to its integer value and add to the sum
            sumOfDigits += Character.getNumericValue(numberStr.charAt(i));
        }

        // Print the result
        System.out.println("The sum of the digits of 2^1000 is: " + sumOfDigits);
    }
}
