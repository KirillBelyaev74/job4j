package ru.job4j.tracker.Singleton;

public class TrackerOne {

    private static TrackerOne instance;

    public static TrackerOne getInstance() {
        if (instance == null) {
            instance = new TrackerOne();
        }
        return instance;
    }

}
