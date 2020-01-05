package ru.job4j.collection;

import java.util.Comparator;

public class UserByAgeLess implements Comparator<User> {

    public int compare(User first, User second) {
        return first.getAge() - second.getAge();
    }
}
