
public class medina31 {
	 public static void main(String[] args) {
	        int target = 200; // The target amount in pence (200p = £2)
	        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200}; // The values of the coins in pence

	        // Array to store the number of ways to make each amount up to the target
	        int[] ways = new int[target + 1];
	        ways[0] = 1; // There is one way to make 0p (using no coins)

	        // Loop through each coin and update the ways array
	        for (int coin : coins) {
	            for (int amount = coin; amount <= target; amount++) {
	                // Add the ways to make "amount - coin" to the ways to make "amount"
	                ways[amount] += ways[amount - coin];
	            }
	        }

	        // The result is the number of ways to make the target amount (200p)
	        System.out.println("Number of ways to make £2: " + ways[target]);
	 }
}
