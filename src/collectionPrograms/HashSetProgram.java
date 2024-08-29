package collectionPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
	public static void main(String[] args) {  
        HashSet<String> set=new HashSet<String>();    
        set.add("Ravi");    
        set.add("Vijay");    
        set.add("Mohan");    
        set.add("Ajay");    
        //Traversing elements    
        Iterator<String> itr=set.iterator();    
        while(itr.hasNext()){    
           System.out.println(itr.next());    
        }    
    } 
}
