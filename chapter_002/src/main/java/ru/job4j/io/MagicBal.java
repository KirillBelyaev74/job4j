package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;

public class MagicBal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println(name + " : Нет");
        } else if (answer == 1) {
            System.out.println(name + " : Да");
        } else {
            System.out.println(name + " : Может быть");
        }
    }
}
