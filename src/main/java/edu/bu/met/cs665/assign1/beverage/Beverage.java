package edu.bu.met.cs665.assign1.beverage;

/**
 * This is the Beverage class.
 */
public class Beverage {
  protected String drinkName;

  protected Integer drinkSize;

  protected Integer brewTime;

  /**
   * This is the setDrinkName method which sets the drinks name according to the string used.
   */
  public void setDrinkName(String drinkName) {
    this.drinkName = drinkName;
  }

  /**
   * This is the getDrinkName method which returns the drinks name.
   */
  public String getDrinkName() {
    return drinkName;
  }

  /**
   * This is the setDrinkSize method which sets the drinks size according to the integer used.
   */
  public void setDrinkSize(Integer drinkSize) {
    this.drinkSize = drinkSize;
  }

  /**
   * This is the getDrinkSize method which returns the drinks size.
   */
  public Integer getDrinkSize() {
    return drinkSize;
  }

  /**
   * This is the setBrewTime method which sets the drinks brew time according to the integer used.
   */
  public void setBrewTime(Integer brewTime) {
    this.brewTime = brewTime;
  }

  /**
   * This is the getBrewTime method which returns the brew time.
   */
  public Integer getBrewTime() {
    return brewTime;
  }
}
