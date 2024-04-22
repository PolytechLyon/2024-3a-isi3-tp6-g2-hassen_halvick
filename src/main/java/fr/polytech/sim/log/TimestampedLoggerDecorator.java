package fr.polytech.sim.log;

import java.util.Date;

public class TimestampedLoggerDecorator implements Logger {

    private final Logger wrapped;

    /**
     * Constructor.
     *
     * @param wrapped logger to decorate.
     */
    public TimestampedLoggerDecorator(Logger wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void log(String format, Object... args) {
        this.wrapped.log(String.format("%s -> %s", new Date(), String.format(format, args)));
    }
}

