package hello;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Renuka");
		myList.add("Kishore");
		myList.add("Nishi");
		myList.add("Sagar");
		myList.add("RK");
		
		for(String name:myList) {
			System.out.println("name in the array are: "+name);
		}
		
		myList.get(2);
		System.out.println("3rd name in the list: "+myList.get(2));
		
		boolean containsname = myList.contains("Renuka");
		System.out.println("The name Renuka is present in the list: "+containsname);
		
		System.out.println("Number of names in the arraylist: "+myList.size());
		
		myList.remove(4);
		System.out.println("New number of names in the arraylist: "+myList.size());
		System.out.println("the final list of names present in the array: "+myList);
	}
}