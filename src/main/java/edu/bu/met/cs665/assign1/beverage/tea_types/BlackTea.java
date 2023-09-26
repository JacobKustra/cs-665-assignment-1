package edu.bu.met.cs665.assign1.beverage.tea_types;

import edu.bu.met.cs665.assign1.beverage.Tea;
/**
 * This is the BlackTea class.
 */

public class BlackTea extends Tea {

  /**
   * A BlackTea method to set up basic profile for the Black Tea Beverage.
   */
  public BlackTea() {
    super();
    this.setDrinkName("Black Tea");
    this.setDrinkSize(0);
    this.setBrewTime(120);
  }
}
