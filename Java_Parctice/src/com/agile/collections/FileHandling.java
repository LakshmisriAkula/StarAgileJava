package com.agile.collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriting();
		FileReading();
	}

	static void FileWriting() throws IOException {
		File f = new File("E:\\Agile Workspace\\Filehandlefiles\\Test.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);

		writer.write("This is my code");
		writer.close();
	}
	
	static void FileReading() throws IOException {
		File f = new File("E:\\Agile Workspace\\Filehandlefiles\\Test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);

		String line = reader.readLine();
		System.out.println(line);
		reader.close();
	}

}
