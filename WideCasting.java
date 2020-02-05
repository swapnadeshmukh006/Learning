package com.typecast;
  
public class WideCasting{

public static void main(String args[]){

    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    float f = 1.5f;
    double fd = f;
    double myDouble ;
    int myInt1 = double myDouble;
    int myInt2 = int myDouble; // Manual casting: double to int
    int myDouble; // Manual casting: double to int

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    System.out.println(f);      // Outputs 1.5f
    System.out.println(fd);      // Outputs 1.5f
    System.out.println(myInt2);      // Outputs 1.5f
    System.out.println(myDouble);      // Outputs 1.5f


  }
    }

