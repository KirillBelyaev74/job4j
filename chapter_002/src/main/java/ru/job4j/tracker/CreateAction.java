package ru.job4j.tracker;

public class CreateAction implements UserAction {
    public String name() {
        return "=====Create a new Item=====";
    }
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
