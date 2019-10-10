package ru.job4j.tracker;

public class StubInput implements Input {

    private String[] numberMenu;
    private int position;

    public StubInput(String[] numberMenu) {
        this.numberMenu = numberMenu;
    }
    public int askInt(String question) {
        return Integer.parseInt(numberMenu[this.position++]);
    }
    public int askInt(String question, int max) {
        return askInt(question);
    }
}
