package ru.job4j.tracker.singleton;

public class TrackerThree {

    private static final TrackerThree INSTANCE = new TrackerThree();

    public static TrackerThree getInstance() {
        return INSTANCE;
    }
}
