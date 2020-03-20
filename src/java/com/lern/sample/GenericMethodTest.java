package com.lern.sample;

import java.net.SocketTimeoutException;

public class GenericMethodTest {
    public static < E > void printArray( E [] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray ={1.1 ,2.2,3.3,4.4};
        Character[] charArray = {'s','a', 'P','N'};
        System.out.println("Array of integer array contains");
        printArray(intArray);
        System.out.println("\nArray of double array contains");
        printArray(doubleArray);
        System.out.println("\nArray of char array contains");
        printArray(charArray);
    }
}
