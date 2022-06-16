package selenium;

import java.util.*;

public class s1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		//adding elements to array list
		a1.add(2);
		a1.add(5);
		a1.add(1);
		a1.add(9);
		a1.add(3);
		a1.add(4);
		a1.add(0);
		a1.add(8);
		System.out.println("Array list elements");
		
			System.out.print(a1);		
			
		a1.remove(3);
		System.out.println("\nArray list elements after remove");
			System.out.print(a1);		
		
		System.out.println("\n-----------------------------");
		//HashSet
		HashSet<String> Hashs=new HashSet<String>();
		Hashs.add("Raja");
		Hashs.add("Yoga");
		Hashs.add("Balu");
		Hashs.add("Ganesh");
		Hashs.add("Yuva");
		System.out.println("Array list strings");
		
			System.out.print(Hashs);		
		
		Hashs.remove("Ganesh");
		System.out.println("\nArray list strings after remove");
		System.out.println(Hashs);
		
		
	}

}
