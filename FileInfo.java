package com.sampleFileHandling;
 	import java.io.File;

		public class FileInfo{
			public static void main (String args[]){
				File myObj = new File("SampleText.txt");
		
				if(myObj.exists()){
					System.out.println("File is :-" + myObj.getName());
					System.out.println("File path is :-" + myObj.getAbsolutePath());
					System.out.println("Writable :-" + myObj.canWrite());
					System.out.println("Readable : -" + myObj.canRead());
					System.out.println("Size of file is :- " + myObj.length());
                                        
				}
				 else {
					 System.out.println("File not exits");
				 }
				   }
		}
