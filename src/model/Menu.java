package model;

public abstract class Menu {
    protected String name;
    protected double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }

    public abstract String getType();
}
