package ru.job4j.tracker;

public class FindByIdAction extends BaseAction {

    public FindByIdAction(int key, String name) {
        super(key, name);
    }
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Введите ID: ");
        Item item = tracker.findById(id);
        System.out.println(String.format("%s, %s", item.getName(), item.getId()));
        return true;
    }
}
