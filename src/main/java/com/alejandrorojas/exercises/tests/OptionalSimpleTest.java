package com.alejandrorojas.exercises.tests;

import java.util.Optional;

public class OptionalSimpleTest {

	public static void main (String args[]) {
		String text = null;
		
		//In case 'of' null then NullPointerException. But what is the point of use Optional?
		//It is just a programming style and Business case. Example: When you return an object.
		//On the other hand, you receive this information that can be null
//		Optional<String> opString1 = Optional.of(text);
		Optional<String> opString = Optional.ofNullable(text);
		
		//They're opposite
		System.out.printf("isPresent: %s\n", opString.isPresent());
		System.out.printf("isEmpty: %s\n", opString.isEmpty());
		
		//
		opString.ifPresent(p-> System.out.println(p));
		opString.ifPresent(System.out::println);
		opString.map(String::toUpperCase).ifPresent(System.out::println);
	}
}
