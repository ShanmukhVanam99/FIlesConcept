package com.to.FilesConcept;

import java.io.File;
import java.io.IOException;


public class CreateNewFile {
	 public static void main( String[] args )throws IOException
	   {	
	      try {
		     File file = new File("D:\\CSVExample.csv");
		     /*If file gets created then the createNewFile() 
		      * method would return true or if the file is 
		      * already present it would return false
		      */
	             boolean fvar = file.createNewFile();
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }
		     if(file.delete()) 
	            { 
	                System.out.println("File deleted successfully"); 
	            } 
	            else
	            { 
	            	 System.out.println("Failed to delete the file"); 
	            } 
		      
	            
	    	} catch (IOException e) {
	    		System.out.println("Exception Occurred:");
	    		 e.printStackTrace();
			      
	    	}
	    		
	               
		System.out.println();
		
	   }
}
