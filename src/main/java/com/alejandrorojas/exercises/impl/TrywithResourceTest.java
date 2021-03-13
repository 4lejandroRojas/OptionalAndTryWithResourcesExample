package com.alejandrorojas.exercises.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class TrywithResourceTest {
	static Logger logger = Logger.getLogger(TrywithResourceTest.class.getName());
//	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TrywithResourceTest.class);
	
	public static void main(String[] args) {
		logger.info("Start main");
		// It is useful with resources that implement java.lang.AutoCloseable and
		// java.io.Closeable
		final String path = "dogsNames.txt";
			
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(new FileReader(path))) {
			br.lines().forEach(logger::info);

			//It is not necessary to close (Explicity)
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			logger.severe("FileNotFoundException: "+ e.getLocalizedMessage());
		} catch (IOException e) {
			logger.severe("IOException: "+ e);
		} catch (Exception e) {
			logger.severe("Exception: "+ e);
		}

	}

}
