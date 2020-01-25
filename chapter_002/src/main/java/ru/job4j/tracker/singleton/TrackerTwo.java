package ru.job4j.tracker.singleton;

public class TrackerTwo {

    public static TrackerTwo getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerTwo INSTANCE = new TrackerTwo();
    }
}
