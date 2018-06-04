package com.edureka.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//readFIleUsingFileReader();
		//readFileUsingBuffer();
		writeToFile();
				
	}

	private static void writeToFile() throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("E://sample.txt")));
		writer.write("Hello World");
		writer.close();
		
	}

	private static void readFileUsingBuffer() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("E://sample.txt")));
		boolean flag = true;
		String str = null; 
		while(flag) {
			str = bufferedReader.readLine();
			if (str == null) {
				flag = false;
				continue;
			}
			System.out.println(str);
		}
		
		bufferedReader.close();
		
	}

	private static void readFIleUsingFileReader() throws FileNotFoundException, IOException {
		FileReader reader = new FileReader(new File("E://sample.txt"));
		boolean flag = true;
		while(flag) {
			int i = reader.read();
			if (i < 0) {
				flag = false;
				continue;
			}
			System.out.print((char)i);
		}
		reader.close();
	}

}
