package com.mycompany.proiectpoo;

import java.util.ArrayList;
import java.util.Random;

public class Testare2Cernea {
    public static void main(String[] args) {
        Random random = new Random();

        // ArrayList de obiecte de tip EchipamentElectrocasnic
        ArrayList<Object> echipamente = new ArrayList<>();

        // Crearea obiectelor de tip EchipamentElectrocasnic
        for (int i = 0; i < 10; i++) {
            String brand = "Brand_" + (i + 1);
            int putere = 1000 + random.nextInt(2000); // între 1000 și 3000 W
            double pret = Math.round((200 + random.nextDouble() * 800) * 100.0) / 100.0; // între 200 și 1000 RON

            echipamente.add(new EchipamentElectrocasnic(brand, putere, pret));
        }

        // Crearea obiectelor de tip AerConditionat
        for (int i = 0; i < 10; i++) {
            String brand = "Aer_" + (i + 1);
            int putere = 1200 + random.nextInt(2000); // între 1200 și 3200 W
            double pret = Math.round((1500 + random.nextDouble() * 1500) * 100.0) / 100.0; // între 1500 și 3000 RON
            int capacitateBTU = 9000 + random.nextInt(12000); // între 9000 și 21000 BTU
            boolean inverter = random.nextBoolean();

            echipamente.add(new AerConditionat(brand, putere, pret, capacitateBTU, inverter));
        }

        // Crearea obiectelor de tip Calorifer
        for (int i = 0; i < 10; i++) {
            String brand = "Calorifer_" + (i + 1);
            int putere = 800 + random.nextInt(2200); // între 800 și 3000 W
            double pret = Math.round((100 + random.nextDouble() * 500) * 100.0) / 100.0; // între 100 și 600 RON
            String tip = random.nextBoolean() ? "Pe ulei" : "Electric"; // Tip aleator
            int sectiuni = 5 + random.nextInt(11); // între 5 și 15 secțiuni

            echipamente.add(new Calorifer(brand, putere, pret, tip, sectiuni));
        }

        // Afișare
        System.out.println("Lista echipamentelor generate:\n");
        for (Object echipament : echipamente) {
            System.out.println(echipament.toString());
        }
    }
}
