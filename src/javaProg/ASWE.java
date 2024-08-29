package javaProg;

public class ASWE {

	    /**
	     * Method to calculate the factorial of a positive integer.
	     * @param n the input number
	     * @return the factorial of n
	     */
	    public static long factorial(int n) {
	        if (n < 0) {
	            throw new ArithmeticException("Factorial is not defined for negative numbers.");
	        } else if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }

	    /**
	     * Method to calculate the factorial of a negative integer.
	     * @param n the input number
	     * @return a message indicating that factorial is not defined for negative numbers
	     */
	    public static String factorialNegative(int n) {
	        return "Factorial is not defined for negative numbers.";
	    }

	    public static void main(String[] args) {
	        int num = 5; // Example positive number
	        int numNegative = -3; // Example negative number

	        try {
	            System.out.println("Factorial of " + num + " is: " + factorial(num));
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("Factorial of " + numNegative + " is: " + factorialNegative(numNegative));
	    }
	}

	

