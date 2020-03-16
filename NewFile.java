  
  package com.sampleFileHandling;

   import java.io.File;
   import java.io.IOException;

   public class NewFile{
	   public static void main(String args[]){
		
		   try {
	        File myObj = new File("SampleFile.txt");
		if(myObj.createNewFile()){
			System.out.println("File created -" +myObj.getName());
		}
		else{
		        System.out.println("File Already exit");
		} 
		}catch (IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
		}
	        }     

   
