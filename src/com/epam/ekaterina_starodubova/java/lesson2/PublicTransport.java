package com.epam.ekaterina_starodubova.java.lesson2;

public abstract class PublicTransport implements PublicAbleTransport {
    private String mark;
    private int yearOfProduction;
    private int fuelOutGo;

    public PublicTransport(String mark, int yearOfProduction, int fuelOutGo) {
        this.mark = mark;
        this.yearOfProduction = yearOfProduction;
        this.fuelOutGo = fuelOutGo;
    }

    protected abstract int costOfPublicTransport();

    protected int getFuelOutGo() {
        return this.fuelOutGo;
    }

    protected int getYear() {
        return this.yearOfProduction;
    }

    protected void getTransport() {
        System.out.println(this.mark + " " + this.yearOfProduction + " " + this.fuelOutGo);
    }
}
