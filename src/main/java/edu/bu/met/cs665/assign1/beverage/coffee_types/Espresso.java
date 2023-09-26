package edu.bu.met.cs665.assign1.beverage.coffee_types;

import edu.bu.met.cs665.assign1.beverage.Coffee;

/**
 * This is the Espresso class.
 */
public class Espresso extends Coffee {
  /**
   * A Espresso method to set up basic profile for the Espresso Beverage.
   */
  public Espresso() {
    super();
    this.setDrinkName("Espresso");
    this.setDrinkSize(2);
    this.setBrewTime(60);

  }
}
