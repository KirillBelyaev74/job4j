package ru.job4j.oop1;

public class Student {

    public void song() {
        System.out.print("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.song();
        petya.song();
        petya.song();
    }
}