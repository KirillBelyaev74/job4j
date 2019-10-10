package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private String key;
    public FindByNameAction(String key) {
        this.key = key;
    }
    public boolean execute(Input input, Tracker tracker){
        for (Item items : tracker.findByName(key)) {
            System.out.println(String.format("%s %s", items.getId(), items.getName()));
        }
        return true;
    }
    public String name() {
        return "Find by name.";
    }
}
