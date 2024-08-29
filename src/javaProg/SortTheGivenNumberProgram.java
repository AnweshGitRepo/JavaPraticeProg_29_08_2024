package javaProg;

public class SortTheGivenNumberProgram {
	    public static void main(String[] args) {
	        // Initialize the array
	        int[] array = {0, 0, 1, 1, 0, 0, 1, 1};

	        // Print the original array
	        System.out.println("Original Array: ");
	        printArray(array);

	        // Sort the array
	        bubbleSort(array);

	        // Print the sorted array
	        System.out.println("Sorted Array: ");
	        printArray(array);
	    }

	    /**
	     * Prints the elements of an array.
	     *
	     * @param array The array to be printed.
	     */
	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }

	    /**
	     * Sorts an array using the Bubble Sort algorithm.
	     *
	     * @param array The array to be sorted.
	     */
	    public static void bubbleSort(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap array[j] and array[j + 1]
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	}


