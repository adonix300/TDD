package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    static Map<String, String> contacts = new HashMap<>();

//    static {
//        contacts.put("Nataly", 111);
//        contacts.put("Antony", 222);
//        contacts.put("Paul", 333);
//    }

    public static void main(String[] args) {

    }

    public int add(String name, String number) {
        contacts.put(name, number);
        return contacts.size();
    }
}