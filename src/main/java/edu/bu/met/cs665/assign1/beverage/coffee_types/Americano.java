package edu.bu.met.cs665.assign1.beverage.coffee_types;

import edu.bu.met.cs665.assign1.beverage.Coffee;

/**
 * This is the Americano class.
 */
public class Americano extends Coffee {
  /**
   * A Americano method to set up basic profile for the Americano Beverage.
   */
  public Americano() {
    super();
    this.setDrinkName("Americano");
    this.setDrinkSize(0);
    this.setBrewTime(100);
  }
}
