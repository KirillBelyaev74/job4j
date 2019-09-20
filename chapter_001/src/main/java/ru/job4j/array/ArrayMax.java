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
            if (one == inputOne.length  && two < inputTwo.length) {
                result[x++] = inputTwo[two++];
            } else if (two == inputTwo.length && one < inputOne.length) {
                result[x++] = inputOne[one++];
            } else if (inputOne[one] < inputTwo[two]) {
                result[x++] = inputOne[one];
                if (one < inputOne.length) {
                    one++;
                }
            } else if (inputTwo[two] < inputOne[one]) {
                result[x++] = inputTwo[two];
                if (two < inputTwo.length) {
                    two++;
                }
            } else if (inputOne[one] == inputTwo[two]) {
                result[x++] = inputOne[one++];
                result[x++] = inputTwo[two++];
            }
        }
        return result;
    }
}
