package edu.bu.met.cs665.assign1.machine;

import edu.bu.met.cs665.assign1.beverage.Beverage;
import edu.bu.met.cs665.assign1.beverage.coffee_types.Americano;
import edu.bu.met.cs665.assign1.beverage.coffee_types.Espresso;
import edu.bu.met.cs665.assign1.beverage.coffee_types.LatteMacchiato;
import edu.bu.met.cs665.assign1.beverage.tea_types.BlackTea;
import edu.bu.met.cs665.assign1.beverage.tea_types.GreenTea;
import edu.bu.met.cs665.assign1.beverage.tea_types.YellowTea;
import java.util.Scanner;


/**
 * This is the DrinkMenu class.
 */
public class DrinkMenu {
  public String name;
  public String size;
  public int brewTime;
  public int brewMultiplier;


  /**
   * This is the DrinkMenu method which checks which beverage is to be made.
   */
  public DrinkMenu() {
    System.out.println("Do you want Coffee or Tea?");
    System.out.println("Please select 1 for Coffee or 2 for Tea?");

    Scanner userInputMenu = new Scanner(System.in);

    while (true) {
      while (!userInputMenu.hasNextInt()) {
        System.out.println("Invalid input, please try again!");
        userInputMenu.nextLine();
      }
      int firstInput = userInputMenu.nextInt();
      if (firstInput == 1) {
        System.out.println("You have selected " + firstInput + " for Coffee.");
        coffeeMenu();
        break;
      } else if (firstInput == 2) {
        System.out.println("You have selected " + firstInput + " for Tea.");
        teaMenu();
        break;
      } else {
        System.out.println("Invalid input, please try again!");
      }
    }
  }

  /**
   * This is the coffeeMenu method which checks which coffee beverage
   * is to be made and what size it will be along
   * with what the brew time will be for the beverage itself.
   */

  private void coffeeMenu() {
    System.out.println("\nPlease select 1 for Americano, 2 for Espresso or 3 for Latte Macchiato?");
    Scanner userInputMenu = new Scanner(System.in);
    while (true) {
      while (!userInputMenu.hasNextInt()) {
        System.out.println("Invalid input, please try again!");
        userInputMenu.nextLine();
      }
      int secondInput = userInputMenu.nextInt();
      if (secondInput == 1) {
        System.out.println("You have selected " + secondInput + " for Americano.");
        Americano americanoDrink = new Americano();
        sizeSelection(americanoDrink);
        this.name = "Americano";
        this.brewTime = americanoDrink.getBrewTime();
        break;
      } else if (secondInput == 2) {
        System.out.println("You have selected " + secondInput + " for Espresso.");
        Espresso espressoDrink = new Espresso();
        sizeSelection(espressoDrink);
        this.name = "Espresso";
        this.brewTime = espressoDrink.getBrewTime();
        break;
      } else if (secondInput == 3) {
        System.out.println("You have selected " + secondInput + " for Latte Macchiato.");
        LatteMacchiato latteMacchiatoDrink = new LatteMacchiato();
        sizeSelection(latteMacchiatoDrink);
        this.name = "Latte Macchiato";
        this.brewTime = latteMacchiatoDrink.getBrewTime();
        break;
      } else {
        System.out.println("Invalid input, please try again!");
      }
    }
  }

  /**
   * This is the teaMenu method which checks which tea beverage
   * is to be made and what size it will be along
   * with what the brew time will be for the beverage itself.
   */
  private void teaMenu() {
    System.out.println("\nPlease select 1 for Black Tea, 2 for Green Tea or 3 for Yellow Tea?");
    Scanner userInputMenu = new Scanner(System.in);
    while (true) {
      while (!userInputMenu.hasNextInt()) {
        System.out.println("Invalid input, please try again!");
        userInputMenu.nextLine();
      }
      int secondInput = userInputMenu.nextInt();
      if (secondInput == 1) {
        System.out.println("You have selected " + secondInput + " for Black Tea.");
        BlackTea blackTeaDrink = new BlackTea();
        sizeSelection(blackTeaDrink);
        this.name = "Black Tea";
        this.brewTime = blackTeaDrink.getBrewTime();
        break;
      } else if (secondInput == 2) {
        System.out.println("You have selected " + secondInput + " for Green Tea.");
        GreenTea greenTeaDrink = new GreenTea();
        sizeSelection(greenTeaDrink);
        this.name = "Green Tea";
        this.brewTime = greenTeaDrink.getBrewTime();
        break;
      } else if (secondInput == 3) {
        System.out.println("You have selected " + secondInput + " for Yellow Tea.");
        YellowTea yellowTeaDrink = new YellowTea();
        sizeSelection(yellowTeaDrink);
        this.name = "Yellow Tea";
        this.brewTime = yellowTeaDrink.getBrewTime();
        break;
      } else {
        System.out.println("Invalid input, please try again!");
      }
    }
  }

  /**
   * This is the sizeSelection method which checks
   * what size the beverage will be along with what the brew time
   * multiplier will be for the beverages size.
   */
  private void sizeSelection(Beverage drink) {
    if (drink.getDrinkSize() == 0) {
      System.out.println("\nWhat size would you like your drink to be?");
      System.out.println("Press 1 for 8oz, 2 for 12oz, and 3 for 16oz?");
      Scanner userInputMenu = new Scanner(System.in);
      while (true) {
        while (!userInputMenu.hasNextInt()) {
          System.out.println("Invalid input, please try again!");
          userInputMenu.nextLine();
        }
        int sizeInput = userInputMenu.nextInt();
        if (sizeInput == 1) {
          System.out.println("You have selected 8oz for your drink size.");
          this.size = "8";
          this.brewMultiplier = 1;
          break;
        } else if (sizeInput == 2) {
          System.out.println("You have selected 12oz for your drink size.");
          this.size = "12";
          this.brewMultiplier = 2;
          break;
        } else if (sizeInput == 3) {
          System.out.println("You have selected 16oz for your drink size.");
          this.size = "16";
          this.brewMultiplier = 3;
          break;
        } else {
          System.out.println("Invalid input, please try again!");
        }
      }

    } else {
      System.out.println("\nYour drink will be " + drink.getDrinkSize() + "oz");
      this.size = String.valueOf(drink.getDrinkSize());
      this.brewMultiplier = 1;
    }
  }
}
