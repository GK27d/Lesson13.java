package com.kostina.vehicles;

import com.kostina.details.Engine;
import com.kostina.professions.Driver;

public class Lorry extends Car {
    private double loadCapacity;

    public Lorry(String producer, String carClass, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(producer, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public double getLiftingCapacity() {
        return loadCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.loadCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "loadCapacity=" + loadCapacity +
                "} " + super.toString();
    }
}