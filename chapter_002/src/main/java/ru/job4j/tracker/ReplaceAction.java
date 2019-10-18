package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    public String name() {
        return "=====Replace by id=====";
    }
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String newName = input.askStr("Enter a new name: ");
        Item newItem = new Item(newName);
        tracker.replace(id, newItem);
        return true;
    }
}
