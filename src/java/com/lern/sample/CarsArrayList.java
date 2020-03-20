package com.lern.sample;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CarsArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Mastang");
        cars.add("Honda");
        System.out.println("Cars names list" +cars.toString());
        List<String> newList = new ArrayList<>();
        newList.add("4");
        newList.add("2");
        newList.add("3");
        System.out.println(newList);
        cars.addAll(2,newList);
        System.out.println("Updated list is " +cars.toString());
        cars.removeAll(newList);
        System.out.println(cars);

        for (String element : cars){
            System.out.println(element);
        }
        for (String element : newList){
            System.out.println(element);
        }
        System.out.println(cars.get(1));
        cars.remove(0);
        System.out.println(cars);
        cars.set(0,"Farrari");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(newList.size());
        Collections.sort(cars);
        for(String element : cars) {
            System.out.println(element);
        }
            Collections.sort(newList);
            for(String numbers : newList){
                System.out.println(numbers);
            }
            Collections.reverse(cars);
        for(String element : cars) {
            System.out.println(element);
        }
        }
    }



