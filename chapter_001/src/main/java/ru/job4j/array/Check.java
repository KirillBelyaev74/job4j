package ru.job4j.array;

public class Check {
    /**
     * Проверяет чтобы в массиве были похожее значение
     * @param data - массив который нужно проверить
     * @return - возвращает true or false в зависимости от схожих значение в масссиве
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[0] != data[index + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}