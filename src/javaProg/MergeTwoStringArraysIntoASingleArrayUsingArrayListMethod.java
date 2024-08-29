package javaProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoStringArraysIntoASingleArrayUsingArrayListMethod{
public static void main(String[] args) {
	
//	String a[]= {"a","b","c","d"};
//	String b[]= {"e","f","g"};
	
	int a[]= {23,34,23};
	int b[]= {12,87};
	
	List list=new ArrayList(Arrays.asList(a));
	
	list.addAll(Arrays.asList(b));
	
	Object[]c=list.toArray();
	
	System.out.println(Arrays.toString(c));
	
	System.out.println(list);
  }
}
