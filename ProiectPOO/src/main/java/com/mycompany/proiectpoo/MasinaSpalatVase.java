/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author stefan
 */


public class MasinaSpalatVase extends EchipamentElectrocasnic {
    private int capacitateSeturi; // Numărul de seturi de vase
    private int numarPrograme;    // Numărul de programe disponibile

    // Constructor fără argumente
    public MasinaSpalatVase() {
        super();
        this.capacitateSeturi = 0;
        this.numarPrograme = 0;
    }

    // Constructor cu argumente
    public MasinaSpalatVase(String brand, double putere, double pret, int capacitateSeturi, int numarPrograme) {
        super(brand, putere, pret);
        this.capacitateSeturi = capacitateSeturi;
        this.numarPrograme = numarPrograme;
    }

    // Constructor de copiere
    public MasinaSpalatVase(MasinaSpalatVase other) {
        super(other);
        this.capacitateSeturi = other.capacitateSeturi;
        this.numarPrograme = other.numarPrograme;
    }

    // toString
    @Override
    public String toString() {
        return "MasinaDeSpalatVase{" +
                super.toString() +
                ", capacitateSeturi=" + capacitateSeturi +
                " seturi, numarPrograme=" + numarPrograme +
                '}';
    }

    // Getteri și setteri
    public int getCapacitateSeturi() {
        return capacitateSeturi;
    }

    public void setCapacitateSeturi(int capacitateSeturi) {
        this.capacitateSeturi = capacitateSeturi;
    }

    public int getNumarPrograme() {
        return numarPrograme;
    }

    public void setNumarPrograme(int numarPrograme) {
        this.numarPrograme = numarPrograme;
    }
}