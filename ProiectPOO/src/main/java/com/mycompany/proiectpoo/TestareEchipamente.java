/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author stefan
 */
package com.mycompany.proiectpoo;
import java.util.ArrayList;
import java.util.Random;

public class TestareEchipamente {
    public static void main(String[] args) {
        Random random = new Random();

        // ArrayList de obiecte de tip EchipamentElectrocasnic
        ArrayList<Object> echipamente = new ArrayList<>();

        // Crearea Mașinilor de Spălat Rufe
        for (int i = 0; i < 10; i++) {
            String brand = "Brand_" + (i + 1);
            int putere = 1000 + random.nextInt(1000); // între 1000 și 2000 W (fără zecimale)
            double pret = Math.round((1000 + random.nextDouble() * 1000) * 100.0) / 100.0; // între 1000 și 2000 RON (max 2 zecimale)
            double capacitateIncarcare = 5 + random.nextInt(6); // între 5 și 10 kg
            int numarPrograme = 10 + random.nextInt(6); // între 10 și 15 programe

            // Generarea valorii pentru clasaEnergetica
            String clasaEnergetica;
            int clasa = random.nextInt(3); // 0, 1, sau 2
            switch (clasa) {
                case 0:
                    clasaEnergetica = "A";
                    break;
                case 1:
                    clasaEnergetica = "A+";
                    break;
                case 2:
                    clasaEnergetica = "A++";
                    break;
                default:
                    clasaEnergetica = "A"; // Default, doar în caz de eroare
            }

            echipamente.add(new MasinaSpalatRufe(brand, putere, pret, capacitateIncarcare, numarPrograme, clasaEnergetica));
        }

        // Crearea Mașinilor de Spălat Vase
        for (int i = 10; i < 20; i++) {
            String brand = "Brand_" + (i + 1);
            int putere = 1200 + random.nextInt(1000); // între 1200 și 2200 W (fără zecimale)
            double pret = Math.round((1200 + random.nextDouble() * 1000) * 100.0) / 100.0; // între 1200 și 2200 RON (max 2 zecimale)
            int capacitateSeturi = 6 + random.nextInt(5); // între 6 și 10 seturi
            int numarPrograme = 5 + random.nextInt(5); // între 5 și 10 programe

            // Generarea valorii pentru clasaEnergetica
            String clasaEnergetica;
            int clasa = random.nextInt(3); // 0, 1, sau 2
            switch (clasa) {
                case 0:
                    clasaEnergetica = "A";
                    break;
                case 1:
                    clasaEnergetica = "A+";
                    break;
                case 2:
                    clasaEnergetica = "A++";
                    break;
                default:
                    clasaEnergetica = "A"; // Default, doar în caz de eroare
            }

            echipamente.add(new MasinaSpalatVase(brand, putere, pret, capacitateSeturi, numarPrograme));
        }

        // Afișare
        for (Object echipament : echipamente) {
            System.out.println(echipament.toString());
        }
    }
}