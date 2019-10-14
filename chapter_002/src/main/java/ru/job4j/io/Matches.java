package ru.job4j.io;
import java.util.Scanner;

public class Matches {

    public int persenOne(Scanner input) {
        int result = 0;
        boolean invalid = true;
        while (invalid) {
            System.out.println("Первый игрок, берите спички!");
            result = Integer.parseInt(input.nextLine());
            if (result >= 1 && result <= 3) {
                System.out.println("Первый игрок взял: " + result + " спичек");
                invalid = false;
            } else {
                System.out.println("Играйте по правилам!");
            }
        }
        return result;
    }

    public int persenTwo(Scanner input) {
        int result = 0;
        boolean invalid = true;
        while (invalid) {
            System.out.println("Второй игрок, берите спички");
            result = Integer.parseInt(input.nextLine());
            if (result >= 1 && result <= 3) {
                System.out.println("Второй игрок взял: " + result + " спичек");
                invalid = false;
            } else {
                System.out.println("Играйте по правилам!");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Matches matches = new Matches();
        int value = 11;
        int selectOne;
        int selectTwo = 0;
        boolean invalid = true;
        Scanner input = new Scanner(System.in);
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        while (invalid) {
            System.out.println("На столе: " + value + " спичек.");
            selectOne = matches.persenOne(input);
            value = value - selectOne;
            if (0 >= value) {
                System.out.println("Первый игрок победил!");
                break;
            }
            System.out.println("На столе: " + value + " спичек.");
            selectTwo = matches.persenTwo(input);
            value = value - selectTwo;
            if (0 >= value) {
                System.out.println("Второй игрок победил!");
                break;
            }
        }
    }
}
