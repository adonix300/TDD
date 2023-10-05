package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

class PhoneBookTest {
     @Test
     void add() {
          PhoneBook phoneBook = new PhoneBook();
          int result = phoneBook.add("Nataly", "1111");
          Assertions.assertEquals(1, result);
     }

     @Test
     void findByNumber() {
          PhoneBook phoneBook = new PhoneBook();
          phoneBook.add("Nataly", "1111");
          String result = phoneBook.findByNumber("1111");
          Assertions.assertEquals("Nataly", result);
     }


     @Test
     void findByName() {
          PhoneBook phoneBook = new PhoneBook();
          phoneBook.add("Nataly", "1111");
          String result = phoneBook.findByName("Nataly");
          Assertions.assertEquals("1111", result);
     }

     @Test
     void printAllNames() {
          PhoneBook phoneBook = new PhoneBook();
          phoneBook.add("Nataly", "1111");
          phoneBook.add("Alice", "2222");
          phoneBook.add("Bob", "3333");
          List<String> result = phoneBook.printAllNames();
          Assertions.assertEquals(Arrays.asList("Alice", "Bob", "Nataly"), result);
     }
}
