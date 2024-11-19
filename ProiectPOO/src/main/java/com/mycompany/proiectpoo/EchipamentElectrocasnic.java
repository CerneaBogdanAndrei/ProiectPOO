package com.mycompany.proiectpoo;

public class EchipamentElectrocasnic {
    private String brand;
    private double putere; // puterea în Watts
    private double pret;

    // Constructor fără argumente
    public EchipamentElectrocasnic() {
        this.brand = "Necunoscut";
        this.putere = 0.0;
        this.pret = 0.0;
    }

    // Constructor cu argumente
    public EchipamentElectrocasnic(String brand, double putere, double pret) {
        this.brand = brand;
        this.putere = putere;
        this.pret = pret;
    }

    // Constructor de copiere
    public EchipamentElectrocasnic(EchipamentElectrocasnic other) {
        this.brand = other.brand;
        this.putere = other.putere;
        this.pret = other.pret;
    }

    // toString
    @Override
    public String toString() {
        return "EchipamentElectrocasnic{" +
                "brand='" + brand + '\'' +
                ", putere=" + putere +
                "W, pret=" + pret +
                " RON}";
    }

    // Getteri și setteri
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPutere() {
        return putere;
    }

    public void setPutere(double putere) {
        this.putere = putere;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}