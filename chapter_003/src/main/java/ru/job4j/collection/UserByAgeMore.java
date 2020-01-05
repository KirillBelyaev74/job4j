package ru.job4j.collection;

import java.util.Comparator;

public class UserByAgeMore implements Comparator<User> {

    public int compare(User first, User second) {
        return second.getAge() - first.getAge();
    }
}
