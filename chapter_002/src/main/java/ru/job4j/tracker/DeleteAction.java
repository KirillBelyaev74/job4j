package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    public String name() {
        return "=====Delete=====";
    }
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        tracker.delete(id);
        return true;
    }
}
