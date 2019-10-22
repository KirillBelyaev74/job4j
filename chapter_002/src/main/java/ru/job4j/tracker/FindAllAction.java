package ru.job4j.tracker;

public class FindAllAction extends BaseAction {

    public FindAllAction(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s, %s", item.getName(), item.getId()));
        }
        return true;
    }
}
