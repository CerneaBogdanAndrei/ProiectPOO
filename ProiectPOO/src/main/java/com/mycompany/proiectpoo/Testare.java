package com.mycompany.proiectpoo;

public class testare {
    public static void main(String[] args) {
        // Testăm EchipamentElectrocasnic
        EchipamentElectrocasnic echipament = new EchipamentElectrocasnic("Philips", 2000, 400.5);
        System.out.println(echipament);

        // Testăm AerConditionat
        AerConditionat aer = new AerConditionat("Samsung", 1800, 1500, 12000, true);
        System.out.println(aer);

        // Testăm Calorifer
        Calorifer calorifer = new Calorifer("Delonghi", 2500, 700, "Pe ulei", 12);
        System.out.println(calorifer);
    }
}
