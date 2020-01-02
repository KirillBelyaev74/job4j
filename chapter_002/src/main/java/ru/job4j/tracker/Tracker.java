package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод удаляет найденную заявку
     *
     * @param id - id заявки которую нужно удалить
     * @return - true or false
     */
    public boolean delete(String id) {
        boolean result = false;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                this.items.remove(item);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод заменяет найденую заявку
     *
     * @param id   - id заявки, которую нужно найти
     * @param item - новыя заявка
     * @return - true or false
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index != this.items.size(); index++) {
            if (this.items.get(index).getId().equals(id)) {
                this.items.set(index, item);
                this.items.get(index).setId(id);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает все заполненые items
     *
     * @return - массив без null элементов
     */
    public ArrayList<Item> findAll() {
        return this.items;
    }

    /**
     * Метод находит заявку по имени
     *
     * @param key - имя заявки
     * @return - найденная заявка
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Метод находит заявку по id
     *
     * @param id - id заявки
     * @return - найденная заявка
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}