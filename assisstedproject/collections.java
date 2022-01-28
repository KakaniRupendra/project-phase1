package collections;
import java.util.*;
public class collections {
	public static void main(String[]args) {
		System.out.println("ArrayList");
		ArrayList<String>city=new ArrayList<String>();
		city.add("Bangalore");
		city.add("Delhi");
		System.out.println(city);
		System.out.println("\n");
		System.out.println("vector");
		Vector<Integer>vec=new Vector();
		vec.addElement(15);
		vec.addElement(30);
		System.out.println(vec);
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String>lin=new LinkedList<String>();
		lin.add("Alex");
		lin.add("Siri");
		Iterator<String>itr=lin.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		System.out.println("\n");
		System.out.println("Hashset");
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(101);
		h.add(103);
		h.add(102);
		h.add(104);
		System.out.println("elements in hashset are : "+h);
		System.out.println("\n");
		System.out.println("LINKEDHASHSET");
	     LinkedHashSet<Integer> m=new LinkedHashSet<Integer>();
	     m.add(11);
	     m.add(13);
	     m.add(12);
	     m.add(14);
	     System.out.println("linkedhashset elements are : "+m);
			
		}
	}

}
