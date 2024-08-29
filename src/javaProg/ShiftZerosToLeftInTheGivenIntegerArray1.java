package javaProg;

public class ShiftZerosToLeftInTheGivenIntegerArray1 {

	
	public static void main(String[] args) {
		
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, 0, 0, 6, 55, 20, 0};  
		
	
		
		for(int a=0;a<arr.length;a++) {
			
			for(int b=a+1;b<arr.length;b++) {
				int temp=0;
				if(arr[a]>arr[b]) {
					temp=arr[a];
					arr[a]=arr[b];
					arr[b]=temp;
				}
			}
			
			
			System.out.println(arr[a]);  
		}
		
		
		
	}
	
	
}
