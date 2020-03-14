package com.customexception;

public class ArrayException{
         public static void main(String args[]){
                 try{
                 int[] numbers = {1,2,3};

                         System.out.println(numbers[10]);

                 } catch (Exception e){
                         System.out.println("Something is wrong");
                 } finally{
                         System.out.println("Try and catch are finished");
                 }

         }
 }

