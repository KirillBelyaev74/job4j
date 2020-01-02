package ru.job4j.tracker;

import java.util.ArrayList;

public class StartUI {
    /**
     * Меню
     * @param input
     * @param tracker
     * @param actions
     */
    public void init(Input input, Tracker tracker, ArrayList<BaseAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Выбор: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
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
            new StartUI().init(validate, tracker, actions);
    }
}