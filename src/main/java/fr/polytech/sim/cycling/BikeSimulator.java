package fr.polytech.sim.cycling;

import fr.polytech.sim.Simulation;
import fr.polytech.sim.log.FabriqueLogger;
import fr.polytech.sim.log.Logger;
import fr.polytech.sim.utils.Context;

/**
 * Bike simulation.
 */
public class BikeSimulator implements Simulation {
    private final Logger logger = FabriqueLogger.getLogger("BikeSimulator");

    public void run() {
        Bike bike = new SimpleBike();
        this.logger.log("Bike's speed %.2f Km/h.", bike.getVelocity());
        this.logger.log("Bike's mass %.2f Kg.", bike.getMass());


        Bike injectedBike = Context.inject(Bike.class);
        this.logger.log("Injected bike's speed %.2f Km/h.", injectedBike.getVelocity());
        this.logger.log("Injected bike's mass %.2f Kg.", injectedBike.getMass());
    }
}
