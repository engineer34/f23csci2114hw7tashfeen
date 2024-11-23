//233168
public class medina1 {
	public static void main(String[] args) {
        int limit = 1000;
        int sum = sumOfMultiples(3, limit) + sumOfMultiples(5, limit) - sumOfMultiples(15, limit);
        
        System.out.println("The sum of all multiples of 3 or 5 below " + limit + " is: " + sum);
}
	 // Method to calculate the sum of multiples of a given number below a limit
    public static int sumOfMultiples(int n, int limit) {
        int k = (limit - 1) / n; // Number of multiples of n below the limit
        return n * k * (k + 1) / 2; // Sum of the arithmetic series
    }
}