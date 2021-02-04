package com.kea;

public class Main {
    public static void main(String[] args) {
        // Opret menu tekster og set værdier
        String[] myMenuTexts = {"1. Menu 1", "2. Menu 2", "3. Menu 3"};
        // Opret Menu og kald konstruktor
        Menu menu = new Menu("Input : ", myMenuTexts);
        // Udskriv valgt menu punkt fra Scanner tekst
        System.out.println("Selected menu: " + menu.SelectedMenuValue);
        // Swich / case på det valgte menupunkt
        switch (menu.SelectedMenuValue) {
            case "1": {   // Hvis du skriver 1
                System.out.println("case Call methode 0");
            }
            break;
            default: {   // Hvis du skriver alt andet end de cases der ellers findes
                System.out.println("Default case");
            }
            break;
        }
    }
}
