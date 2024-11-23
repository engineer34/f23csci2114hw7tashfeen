//25164150
public class medina6 {
	public static void main(String[] args) {
	int n = 100;

    // Calculate the sum of the squares of the first 100 natural numbers
    long sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;

    // Calculate the square of the sum of the first 100 natural numbers
    long sum = n * (n + 1) / 2;
    long squareOfSum = sum * sum;

    // Calculate the difference
    long difference = squareOfSum - sumOfSquares;

    System.out.println("The difference between the square of the sum and the sum of the squares for the first 100 natural numbers is: " + difference);
}
}
