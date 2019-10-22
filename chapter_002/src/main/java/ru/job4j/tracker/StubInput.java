package ru.job4j.tracker;

public class StubInput implements Input {

    private String[] numberMenu;
    private int position;

    public StubInput(String[] numberMenu) {
        this.numberMenu = numberMenu;
    }
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
    public int askInt(String question, int range) {
        return askInt(question);
    }
    public String askStr(String question) {
        return numberMenu[position++];
    }
}
