/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author stefan
 */


public class MasinaSpalatRufe extends EchipamentElectrocasnic {
    private double capacitateIncarcare; // Capacitatea de încărcare în kg
    private int numarPrograme;         // Numărul de programe disponibile
    private String clasaEnergetica;    // Clasa energetică (ex. A+++, A++, etc.)

    // Constructor fără argumente
    public MasinaSpalatRufe() {
        super();
        this.capacitateIncarcare = 0.0;
        this.numarPrograme = 0;
        this.clasaEnergetica = "Necunoscut";
    }

    // Constructor cu toate argumentele
    public MasinaSpalatRufe(String brand, double putere, double pret, double capacitateIncarcare, int numarPrograme, String clasaEnergetica) {
        super(brand, putere, pret);
        this.capacitateIncarcare = capacitateIncarcare;
        this.numarPrograme = numarPrograme;
        this.clasaEnergetica = clasaEnergetica;
    }

    // Constructor de copiere
    public MasinaSpalatRufe(MasinaSpalatRufe other) {
        super(other);
        this.capacitateIncarcare = other.capacitateIncarcare;
        this.numarPrograme = other.numarPrograme;
        this.clasaEnergetica = other.clasaEnergetica;
    }

    // toString
    @Override
    public String toString() {
        return "MasinaDeSpalatRufe{" +
                super.toString() +
                ", capacitateIncarcare=" + capacitateIncarcare +
                " kg, numarPrograme=" + numarPrograme +
                ", clasaEnergetica='" + clasaEnergetica + '\'' +
                '}';
    }

    // Getteri și setteri
    public double getCapacitateIncarcare() {
        return capacitateIncarcare;
    }

    public void setCapacitateIncarcare(double capacitateIncarcare) {
        this.capacitateIncarcare = capacitateIncarcare;
    }

    public int getNumarPrograme() {
        return numarPrograme;
    }

    public void setNumarPrograme(int numarPrograme) {
        this.numarPrograme = numarPrograme;
    }

    public String getClasaEnergetica() {
        return clasaEnergetica;
    }

    public void setClasaEnergetica(String clasaEnergetica) {
        this.clasaEnergetica = clasaEnergetica;
    }
}