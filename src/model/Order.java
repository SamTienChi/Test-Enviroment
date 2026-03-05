package model;

public class Order extends Menu{
    protected int quantity;

    public Order(String name, double price, int quantity){
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String getType(){ return name; }
}
