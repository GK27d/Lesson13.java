package com.kostina.vehicles;

import com.kostina.details.Engine;
import com.kostina.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String producer, String carClass, double weight, Driver driver, Engine engine, double speed) {
        super(producer, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}