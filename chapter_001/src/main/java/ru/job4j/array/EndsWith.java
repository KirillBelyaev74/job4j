package ru.job4j.array;
public class EndsWith {
    /**
     * Проверяет конец слова
     * @param word - слово
     * @param post - префикс
     * @return - возвращает true or false (правильно написано слово или нет)
     */
    public boolean endsWith(String word, String post) {
        boolean result = true;
        char[] pst = post.toCharArray();
        char[] wrd = word.toCharArray();
        for (int index = 0; index < pst.length; index++) {
            if (pst[pst.length - index - 1] != wrd[wrd.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}