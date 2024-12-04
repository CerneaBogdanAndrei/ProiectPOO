package com.mycompany.proiectpoo;

import java.util.ArrayList;
import java.util.Random;

public class TestareEchipamente2 {
    public static void main(String[] args) {
        Random random = new Random();

        
        ArrayList<Object> echipamente = new ArrayList<>();

        
        for (int i = 0; i < 10; i++) {
            String brand = "Aer_" + (i + 1);
            int putere = 1200 + random.nextInt(2000); 
            double pret = Math.round((1500 + random.nextDouble() * 1500) * 100.0) / 100.0; 
            int capacitateBTU = 9000 + random.nextInt(12000); 
            boolean inverter = random.nextBoolean();

            echipamente.add(new AerConditionat(brand, putere, pret, capacitateBTU, inverter));
        }

        
        for (int i = 10; i < 20; i++) {
            String brand = "Calorifer_" + (i + 1);
            int putere = 800 + random.nextInt(2200); 
            double pret = Math.round((100 + random.nextDouble() * 500) * 100.0) / 100.0; 
            String tip = random.nextBoolean() ? "Pe ulei" : "Electric"; 
            int sectiuni = 5 + random.nextInt(11); 

            echipamente.add(new Calorifer(brand, putere, pret, tip, sectiuni));
        }

        
        System.out.println("\n Parcurgerea aparatelor de Aer Conditionat 1");
        for (int i = 0; i < echipamente.size(); i++) {
            if (echipamente.get(i) instanceof AerConditionat) {
                AerConditionat aer = (AerConditionat) echipamente.get(i);
                System.out.println(aer.toString());
            }
        }

        
        System.out.println("\n Parcurgerea aparatelor de Aer Conditionat 2");
        for (Object echipament : echipamente) {
            if (echipament instanceof AerConditionat) {
                AerConditionat aer = (AerConditionat) echipament;
                System.out.println(aer.toString());
            }
        }

        
        System.out.println("\n Parcurgerea caloriferelor 1");
        for (int i = 0; i < echipamente.size(); i++) {
            if (echipamente.get(i) instanceof Calorifer) {
                Calorifer calorifer = (Calorifer) echipamente.get(i);
                System.out.println(calorifer.toString());
            }
        }

        
        System.out.println("\n Parcurgerea caloriferelor 2");
        for (Object echipament : echipamente) {
            if (echipament instanceof Calorifer) {
                Calorifer calorifer = (Calorifer) echipament;
                System.out.println(calorifer.toString());
            }
        }
    }
}
