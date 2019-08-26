package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for(int index = 0; index < data.length; index++) {
            if(data[index] == el) {
                rst = index;
            }
        }
        return rst;
    }
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for(int index = start; index < finish; index++) {
            if(data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public int[] sort(int[] data) {
        for(int index = 0; index < data.length - 1; index++) {
            int x = this.indexOf(data, index + 1, index, data.length - 1);
            if(data[index] > data[x]) {
                int min = data[x];
                data[x] = data[index];
                data[index] = min;
            }
        }
        return data;
    }
}
