package hello;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	public static void main(String[] args) {
	Map<Integer ,String> color = new HashMap<>();
		
	color.put(1 , "Red");
	color.put(2 , "Green");
	color.put(3 , "Blue");
	color.put(4 , "Black");
	color.put(5 , "White");

	System.out.println("Original Map: "+color);
	String removevalue = color.remove(1);
	System.out.println("Removed color "+removevalue);
	boolean containvalue = color.containsValue("Green");
	System.out.println("Contains Green color " +containvalue);
	System.out.println("Size of the map: " + color.size());
	}
}