package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] numberMenu;
    private int position;

    public StubInput(String[] numberMenu) {
        this.numberMenu = numberMenu;
    }

    public int askInt(String question) {
        return this.position++;
    }
}
