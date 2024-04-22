package fr.polytech.sim.log;

/**
 * Console logger.
 */
class ConsoleLogger extends NamedLogger {

    /**
     * Constructor.
     *
     * @param name  logger name.
     */
     ConsoleLogger(String name) {
        super(name);
    }

    @Override
    protected void logger(String message) {
        System.out.print(message);
    }
}
