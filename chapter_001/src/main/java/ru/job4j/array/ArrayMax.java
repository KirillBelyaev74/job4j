package ru.job4j.array;

public class ArrayMax {
    /**
     * Объединяет два массива в один по возростанию
     * @param inputOne - первый массив
     * @param inputTwo - второй массив
     * @return - объеденный массив
     */
    public int[] sum(int[] inputOne, int[] inputTwo) {
        int x = 0;
        int one = 0;
        int two = 0;
        int[] result = new int[inputOne.length + inputTwo.length];
        while (x < result.length) {
            if (x < inputOne.length) {
                result[x++] = inputOne[one++];
            } else {
                result[x++] = inputTwo[two++];
            }
        }
        return result;
    }
}
