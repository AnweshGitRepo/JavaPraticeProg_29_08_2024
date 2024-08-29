package javaProg;

import java.util.Arrays;

public class MergeTwoIntegerArraysIntoASingleArrayUsingArrayCopyMethod {
	public static void main(String[] args) {
		
		int [] firstArray= {23,45,12,78,4,9};
		int [] secondArray= {77,11,45,88,32};
		
		int flengh=firstArray.length;
		int slengh=secondArray.length;
		
		int[] addTwoArray=new int[flengh+slengh];
		
		System.arraycopy(firstArray, 0, addTwoArray, 0, flengh);
		
		System.arraycopy(secondArray, 0, addTwoArray, flengh, slengh);
		
		System.out.println(Arrays.toString(addTwoArray));
	}
}
