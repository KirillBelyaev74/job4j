package ru.job4j.tracker;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Выберите пунк меню: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("-----Создание новой заяки-----");
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] result = tracker.findAll();
                int show = 1;
                System.out.println("-----Вывод всех заявок-----");
                for (Item results : result) {
                    System.out.println("Найдено все заявок с таким именем: " + result.length);
                    System.out.println(show++ + ". Имя: " + results.getName() + ". ID: " + results.getId());
                }
            } else if (select == 2) {
                System.out.println("-----Редактирование заявки-----");
                System.out.println("Введите ID заявки, которую хотите изменить: ");
                String id = scanner.nextLine();
                System.out.println("Введите новое имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                boolean result = tracker.replace(id, item);
                if (result) {
                    System.out.println("Редактирование прошло успешно!");
                } else {
                    System.out.println("Заявка с таким ID не найдена!");
                }
            } else if (select == 3) {
                System.out.println("-----Удаление заявки-----");
                System.out.println("Введите ID заявки, которую хотите удалить: ");
                String id = scanner.nextLine();
                boolean result = tracker.delete(id);
                if (result) {
                    System.out.println("Удаление прошло успешно!");
                } else {
                    System.out.println("Заявка с таким ID не найдена!");
                }
            } else if (select == 4) {
                System.out.println("-----Поиск заявки по ID-----");
                System.out.println("Введите ID заявки, которую хотите найти: ");
                String id = scanner.nextLine();
                Item result = tracker.findById(id);
                System.out.println("Имя: " + result.getName() + ". ID: " + result.getId());
            } else if (select == 5) {
                System.out.println("-----Поиск заявки по имени-----");
                System.out.println("Введите имя заявки, которую хотите найти: ");
                String name = scanner.nextLine();
                Item[] result = tracker.findByName(name);
                int show = 1;
                for (Item results : result) {
                    System.out.println("Найдено все заявок с таким именем: " + result.length);
                    System.out.println(show++ + ". Имя: " + results.getName() + ". ID: " + results.getId());
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Добавить новую заявку.");
        System.out.println("1. Показать все заявки.");
        System.out.println("2. Редактировать заявку.");
        System.out.println("3. Удалить заявку.");
        System.out.println("4. Найти заявку по ID.");
        System.out.println("5. Найти заявку по имени.");
        System.out.println("6. Выйти из программы.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}