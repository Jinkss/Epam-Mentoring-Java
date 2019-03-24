package com.epam.ekaterina_starodubova.java.lesson2.Bus;

import com.epam.ekaterina_starodubova.java.lesson2.PublicTransport;

public class ElectricBus extends PublicTransport {
    public ElectricBus(String mark, int yearOfProduction, int fuelOutGo) {
        super(mark, yearOfProduction, fuelOutGo);
    }

    @Override
    public int costOfPublicTransport() {
        int electricBusCost = 100;
        System.out.println("Cost of Electric Bus " + electricBusCost);
        return electricBusCost;
    }

    @Override
    public int costOfTicketTransport() {
        return 20;
    }

    @Override
    public boolean workable() {
        return true;
    }


}
