 package com.sampleFileHandling;

 	import java.io.File;
		
	public class Delete{
		public static void main(String args[]){
			File myObj = new File("C:\\SwapnaJava\\SampleFile.txt");
			if(myObj.delete())
			{
				System.out.println("File deleted" +myObj.getName());
			}
			else
			{
				System.out.println("File not exit");
			}
				}
					}
