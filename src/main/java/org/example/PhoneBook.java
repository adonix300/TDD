package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> nameToNumber = new HashMap<>();
    private Map<String, String> numberToName = new HashMap<>();



    public int add(String name, String number) {
        nameToNumber.put(name, number);
        return nameToNumber.size();
    }

    public String findByNumber(String number) {

    }
}