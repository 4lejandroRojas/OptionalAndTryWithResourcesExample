package com.alejandrorojas.exercises.tests;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.alejandrorojas.exercises.classes.ContactInfo;
import com.alejandrorojas.exercises.classes.ContactType;
import com.alejandrorojas.exercises.classes.Genre;
import com.alejandrorojas.exercises.classes.Person;
import com.alejandrorojas.exercises.classes.Pet;

public class OptionalTest {

	/**
	 * @param args
	 */
	public static void main(String []args) {
		//Alex initialization		
		Person alex = new Person();
		alex.setId("1AX");
		alex.setName("Alex");
		alex.setGenre(Genre.MALE);
		alex.setLastName("Rojas");
		
		Pet bethoven = new Pet();
		bethoven.setName("Bethoven");
		alex.setPet(Optional.of(bethoven));
		alex.setContactsInfo(List.of(new ContactInfo(ContactType.EMAIL, "4lejandr0rojas@protonmail.com")));
		
		//Iveth initialization
		Person iveth = new Person();
		iveth.setId("2TH");
		iveth.setName("Iveth");
		iveth.setGenre(Genre.FEMALE);
		iveth.setLastName(null);
		
		Pet max = new Pet();
		max.setName("Max");
		max.setGenre(null);
		max.setWeight(null);
		iveth.setPet(Optional.of(max));
		iveth.setContactsInfo(
				Arrays.asList(new ContactInfo(ContactType.TELEPHONE, "515236547"),
								new ContactInfo(ContactType.EMAIL, "industriasMax@gmail.com")));
		
		//Axa initialization
		Person axa = new Person();
		axa.setId("3XA");
		axa.setName("Axa");
		axa.setPet(null);
		axa.setContactsInfo(List.of(new ContactInfo(ContactType.LETTER, "Domicilio conocido"),
									new ContactInfo(ContactType.EMAIL, "norepley@google.com"),
									new ContactInfo(ContactType.TELEPHONE, "7845195312")));
		
		
		//First of all... NullPointerException is very common because  null is use to demonstrate absence of a value
		
		//Before JAVA 8 - I want to know Axa's pet genre -- Actually, Axa doesn't have a pet
		//Just for test
		Person personTest = alex;
		
		
		
	}
}
