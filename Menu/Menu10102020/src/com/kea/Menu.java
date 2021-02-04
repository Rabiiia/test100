package com.kea;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Klasse til at håndtere menuer og spørgsmål
 * Det input der læses er en string
 */
public class Menu {
    /**
     * Indeholder alle de menu tekster der anvendes
     */
    public ArrayList<String> MenuTexts;

    /**
     * Valgt menupunkt afleveres som en tekst string og læses fra konsolen
     */
    public String SelectedMenuValue;

    /**
     * @param actionText Den tekst der skrives ved input fra konsol
     * @param menuTexts  De eller den menu tekst er står i programmet
     */
    public Menu(String actionText, String... menuTexts) {
        MenuTexts = new ArrayList<>(menuTexts.length);
        for (int i = 0; i < menuTexts.length; i++) {
            MenuTexts.add(menuTexts[i]);
        }
        performMenu(actionText);
    }

    /**
     * Viser menu tekst uden at spørger om input
     */
    public void showMenu() {
        for (String menuText : MenuTexts) {
            System.out.println(menuText + " ");
        }

        System.out.println();
    }

    /**
     * @param text Den tekst der skrives før input til valg af menupunkt
     * @return Det indtastede tekst afleveres som tekst
     */
    public String performMenu(String text) {
        showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        SelectedMenuValue = scanner.next();
        return SelectedMenuValue;
    }
}