package com.mycompany.proiectpoo;
import java.util.Random;

public class Testare2Vector {
    public static void main(String[] args) {
        Random random = new Random();

        // Vector pentru EchipamentElectrocasnic
        EchipamentElectrocasnic[] echipamente = new EchipamentElectrocasnic[10];
        String[] marciEchipamente = {"Philips", "Samsung", "LG", "Bosch", "Panasonic"};

        for (int i = 0; i < echipamente.length; i++) {
            String marca = marciEchipamente[random.nextInt(marciEchipamente.length)];
            int putere = 1000 + random.nextInt(2001); // între 1000 și 3000
            double pret = 200 + random.nextDouble() * 800; // între 200 și 1000
            echipamente[i] = new EchipamentElectrocasnic(marca, putere, Math.round(pret * 100.0) / 100.0);
        }

        // Vector pentru AerConditionat
        AerConditionat[] aerConditionat = new AerConditionat[10];
        String[] marciAer = {"Samsung", "Daikin", "Gree", "Midea", "Electrolux"};

        for (int i = 0; i < aerConditionat.length; i++) {
            String marca = marciAer[random.nextInt(marciAer.length)];
            int putere = 1200 + random.nextInt(2001); // între 1200 și 3200
            double pret = 1500 + random.nextDouble() * 1500; // între 1500 și 3000
            int capacitateBTU = 9000 + random.nextInt(12001); // între 9000 și 21000 BTU
            boolean inverter = random.nextBoolean();
            aerConditionat[i] = new AerConditionat(marca, putere, Math.round(pret * 100.0) / 100.0, capacitateBTU, inverter);
        }

        // Vector pentru Calorifer
        Calorifer[] calorifere = new Calorifer[10];
        String[] marciCalorifere = {"Delonghi", "Argo", "Zass", "Rowenta", "Heinner"};
        String[] tipuri = {"Pe ulei", "Electric", "Cu quartz", "Cu ventilator"};

        for (int i = 0; i < calorifere.length; i++) {
            String marca = marciCalorifere[random.nextInt(marciCalorifere.length)];
            int putere = 800 + random.nextInt(2201); // între 800 și 3000
            double pret = 100 + random.nextDouble() * 500; // între 100 și 600
            String tip = tipuri[random.nextInt(tipuri.length)];
            int sectiuni = 5 + random.nextInt(11); // între 5 și 15
            calorifere[i] = new Calorifer(marca, putere, Math.round(pret * 100.0) / 100.0, tip, sectiuni);
        }

        // Afisare vector EchipamentElectrocasnic
        System.out.println("Echipamente Electrocasnice:");
        for (EchipamentElectrocasnic echipament : echipamente) {
            System.out.println(echipament);
        }

        // Afisare vector AerConditionat
        System.out.println("\nAer Conditionat:");
        for (AerConditionat aer : aerConditionat) {
            System.out.println(aer);
        }

        // Afisare vector Calorifer
        System.out.println("\nCalorifere:");
        for (Calorifer calorifer : calorifere) {
            System.out.println(calorifer);
        }
    }
}
