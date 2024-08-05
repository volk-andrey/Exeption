package org.example;

import static org.example.service.ValidateService.validate;

public class Main {
    public static void main(String[] args) {
        validate("login", "pass", "pass");
        System.out.println("Good");
    }
}