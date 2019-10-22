package ru.job4j.tracker;

public class StartUI {
    /**
     * Меню
     * @param input
     * @param tracker
     * @param actions
     */
    public void init(Input input, Tracker tracker, BaseAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Выбор: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }
    private void showMenu(BaseAction[] actions) {
        System.out.println("Меню: ");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(actions[index].info());
        }
    }
    public static void main(String[] args) {
            Input input = new ConsoleInput();
            Input validate = new ValidateInput(input);
            Tracker tracker = new Tracker();
            BaseAction[] actions = {
                    new CreateAction(0, "Добавление"),
                    new ReplaceAction(1, "Редактирование"),
                    new DeleteAction(2, "Удаление"),
                    new FindAllAction(3, "Показать все"),
                    new FindByNameAction(4, "Найти по имени"),
                    new FindByIdAction(5, "Найти по ID")
            };
            new StartUI().init(validate, tracker, actions);
    }
}