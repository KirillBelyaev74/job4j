package ru.job4j.tracker;

public class FindByNameAction extends BaseAction {

    public FindByNameAction(int key, String name) {
        super(key, name);
    }
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Введите имя: ");
        for (Item items : tracker.findByName(key)) {
            System.out.println(String.format("%s, %s", items.getName(), items.getId()));
        }
        return true;
    }
}
