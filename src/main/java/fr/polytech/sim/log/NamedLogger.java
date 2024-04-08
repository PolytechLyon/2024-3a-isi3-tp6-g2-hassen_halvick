package fr.polytech.sim.log;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Name logger that is supposed to log its name along with each log entry, to
 * facilitate tracing.
 */
public abstract class NamedLogger implements Logger {
    final protected String name;

    /**
     * Constructor.
     *
     * @param name  logger name.
     */
    protected NamedLogger(String name) {
        this.name = name;
    }

    /**
     * log the message.
     *
     * @param message the message to log.
     */
    protected abstract void logger(String message);

    @Override
    public void log(String format, Object... args) {
        String entry = String.format(format, args);
        String message = String.format("%s\t%s\n", this.name, entry);
        logger(message);
    }

}
