package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testMain(){
        String argument = "Jenkins";
        Assertions.assertEquals(Main.greet(argument), "Hello, " + argument);
    }
}
