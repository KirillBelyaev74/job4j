package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        return left > right ? left : right;
    }
    public int max(int left, int right, int high) {
        return this.max(left, this.max(right, high));
    }
    public int max(int left, int right, int high, int low) {
        int max = this.max(left, right, high);
        return this.max(max, low);
    }
}