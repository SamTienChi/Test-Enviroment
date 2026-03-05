package model;

public class Drink extends Menu{

    public Drink(String name, double price){
        super(name, price);
    }

    @Override
    public String getType() { return "Drink"; }
}
