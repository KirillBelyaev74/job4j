package ru.job4j.tracker;
import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public int askInt(String question) {
        System.out.println(question);
        return scanner.nextInt();
    }

}
