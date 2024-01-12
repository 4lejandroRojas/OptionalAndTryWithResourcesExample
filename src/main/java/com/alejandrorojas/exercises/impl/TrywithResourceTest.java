package com.alejandrorojas.exercises.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResourceTest {

	public static void main(String[] args) {
		// It is useful with resources that implement java.lang.AutoCloseable and
		// java.io.Closeable
		final String path = "dogsNames.txt";
			
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(new FileReader(path))) {
			br.lines().forEach(System.out::println);

			//It is not necessary to close (Explicity)
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException: "+ e.getLocalizedMessage());
		} catch (IOException e) {
			System.err.println("IOException: "+ e);
		} catch (Exception e) {
			System.err.println("Exception: "+ e);
		}

	}

}
