package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchenge(Battery anather) {
        this.load = this.load + anather.load;
        anather.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(70);
        Battery two = new Battery(30);
        System.out.println("Size battery one: " + one.load + ". Size battery two: " + two.load);
        two.exchenge(one);
        System.out.println("Size battery one: " + one.load + ". Size battery two: " + two.load);

    }
}
