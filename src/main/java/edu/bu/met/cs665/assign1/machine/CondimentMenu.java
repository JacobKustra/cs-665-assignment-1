package edu.bu.met.cs665.assign1.machine;

import edu.bu.met.cs665.assign1.condiment.condiment_types.Milk;
import edu.bu.met.cs665.assign1.condiment.condiment_types.Sugar;
import java.util.Scanner;

/**
 * This is the CondimentMenu class.
 */
public class CondimentMenu {
  public int milkNumber;
  public int sugarNumber;
  public int addBrewTime;

  /**
   * This is the CondimentMenu method which checks if any condiments are
   * added into the beverage and how much
   * additional brew time will be added for that.
   */
  public CondimentMenu() {
    System.out.println("\nWould you like to add any condiments?");
    System.out.println("Please select 1 for Yes or 2 for No?");
    Scanner userInputMenu = new Scanner(System.in);

    while (true) {
      while (!userInputMenu.hasNextInt()) {
        System.out.println("Invalid input, please try again!");
        userInputMenu.nextLine();
      }
      int firstInput = userInputMenu.nextInt();
      if (firstInput == 1) {
        System.out.println("You have selected " + firstInput + " to add condiments.");
        addMilk();
        addSugar();
        break;
      } else if (firstInput == 2) {
        System.out.println("You have selected " + firstInput + " to not add condiments.");
        break;
      } else {
        System.out.println("Invalid input, please try again!");
      }
    }
    Milk milk = new Milk();
    Sugar sugar = new Sugar();
    this.addBrewTime = (this.milkNumber * milk.getAddBrewTime())
            + (this.sugarNumber * sugar.getAddBrewTime());

  }

  /**
   * This is the addMilk method which checks if milk is to be added
   * into the beverage and how much milk exactly.
   */
  public void addMilk() {
    System.out.println("\nWould you like to add milk?");
    System.out.println("Please select 1 for Yes or 2 for No?");
    Scanner userInputMenu = new Scanner(System.in);

    while (true) {
      while (!userInputMenu.hasNextInt()) {
        System.out.println("Invalid input, please try again!");
        userInputMenu.nextLine();
      }
      int firstInput = userInputMenu.nextInt();
      if (firstInput == 1) {
        System.out.println("You have selected " + firstInput + " to add milk.");
        System.out.println("\nHow many would you like to add?");
        System.out.println("Select 0-3 for the amount of milk you would like?");
        while (true) {
          while (!userInputMenu.hasNextInt()) {
            System.out.println("Invalid input, please try again!");
            userInputMenu.nextLine();
          }
          int secondInput = userInputMenu.nextInt();
          if (secondInput == 0) {
            System.out.println("You have selected " + secondInput + " milk.");
            this.milkNumber = 0;
            break;
          } else if (secondInput == 1) {
            System.out.println("You have selected " + secondInput + " milk.");
            this.milkNumber = 1;
            break;
          } else if (secondInput == 2) {
            System.out.println("You have selected " + secondInput + " milks.");
            this.milkNumber = 2;
            break;
          } else if (secondInput == 3) {
            System.out.println("You have selected " + secondInput + " milks.");
            this.milkNumber = 3;
            break;
          } else {
            System.out.println("Invalid input, please try again!");
          }
        }
        break;
      } else if (firstInput == 2) {
        System.out.println("You have selected " + firstInput + " to not add milk.");
        this.milkNumber = 0;
        break;
      } else {
        System.out.println("Invalid input, please try again!");
      }
    }
  }

  /**
   * This is the addSugar method which checks if sugar is to be
   * added into the beverage and how much sugar exactly.
   */
  public void addSugar() {
    System.out.println("\nWould you like to add sugar?");
    System.out.println("Please select 1 for Yes or 2 for No?");
    Scanner userInputMenu = new Scanner(System.in);

    while (true) {
      while (!userInputMenu.hasNextInt()) {
        System.out.println("Invalid input, please try again!");
        userInputMenu.nextLine();
      }
      int firstInput = userInputMenu.nextInt();
      if (firstInput == 1) {
        System.out.println("You have selected " + firstInput + " to add sugar.");
        System.out.println("\nHow many would you like to add?");
        System.out.println("Select 0-3 for the amount of sugar you would like?");
        while (true) {
          while (!userInputMenu.hasNextInt()) {
            System.out.println("Invalid input, please try again!");
            userInputMenu.nextLine();
          }
          int secondInput = userInputMenu.nextInt();
          if (secondInput == 0) {
            System.out.println("You have selected " + secondInput + " sugar.");
            this.sugarNumber = 0;
            break;
          } else if (secondInput == 1) {
            System.out.println("You have selected " + secondInput + " sugar.");
            this.sugarNumber = 1;
            break;
          } else if (secondInput == 2) {
            System.out.println("You have selected " + secondInput + " sugar.");
            this.sugarNumber = 2;
            break;
          } else if (secondInput == 3) {
            System.out.println("You have selected " + secondInput + " sugar.");
            this.sugarNumber = 3;
            break;
          } else {
            System.out.println("Invalid input, please try again!");
          }
        }
        break;
      } else if (firstInput == 2) {
        System.out.println("You have selected " + firstInput + " to not add sugar.");
        this.sugarNumber = 0;
        break;
      } else {
        System.out.println("Invalid input, please try again!");
      }
    }
  }
}
