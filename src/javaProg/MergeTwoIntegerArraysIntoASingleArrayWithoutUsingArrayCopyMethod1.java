package javaProg;

import java.util.Arrays;

public class MergeTwoIntegerArraysIntoASingleArrayWithoutUsingArrayCopyMethod1 {
   public static void main(String[] args) {
	
	int first[]= {2,4,56,7};
	int second[]= {1,3,76,8};
	
	int totalLength[]=new int[first.length+second.length];
	
	for(int i=0;i<first.length;i++) {
		
		totalLength[i]=first[i];
	}
	
	for(int j=0;j<second.length;j++) {
		
		totalLength[j+second.length]=second[j];
	 }
	System.out.println(Arrays.toString(totalLength));
   }
}
