package fr.polytech.sim.log;

public class FabriqueLogger {
    public static Logger getLogger(String name) {
        return new TimestampedLoggerDecorator(new ConsoleLogger(name));
    }
}
