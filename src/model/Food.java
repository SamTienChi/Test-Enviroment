package model;

public class Food extends Menu {

    public Food(String name, double price) {
        super(name, price);
    };

  @Override
  public String getType() { return "Food"; }
}
