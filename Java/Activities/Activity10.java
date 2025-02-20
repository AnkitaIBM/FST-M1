package hello;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
	public static void main(String[] args) {
		Set<Integer> HS = new HashSet<>();
		HS.add(123);
		HS.add(789);
		HS.add(456);
		HS.add(91011);
		HS.add(012);
		HS.add(045);
		
		System.out.println("Original set: "+HS);
		
		System.out.println("Size of the set: "+HS.size());
		
		boolean removenumber = HS.remove(456);
		System.out.println("removed number 456: "+removenumber);
		
		boolean containsnumber = HS.contains(456);
		System.out.println("contains number 456: "+containsnumber);
		
		System.out.println("Final set: "+HS);
		
		
	}
	

}