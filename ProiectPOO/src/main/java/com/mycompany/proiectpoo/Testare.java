/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author stefan
 */


public class Testare {
    public static void main(String[] args) {
        // Testăm EchipamentElectrocasnic
        EchipamentElectrocasnic echipament = new EchipamentElectrocasnic("Philips", 2000, 399);
        System.out.println(echipament);

        // Testăm MasinaSpalatVase
        MasinaSpalatRufe masina = new MasinaSpalatRufe("Bosch", 1500, 2500, 8, 15, "A+++");
        System.out.println(masina);

        // Testăm MasinaSpalatRufe
        MasinaSpalatVase masinaVase = new MasinaSpalatVase("Bosch", 1200, 3000, 12, 6);
        System.out.println(masinaVase);
    }
}