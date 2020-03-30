package ru.job4j.collection;

import java.util.Set;

public class UsageHashSet {
    public static void main(String[] args) {
        Set<String> autos = Set.of("Lada", "BMW", "Volvo", "Toyota");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
