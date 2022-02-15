package com.kostina;

import com.kostina.details.Engine;
import com.kostina.professions.Driver;
import com.kostina.vehicles.Car;
import com.kostina.vehicles.Lorry;
import com.kostina.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
        Driver hondaDriver = new Driver("Костина Г.И.", "27.12.1991", 2);
        Engine hondaEngine = new Engine("60", "Honda");
        Car honda = new Car("Honda", "C", 5000, hondaDriver, hondaEngine);

        Driver lorryDriver = new Driver("Иванов И.И.", "07.02.1969", 20);
        Engine lorryEngine = new Engine("30", "LorryEngine");
        Lorry lorry = new Lorry("Грузовик", "D", 8000, lorryDriver, lorryEngine, 70);

        Driver bugattiDriver = new Driver("Петров П.П.", "17.02.1970", 15);
        Engine bugattiEngine = new Engine("100", "SportEngine");
        SportCar bugatti = new SportCar("Bugatti", "C", 4000, bugattiDriver,
                bugattiEngine, 350);

        System.out.println(honda);
        System.out.println(lorry);
        System.out.println(bugatti);
    }
}