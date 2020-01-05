package ru.job4j.collection;

import java.util.Comparator;

public class UserByNameMore implements Comparator<User> {

    @Override
    public int compare(User first, User second) {
        return first.getName().compareTo(second.getName());
    }
}
