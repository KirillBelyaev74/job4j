package ru.job4j.departments;

import java.util.Comparator;

class DepAscComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        char[] first = o1.toCharArray();
        char[] second = o2.toCharArray();
        int result = 0;
        for (int index = 0; index != o1.length() && index != o2.length(); index++) {
            result = Character.compare(second[index], first[index]);
            if (result != 0) {
                break;
            }
        }
        if (result == 0) {
            result = o1.length() - o2.length();
        }
        return result;
    }
}
