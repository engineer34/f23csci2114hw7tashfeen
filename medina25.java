//4782
import java.math.BigInteger;
public class medina25 {
	public static void main(String[] args) {
        BigInteger limit = BigInteger.TEN.pow(999); // 10^999 has 1000 digits
        BigInteger a = BigInteger.ONE; // F1
        BigInteger b = BigInteger.ONE; // F2
        int index = 2; // Starting index for F2

        while (b.compareTo(limit) < 0) {
            BigInteger next = a.add(b); // Compute the next term in the sequence
            a = b; // Move to the next terms in the sequence
            b = next;
            index++;
        }

        System.out.println("The index of the first Fibonacci term with 1000 digits is: " + index);
    }
}
