package ru.job4j.tracker;
import java.util.Random;
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    /**
     * Метод удаляет найденную заявку
     * @param id - id заявки, которую нужно удалить
     * @return - true or false
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.position--);
                result = true;
            }
        }
        return result;
    }
    /**
     * Метод заменяет найденую заявку
     * @param id - id заявки, которую нужно найти
     * @param item - новыя заявка
     * @return - true or false
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                this.items[index] = item;
                result = true;
            }
        }
        return result;
    }
    /**
     * Метод возвращает все заполненые items
     * @return - массив без null элементов
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
    /**
     * Метод находит заявку по имени
     * @param key - имя заявки
     * @return - найденная заявка
     */
    public Item[] findByName(String key) {
        int number = 0;
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[number++] = this.items[index];
            }
        }
        Item[] finish = new Item[number];
        System.arraycopy(result, 0, finish, 0, number);
        return finish;
    }
    /**
     * Метод находит заявку по id
     * @param id - id заявки
     * @return - найденная заявка
     */
    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                item = this.items[index];
            }
        }
        return item;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}