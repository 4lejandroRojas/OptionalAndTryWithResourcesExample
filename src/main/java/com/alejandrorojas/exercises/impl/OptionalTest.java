package com.alejandrorojas.exercises.impl;

import java.util.Optional;

public class OptionalTest {

	public static void main(String []args) {
		Optional<String> opString = Optional.of("Hello World");
		Optional<String> op1String = Optional.ofNullable(null);
		
		System.out.println(opString.isPresent());
		System.out.println(opString.isEmpty());
		System.out.println(opString.isEmpty());
		
		
	}
}
