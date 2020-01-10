package com.to.FilesConcept;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	  public static void main(String[] args) {
	    try {
	      FileWriter myWriter = new FileWriter("D:\\filename.txt");
	      myWriter.write("Files in Java might be tricky, but it is fun enough!");
	      appendUsingFileWriter("D:\\filename.txt","Files add matter");
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }

	private static void appendUsingFileWriter(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	}
