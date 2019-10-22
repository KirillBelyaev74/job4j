package ru.job4j.tracker;

public class ReplaceAction extends BaseAction {

    public ReplaceAction(int key, String name) {
        super(key, name);
    }
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Введите ID: ");
        String newName = input.askStr("Введите новое имя: ");
        Item newItem = new Item(newName);
        tracker.replace(id, newItem);
        return true;
    }
}
