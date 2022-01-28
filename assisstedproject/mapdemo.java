package map;
import java.util.*;
public class mapdemo {
	public static void main(String[]args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"Tim");
		h.put(2,"Mary");
		h.put(3,"Catle");
		h.put(4,"srinu");
		System.out.println("\n the elements in hashmap are:");
		for(Map.Entry m:h.entrySet()){
			System.out.println(m.getKey()+"  "+m.getValue());
		}
        
        System.out.println("\n HashTable");
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(4, "Ales");
        ht.put(5, "Rosy");
        ht.put(6, "Jack");
        ht.put(7,"John");
        System.out.println("\n hash table elements are:");
        for(Map.Entry e:ht.entrySet()) {
        	System.out.println(e.getKey()+"  "+e.getValue());
        }
        
        System.out.println("tree map");
        TreeMap<Integer,String> t=new TreeMap<Integer,String>();
    
        t.put(8,"Annie");
        t.put(9,"Carlotte");
        t.put(10,"Catie");
        System.out.println("\n elements in treemap are:");
        for(Map.Entry k:t.entrySet()) {
        	System.out.println(k.getKey()+"  "+k.getValue());
        }
        
	}

}

