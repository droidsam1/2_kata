package com.example.demo;

public class GreetingMachine {

    private final static String START_GREETING = "Hola, ";

    public String getGreeting() {
        return getGreeting("");
    }

    public String getGreeting(String name, String anotherName) {
        return START_GREETING + name + " y " + anotherName;
    }

    public String getGreeting(String name) {

        if (isNullOrEmpty(name)) {
            return START_GREETING + "Mundo.";
        }

        if (isUpperCase(name)) {
            return (START_GREETING + name + "!").toUpperCase();
        }

        return START_GREETING + name + ".";
    }

    public String getGreeting(String... names) {
        return START_GREETING + joinNames(names);
    }

    private String joinNames(String... names) {
        String result = "";
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                result = result.concat("y " + names[i] + ".");
            } else {
                result = result.concat(names[i] + ", ");
            }
        }
        return result;
    }

    private boolean isNullOrEmpty(String name) {
        return name == null || name.isEmpty();
    }

    private boolean isUpperCase(String name) {
        return name != null && !name.isEmpty() && name.equals(name.toUpperCase());
    }
}
