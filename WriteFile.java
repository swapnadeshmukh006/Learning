package com.sampleFileHandling;

import java.io.FileWriter;
import java.io.IOException;


	public class WriteFile{
             public static void main(String args[]){
		try{
		
			FileWriter fileWrite = new FileWriter("SampleFile.txt");
			fileWrite.write("Hi ,i am writing file handling looks easy");
			fileWrite.close();
			System.out.println("Successfully wrote in file");
			
		
		
		} catch (IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
			}		
				}	
