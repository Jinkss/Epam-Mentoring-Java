package com.epam.ekaterina_starodubova.java.lesson2;

import com.epam.ekaterina_starodubova.java.lesson2.Bus.ElectricBus;
import com.epam.ekaterina_starodubova.java.lesson2.Bus.PetrolBus;
import com.epam.ekaterina_starodubova.java.lesson2.Train.GroundTrain;
import com.epam.ekaterina_starodubova.java.lesson2.Train.UndergroungTrain;

import java.util.Scanner;

public class GeneratePublicTransport {

    public static void main(String[] args) {

        PublicTransport[] transport = generateTransport();
        int generalCost = countOfCostTransport(transport);
        sortParkByFuel(transport);
        findTransport(transport);
    }

    private static PublicTransport[] generateTransport() {
        ElectricBus electricBus = new ElectricBus("Tesla", 1990, 0);
        PetrolBus petrolBusMerc = new PetrolBus("Merc", 1995, 10);
        PetrolBus petrolBusMitsubisi = new PetrolBus("Mitsubisi", 1995, 4);
        PetrolBus petrolBusMazda = new PetrolBus("Mazda", 1995, 8);
        GroundTrain groundTrain = new GroundTrain("MetroTram", 1960, 0);
        UndergroungTrain undergroungTrain = new UndergroungTrain("Moscow", 2000, 0);
        PublicTransport[] publicTransports = new PublicTransport[6];
        publicTransports[0] = electricBus;
        publicTransports[1] = petrolBusMazda;
        publicTransports[2] = groundTrain;
        publicTransports[3] = undergroungTrain;
        publicTransports[4] = petrolBusMerc;
        publicTransports[5] = petrolBusMitsubisi;
        return publicTransports;
    }

    private static int countOfCostTransport(PublicTransport[] publicTransports) {
        int generalCost = 0;

        for (PublicTransport transport : publicTransports) {
            generalCost = generalCost + transport.costOfPublicTransport();
        }
        System.out.println("General cost " + generalCost);
        return generalCost;
    }

    private static void sortParkByFuel(PublicTransport[] publicTransports) {
        System.out.println("Sort by fuel");

        for (int i = 0; i < publicTransports.length; i++) {
            for (int j = i + 1; j < publicTransports.length; j++) {
                if (publicTransports[i].getFuelOutGo() > publicTransports[j].getFuelOutGo()) {
                    PublicTransport temp = publicTransports[i];
                    publicTransports[i] = publicTransports[j];
                    publicTransports[j] = temp;
                }
            }
        }

        for (int i = 0; i < publicTransports.length; i++) {
            publicTransports[i].getTransport();
        }
    }

    private static void findTransport(PublicTransport[] publicTransports) {
        System.out.println("Введите диапазон лет: ");
        Scanner scanner = new Scanner(System.in);
        int startYear = Integer.parseInt(scanner.nextLine());
        int endYear = Integer.parseInt(scanner.nextLine());

        for (PublicTransport transport : publicTransports) {
            if (startYear <= transport.getYear() && transport.getYear() <= endYear) {
                System.out.println("Найденный транспорт ");
                transport.getTransport();
            }
        }
    }

}
