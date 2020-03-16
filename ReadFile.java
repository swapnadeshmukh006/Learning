package com.sampleFileHandling;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	 
	   public class ReadFile{
		   public static void main(String args[]){
		   try{
		   File myFile = new File("SampleText.txt");
		   Scanner fileRead = new Scanner(myFile);
		   while(fileRead.hasNextLine())
		   {

		    String data = fileRead.nextLine();
                    System.out.println(data);
		   }
		   fileRead.close();
		   } catch (FileNotFoundException e)
		      {  
			   System.out.println("Error occured");
				e.printStackTrace();

		     }
		     	}
				}
