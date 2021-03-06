package ru.job4j.array;

public class Matrix {
    /**
     * Таблица умнажения размера до size
     * @param size - размер таблиы
     * @return - массив(таблица)
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int index = 0; index < size; index++) {
            for (int i = 0; i < size; i++) {
                table[index][i] = (index + 1) * (i + 1);
            }
        }
        return table;
    }
}