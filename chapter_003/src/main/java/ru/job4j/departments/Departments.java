package ru.job4j.departments;

import java.util.*;

public class Departments {

    public static ArrayList<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            StringBuilder start = new StringBuilder();
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start.append(el).append("/");
            }
        }
        return new ArrayList<>(tmp);
    }

    public static List sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
        return orgs;
    }

    public static List sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
        return orgs;
    }
}