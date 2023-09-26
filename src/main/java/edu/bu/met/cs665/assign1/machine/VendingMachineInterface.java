package edu.bu.met.cs665.assign1.machine;

/**
 * This is the VendingMachineInterface class.
 */
public class VendingMachineInterface {

  /**
   * This is the VendingMachineInterface method take the
   * customer through the menu of selecting a drink and making
   * it to their desired specifications.
   */
  public VendingMachineInterface() {
    System.out.println("Hello and welcome to the Fully Automatic Beverage Vending "
            + "Machine created by Jacob Kustra");
    System.out.println("Please choose from the following menu options to brew a beverage.\n");

    DrinkMenu startMenu = new DrinkMenu();
    CondimentMenu startMenu2 = new CondimentMenu();
    System.out.println("\nBrewing your " + startMenu.size + "oz " + startMenu.name + " with "
            + startMenu2.milkNumber + " milk and " + startMenu2.sugarNumber + " sugar now.");
    int totalBrewTime = (startMenu.brewMultiplier * startMenu.brewTime) + startMenu2.addBrewTime;
    System.out.println("Please wait " + totalBrewTime + "ms, while you beverage brews.");
    try {
      Thread.sleep(totalBrewTime);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    System.out.println("\nFinished Brewing!");
    System.out.println("Please take your beverage, and enjoy your day.");
    System.out.println("Powering Off");
  }
}
