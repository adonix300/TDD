package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    static Map<String, String> contacts = new HashMap<>();


    public static void main(String[] args) {

    }

    public int add(String name, String number) {
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(String number) {

    }
}