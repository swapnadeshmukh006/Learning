package com.lern.sample;

import java.util.HashMap;

public class CountryHashList {
    public static void main(String[] args) {


        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("India", "Delhi");
        capitalCities.put("USA", "WC");
        capitalCities.put("England", "London");
        System.out.println(capitalCities);
    }
}
