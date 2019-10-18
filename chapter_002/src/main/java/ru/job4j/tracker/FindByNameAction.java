package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    public String name() {
        return "=====Find by name=====";
    }
    public boolean execute(Input input, Tracker tracker){
        String key = input.askStr("Enter name: ");
        for (Item items : tracker.findByName(key)) {
            System.out.println(String.format("%s, %s", items.getName(), items.getId()));
        }
        return true;
    }
}
