//4613732
public class medina2 {
	 public static void main(String[] args) {
	        int limit = 4000000;    //limit is 4 million
	        int sum = 0;    //declare sum = 0
	        
	        int e = 1;  // First Fibonacci term
	        int f = 2;  // Second Fibonacci term
	        
	        while (e <= limit) {
	            // Check if the term is even
	            if (e % 2 == 0) {
	                sum += e;
	            }
	            
	            // Generate the next Fibonacci term
	            int next = e + f;
	            e = f;
	            f = next;
	        }
	        //Outputs the sum of even valued terms all the way to its limit
	        System.out.println("The sum of even-valued terms in the Fibonacci sequence up to " + limit + " is: " + sum);
	    }
}
