package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingMachineTest {

    @Test
    public void shouldReturnPersonalizedGreet() {
        Assertions.assertEquals("Hola, Pepe.", new GreetingMachine().getGreeting("Pepe"));
        Assertions.assertEquals("Hola, Jacinto.", new GreetingMachine().getGreeting("Jacinto"));
    }

    @Test
    public void shouldReturnHolaMundoWhenEmptyNameIsPassed() {
        Assertions.assertEquals("Hola, Mundo.", new GreetingMachine().getGreeting(""));
    }

    @Test
    public void shouldReturnHolaMundoWhenNoNameIsPassed() {
        Assertions.assertEquals("Hola, Mundo.", new GreetingMachine().getGreeting());
    }

    @Test
    public void shouldReturnUpperCaseWhenNamIsUppercase() {
        Assertions.assertEquals("HOLA, JUAN!", new GreetingMachine().getGreeting("JUAN"));
    }

    @Test
    public void shouldGreetCouples() {
        Assertions.assertEquals("Hola, Ana y Bartolo", new GreetingMachine().getGreeting("Ana", "Bartolo"));
    }

    @Test
    public void shouldGreetGroups() {
        Assertions.assertEquals("Hola, Ana, Bartolo, Carlota, y Daniel.", new GreetingMachine().getGreeting("Ana", "Bartolo", "Carlota", "Daniel"));
    }
}
