// The values of a, b, c are: 200, 375, 425
//The product abc is: 31875000
public class medina9 {
	public static void main(String[] args) {
        int targetSum = 1000; // The sum a + b + c should be equal to 1000
        int product = -1; // Variable to store the product abc

        // Iterate through possible values of a and b
        for (int a = 1; a < targetSum / 3; a++) {
            for (int b = a + 1; b < targetSum / 2; b++) {
                int c = targetSum - a - b; // Calculate c based on the condition a + b + c = 1000
                
                // Check if a, b, and c form a Pythagorean triplet
                if (a * a + b * b == c * c) {
                    product = a * b * c; // Calculate the product abc
                    System.out.println("The values of a, b, c are: " + a + ", " + b + ", " + c);
                    System.out.println("The product abc is: " + product);
                    return; // Exit after finding the first solution
                }
            }
        }

        // If no triplet is found, output an error (shouldn't happen in this case)
        if (product == -1) {
            System.out.println("No Pythagorean triplet found.");
        }
    }
}
