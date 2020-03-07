package pl.sda.wyjatki;
import pl.sda.wyjatki.exceptions.EmailException;
import pl.sda.wyjatki.exceptions.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EmailException {
        throw new EmailException("Zły email!");
    }

    User user = new User();
    try {
        user.setLogin("login");
    }
    catch (EmailException e) {
        e.printStackTrace();
    }
    System.out.println("nie działą")
}