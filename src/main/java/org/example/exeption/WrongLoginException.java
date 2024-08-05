package org.example.exeption;

public class WrongLoginException extends RuntimeException {
    private String message;
    private String login;
    public WrongLoginException() {
        super("Wrong login");
    }

    public WrongLoginException(String message, String login) {
        super(message);
        this.login = login;
    }
}
