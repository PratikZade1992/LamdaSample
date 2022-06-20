package com.pz.data;

/** The type Bike. */
public class Bike {
    private String name;
    private String model;

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
        return name;
    }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

  /**
   * Sets model.
   *
   * @param model the model
   */
  public void setModel(String model) {
        this.model = model;
    }
}
