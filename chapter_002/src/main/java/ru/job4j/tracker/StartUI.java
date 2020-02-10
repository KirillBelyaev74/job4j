package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StartUI {

    private final Input input;
    private final Tracker tracker;
    private final Consumer<String> output;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init(ArrayList<BaseAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = this.input.askInt("Выбор: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(this.input, this.tracker, this.output);
        }
    }

    private void showMenu(ArrayList<BaseAction> actions) {
        System.out.println("Меню: ");
        for (BaseAction action : actions) {
            System.out.println(action.info());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        ArrayList<BaseAction> actions = new ArrayList<>();
        actions.add(new CreateAction(0, "Добавление"));
        actions.add(new ReplaceAction(1, "Редактирование"));
        actions.add(new DeleteAction(2, "Удаление"));
        actions.add(new FindAllAction(3, "Показать все"));
        actions.add(new FindByNameAction(4, "Найти по имени"));
        actions.add(new FindByIdAction(5, "Найти по ID"));
        new StartUI(validate, tracker, System.out::println).init(actions);
    }
}