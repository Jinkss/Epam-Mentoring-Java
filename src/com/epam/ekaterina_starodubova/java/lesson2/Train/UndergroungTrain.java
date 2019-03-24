package com.epam.ekaterina_starodubova.java.lesson2.Train;

import com.epam.ekaterina_starodubova.java.lesson2.PublicAbleTransport;
import com.epam.ekaterina_starodubova.java.lesson2.PublicTransport;

public class UndergroungTrain extends PublicTransport {
    public UndergroungTrain(String mark, int yearOfProduction, int fuelOutGo) {
        super(mark, yearOfProduction, fuelOutGo);
    }

    public int costOfPublicTransport() {
        int undergroundTrain = 250;
        System.out.println("Cost of Underground Train " + undergroundTrain);
        return undergroundTrain;
    }

    @Override
    public int costOfTicketTransport() {
        return 10;
    }

    @Override
    public boolean workable() {
        return true;
    }
}
