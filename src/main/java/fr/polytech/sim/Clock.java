package fr.polytech.sim;

import java.util.Random;

/**
 * A clock used to synchronize simulations.
 */
public class Clock {
    private final int time = new Random().nextInt(25);

    private static Clock instance = null;

    /**
     * Random integer between 0 and 24 inclusive.
     */
    public int getTime() {
        return this.time;
    }

    /**
     * Return the singleton instance of the clock.
     */
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    /**
     * Private constructor.
     */
    private Clock() {
    }
}
