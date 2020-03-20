package com.learn.sample;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Suadrsahn");
        arrayList.add("Suadrsahn1");
        arrayList.add("Suadrsahn2");
        arrayList.add("Suadrsahn3");
        arrayList.add("Suadrsahn4");
        arrayList.add("Suadrsahn5");
        System.out.println("my list "+arrayList.toString());
        List<String> newList = new ArrayList<>();
        newList.add("1");
        newList.add("2");
        newList.add("3");
        newList.add("4");
        arrayList.addAll(2,newList);
        System.out.println("my list "+arrayList.toString());
        //arrayList.removeAll(newList);
        System.out.println("my list "+arrayList.toString());
        System.out.println("my list "+arrayList.subList(2,5));
        System.out.println("my list "+arrayList.lastIndexOf("Suadrsahn5"));

        for(int i =0;  i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        for (String element : arrayList){
            System.out.println(element);
        }
        arrayList.forEach(elemnt -> { System.out.println(elemnt); });

    }
}
