package ru.job4j.array;

public class ArrayChar {
    /**
     * Проверяет правильность написание слова
     * @param word - слово
     * @param prefix - префикс
     * @return -
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int index = 0; index < pref.length;  index++) {
            if (pref[index] != wrd[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
