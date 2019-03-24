package com.epam.ekaterina_starodubova.java.lesson2.Bus;

import com.epam.ekaterina_starodubova.java.lesson2.PublicTransport;

public class PetrolBus extends PublicTransport {
    public PetrolBus(String mark, int yearOfProduction, int fuelOutGo) {
        super(mark, yearOfProduction, fuelOutGo);
    }

    public int costOfPublicTransport() {
        int petrolBus = 150;
        System.out.println("Cost of Petrol Bus " + petrolBus);
        return petrolBus;
    }

    @Override
    public int costOfTicketTransport() {
        return 15;
    }

    @Override
    public boolean workable() {
        return true;
    }
}
