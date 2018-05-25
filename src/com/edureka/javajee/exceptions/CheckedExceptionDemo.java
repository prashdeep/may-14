package com.edureka.javajee.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		readContentFromFile("d:/sfsdf");
	}

	public static void readContentFromFile(String fileName) {
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));) {
			System.out.println(reader.readLine());
		} catch (IOException e) {
			System.out.println("Exception while reading the file contents");
		}
	}

}
