package edu.bu.met.cs665.assign1.beverage.tea_types;

import edu.bu.met.cs665.assign1.beverage.Tea;
/**
 * This is the GreenTea class.
 */

public class GreenTea extends Tea {

  /**
   * A GreenTea method to set up basic profile for the Green Tea Beverage.
   */
  public GreenTea() {
    super();
    this.setDrinkName("Green Tea");
    this.setDrinkSize(0);
    this.setBrewTime(120);
  }
}
