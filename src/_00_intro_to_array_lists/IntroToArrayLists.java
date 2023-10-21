package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> strings = new ArrayList<>();
		//2. Add five Strings to your list
		strings.add( "one");
		strings.add(  "two");
		strings.add(  "three");
		strings.add( "four");
		strings.add( "five");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s:strings) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println(strings.get(1));
		System.out.println(strings.get(3));
		//6. Print all the Strings in reverse order.
		for(int i = 1; i<=strings.size(); i++) {
			System.out.println(strings.get(5-i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
			System.out.println(strings.get(0));
			System.out.println(strings.get(2));
			System.out.println(strings.get(4));
		
	}
}
