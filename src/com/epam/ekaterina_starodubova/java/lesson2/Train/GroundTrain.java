package com.epam.ekaterina_starodubova.java.lesson2.Train;

import com.epam.ekaterina_starodubova.java.lesson2.PublicTransport;

public class GroundTrain extends PublicTransport {
    public GroundTrain(String mark, int yearOfProduction, int fuelOutGo) {
        super(mark, yearOfProduction, fuelOutGo);
    }

    public int costOfPublicTransport() {
        int groundTrain = 250;
        System.out.println("Cost of Ground Train " + groundTrain);
        return groundTrain;
    }

    @Override
    public int costOfTicketTransport() {
        return 25;
    }

    @Override
    public boolean workable() {
        return true;
    }
}
