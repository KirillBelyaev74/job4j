package ru.job4j.array;

public class FindLoop {
    /**
     * Находит в массиве конкретное число
     * @param data - массив в котором нужно найти число
     * @param el - число которое нужно найти
     * @return - найденное число
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
            }
        }
        return rst;
    }

    /**
     * Находит элемент в массиве начиная от start до finish
     * @param data - массив в котором надо найти число
     * @param el - число который надо найти
     * @param start - элемент с которого нужно проверить массив
     * @param finish - элемент до которого нужно проверить массив
     * @return - найденное число
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Сортирует массив по порядку возростания
     * @param data - массив который нужно пересортировать
     * @return - перевернутый массив
     */
    public int[] sort(int[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            int x = this.indexOf(data, index + 1, index, data.length - 1);
            if (data[index] > data[x]) {
                int min = data[x];
                data[x] = data[index];
                data[index] = min;
            }
        }
        return data;
    }
}
