package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    public int compare(String left, String right) {
        int result = 0;
        int value = Math.min(left.length(), right.length());
        for (int index = 0; !left.equals(right) && index != value; index++) {
            if (left.charAt(index) != right.charAt(index)) {
                result = Character.compare(left.charAt(index), right.charAt(index));
                break;
            }
        }
        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
