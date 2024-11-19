package com.mycompany.proiectpoo;

public class AerConditionat extends EchipamentElectrocasnic {
    private double capacitateRacire; // capacitatea de răcire în BTU
    private boolean wifiControl;

    // Constructor fără argumente
    public AerConditionat() {
        super();
        this.capacitateRacire = 0.0;
        this.wifiControl = false;
    }

    // Constructor cu argumente
    public AerConditionat(String brand, double putere, double pret, double capacitateRacire, boolean wifiControl) {
        super(brand, putere, pret);
        this.capacitateRacire = capacitateRacire;
        this.wifiControl = wifiControl;
    }

    // Constructor de copiere
    public AerConditionat(AerConditionat other) {
        super(other);
        this.capacitateRacire = other.capacitateRacire;
        this.wifiControl = other.wifiControl;
    }

    // toString
    @Override
    public String toString() {
        return "AerConditionat{" +
                super.toString() +
                ", capacitateRacire=" + capacitateRacire +
                " BTU, wifiControl=" + wifiControl +
                '}';
    }

    // Getteri și setteri
    public double getCapacitateRacire() {
        return capacitateRacire;
    }

    public void setCapacitateRacire(double capacitateRacire) {
        this.capacitateRacire = capacitateRacire;
    }

    public boolean isWifiControl() {
        return wifiControl;
    }

    public void setWifiControl(boolean wifiControl) {
        this.wifiControl = wifiControl;
    }
}
