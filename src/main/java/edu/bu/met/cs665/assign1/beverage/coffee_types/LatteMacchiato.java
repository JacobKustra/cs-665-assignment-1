package edu.bu.met.cs665.assign1.beverage.coffee_types;

import edu.bu.met.cs665.assign1.beverage.Coffee;

/**
 * This is the LatteMacchiato class.
 */

public class LatteMacchiato extends Coffee {
  /**
   * A LatteMacchiato method to set up basic profile for the Latte Macchiato Beverage.
   */
  public LatteMacchiato() {
    super();
    this.setDrinkName("Latte Macchiato");
    this.setDrinkSize(0);
    this.setBrewTime(200);
  }
}
