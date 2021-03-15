package com.alejandrorojas.exercises.classes;

import java.util.Optional;

public class Pet {
	private String name;
	private Optional<Genre> genre;
	private Optional<Double> weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<Genre> getGenre() {
		return genre;
	}
	public void setGenre(Optional<Genre> genre) {
		this.genre = genre;
	}
	public Optional<Double> getWeight() {
		return weight;
	}
	public void setWeight(Optional<Double> weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Pet [name=" + name + ", genre=" + genre + ", weight=" + weight + "]";
	}
}


