package org.autojava;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class RegisterNewClient {

    public static void chackAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("wrong age");
        }
    }

    public static void checkFile()  {
        try
        {
            FileReader fileReader = new FileReader("123.txt");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("FileNotFoundException occured: " + ex);
        }
    }
}