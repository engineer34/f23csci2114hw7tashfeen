//6857
public class medina3 {
	public static void main(String[] args) {
        long number = 600851475143L; //our long number
        long largestFactor = 1;// largest factor

        // Remove all factors of 2
        while (number % 2 == 0) {
            largestFactor = 2; //Largest factor is 2
            number /= 2; //checking if the number is divisible by 2
        }

        // Check odd factors from 3 upwards
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        // If number is now a prime greater than 2, it is the largest prime factor
        if (number > 2) {
            largestFactor = number;
        }
        //prints out the largest prime factor
        System.out.println("The largest prime factor of 600851475143 is: " + largestFactor);
    }
}
