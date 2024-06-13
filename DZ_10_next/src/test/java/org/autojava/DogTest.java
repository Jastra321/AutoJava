package org.autojava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {
  Dog d = new Dog();

   @Test
    public void test1(){
        Beethoven beet = d.getBeethoven();
        assertEquals("Beethoven", beet.name());
    }
}