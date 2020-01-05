package ru.job4j.collection;

import java.util.Comparator;

public class UserByNameLess implements Comparator<User> {

    public int compare(User first, User second) {
       return second.getName().compareTo(first.getName());
    }
}
