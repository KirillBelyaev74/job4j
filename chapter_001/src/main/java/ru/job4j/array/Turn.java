package ru.job4j.array;

public class Turn {
    /**
     * Переворачивает массив
     * @param array - массив который нужно перевернуть
     * @return - перевернутый массив
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length - i; i++) {
             int x = array[i];
             array[i] = array[array.length - i - 1];
             array[array.length - i - 1] = x;
        }
        return array;
    }
}
