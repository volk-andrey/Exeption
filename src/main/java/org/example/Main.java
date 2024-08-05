package org.example;

import org.example.exeption.WrongLoginException;
import org.example.exeption.WrongPasswordExeption;

import static org.example.service.ValidateService.validate;

public class Main {
    public static void main(String[] args) {
        try {
            validate("login", "pass", "pass123");
            System.out.println("Good");
        } catch (WrongLoginException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Bad login");
        } catch (WrongPasswordExeption e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Bad password");
        }
        finally {
            System.out.println("Finally");
        }
    }
}