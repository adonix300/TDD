package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
          String result = phoneBook.findByNumber("1111");
          Assertions.assertEquals("Alice", result);
     }
}
