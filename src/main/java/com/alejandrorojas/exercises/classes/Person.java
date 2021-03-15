package com.alejandrorojas.exercises.classes;

import java.util.List;
import java.util.Optional;

public class Person {
	private String id;
	private String name;
	private String lastName;
	private Optional<Pet> pet;
	private Genre genre;
	private List<ContactInfo> contactsInfo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Optional<Pet> getPet() {
		return pet;
	}
	public void setPet(Optional<Pet> pet) {
		this.pet = pet;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public List<ContactInfo> getContactsInfo() {
		return contactsInfo;
	}
	public void setContactsInfo(List<ContactInfo> contactsInfo) {
		this.contactsInfo = contactsInfo;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + ", pet=" + pet + ", genre=" + genre
				+ ", contactsInfo=" + contactsInfo + "]";
	}
	
}
