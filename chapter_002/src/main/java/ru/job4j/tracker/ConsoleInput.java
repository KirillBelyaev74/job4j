package ru.job4j.tracker;
import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод запрашивает у пользователя выбрать пунк меню
     *
     * @param question - вопрос пользователю
     * @return - введенный пользователем пункт меню
     */
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
    public int askInt(String question, int max) {
        int select = askInt(question);
        if (!this.check(select, max)) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }
    public String askStr(String question) {
        System.out.println(question);
        return this.scanner.nextLine();
    }
    public boolean check(int select, int max) {
        return 0 <= select && select <= max;
    }

}
