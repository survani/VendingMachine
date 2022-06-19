package com.techelevator;

import com.techelevator.view.Menu;

import java.io.PrintWriter;
import java.util.Scanner;

public class MainMenuProcessor extends MenuProcessor{
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };


    protected MainMenuProcessor(VendingMachine WelcomeToTheMachine, Menu menu, PrintWriter console, Scanner userInput) {
        super(WelcomeToTheMachine, menu, console, userInput);
    }

    @Override
    public void run() {
        PurchaseMenuProcessor purchaseMenuProcessor = new PurchaseMenuProcessor(WelcomeToTheMachine, menu, console, userInput);
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                console.println();
                displayItems();
            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                purchaseMenuProcessor.run();
            } else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
                break;
            }
        }

    }
}