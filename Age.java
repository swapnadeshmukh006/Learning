
package com.customexception;

   public class MyClass{
	   static void age(int age){
		   if (age<18){
			   throw new ArithmeticException("Access Denied -you must be at least 18 years of age");
		   }
		   else{
			   System.out.println("Access granted");
		   }
	   }	

	   public static void main(String args[]){
		   age(17);
	   }
   }	



