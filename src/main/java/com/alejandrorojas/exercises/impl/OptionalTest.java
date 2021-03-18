package com.alejandrorojas.exercises.impl;

import java.util.Collections;
import java.util.Optional;

public class OptionalTest {

	public static void main(String []args) {
		
//		Optional<String> opString = Optional.of("Hello World");
		Optional<String> opString = Optional.ofNullable(null);
		
//		String stringValue = Optional.ofNullable(null).orElse("default"); //--> Error at try to pass null directly.
		
		
		System.out.println(opString.isPresent());
		System.out.println(opString.isEmpty());
		System.out.println(opString.isEmpty());
		opString.ifPresent(System.out::println); //Why a Consumer Functional interface with void accept?
		
		
		
		//The difference between orElse and orElseGet is:
		//orElse --> Directly value --> Allows null 
		//orElseGet --> Supplier, Lambda --> Doesn't allow null, NullPointerException
		
		//With orElse, orElseGet, it is import not pass a null value directly. 
		String temporaryStringNull = null;
		String nameNull1 = Optional.ofNullable(temporaryStringNull).orElse("Direct value-No Lambda");
		System.out.println("nameNull1: "+nameNull1);
		
		String nameNull2 = Optional.ofNullable(temporaryStringNull).orElseGet(()-> "Default value-Lambda");
		System.out.println("nameNull2: "+nameNull2);
		
		// -----------------------------------------
		
		String temporaryString = "Alex";
		String name1 = Optional.ofNullable(temporaryString).orElse("Direct value-No lambda");
		System.out.println("name1: "+name1);
		
		String name2 = Optional.ofNullable(temporaryString).orElseGet(null); // Except in this case, never be called.
		System.out.println("name2: "+name2);		
	}

}
