package ru.job4j.departments;

import java.util.Comparator;

class DepAscComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] first = o1.split("/");
        String[] second = o2.split("/");
        int result = 0;
        for (int index = 0; index != first.length && index != second.length; index++) {
            result = second[index].compareTo(first[index]);
            if (result != 0) {
                break;
            }
        }
        if (result == 0) {
            result = o1.compareTo(o2);
        }
        return result;
    }
}
