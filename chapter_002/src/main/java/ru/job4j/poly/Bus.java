package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Поехали");
    }

    @Override
    public void passenger(int passengers) {
        System.out.println("В автобесе находиться " + passengers + "пассажиров");
    }

    @Override
    public int tuck(int oil) {
        return oil * 34;
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.go();
        bus.passenger(23);
        System.out.println("Чтобы залить 10 литров топлива, нужно " + bus.tuck(10));
    }
}
