package edu.bu.met.cs665.assign1.condiment;

/**
 * This is the Condiment class.
 */
public class Condiment {
  public int additionalBrewTime;

  /**
   * This is the setAddBrewTime method which sets the brew time according to the integer used
   * for condiments.
   */
  public void setAddBrewTime(Integer additionalBrewTime) {
    this.additionalBrewTime = additionalBrewTime;
  }

  /**
   * This is the getAddBrewTime method which returns the additional brew time from
   * adding condiments.
   */
  public Integer getAddBrewTime() {
    return additionalBrewTime;
  }
}
