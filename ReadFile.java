package com.to.FilesConcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	  public static void main(String[] args) {
	    try {
	      File myObj = new File("filename.txt");
	      Scanner myReader = new Scanner(myObj);
	      String data = null;
	      while (myReader.hasNextLine()) {
	        data = myReader.nextLine();
	        System.out.println(data);
	      }
	      while (myReader.hasNextLine()) {
	    	  System.out.println(data);
		  
		      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	}