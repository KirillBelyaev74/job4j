package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindAllAction extends BaseAction {

    public FindAllAction(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        for (Item item : tracker.findAll()) {
            output.accept(String.format("%s, %s", item.getName(), item.getId()));
        }
        return true;
    }
}
