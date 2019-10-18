package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    public String name() {
        return "=====Find by ID=====";
    }
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        Item item = tracker.findById(id);
        System.out.println(String.format("%s, %s", item.getName(), item.getId()));
        return true;
    }
}
