package Arrays;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {
//integers
		ArrayList<Integer> al=new ArrayList<Integer>();
//insert
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("\nArray List: \n"+al);
//getting values
		System.out.println("\n1st index value: \n"+al.get(1));
		
//update
		al.set(1, 10);
		System.out.println("\nArray List after update: \n"+al);
//delete one element
		al.remove(3);
		System.out.println("\nArray List after deleting one element: \n"+al);
//delete all
		//al.clear();
		System.out.println("\nArray List after deleting all: \n"+al);	
//size, contains, indexOf, lastIndexOf, isEmpty		
		System.out.println("\nSize: "+al.size());
		System.out.println("\n10's index: "+al.indexOf(10));
		System.out.println("\n2nd 10's index: "+al.lastIndexOf(10));
		System.out.println("\n40 contains in list? "+al.contains(40));
		System.out.println("\nIs list empty? "+al.isEmpty());

	}

}
