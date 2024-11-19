package com.mycompany.proiectpoo;

public class Calorifer extends EchipamentElectrocasnic {
    private String tip; // de exemplu: electric, pe ulei
    private int numarElemente;

    // Constructor fără argumente
    public Calorifer() {
        super();
        this.tip = "Necunoscut";
        this.numarElemente = 0;
    }

    // Constructor cu argumente
    public Calorifer(String brand, double putere, double pret, String tip, int numarElemente) {
        super(brand, putere, pret);
        this.tip = tip;
        this.numarElemente = numarElemente;
    }

    // Constructor de copiere
    public Calorifer(Calorifer other) {
        super(other);
        this.tip = other.tip;
        this.numarElemente = other.numarElemente;
    }

    //toString
    @Override
    public String toString() {
        return "Calorifer{" +
                super.toString() +
                ", tip='" + tip + '\'' +
                ", numarElemente=" + numarElemente +
                '}';
    }

    // Getteri și setteri
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getNumarElemente() {
        return numarElemente;
    }

    public void setNumarElemente(int numarElemente) {
        this.numarElemente = numarElemente;
    }
}