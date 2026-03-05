package schema;

public class Drink extends Menu{
    private int quantity;

    public Drink(String name, double price){
        super(name, price);
    }

    @Override
    public double calculatePrice(int quantity) {
        return quantity * price;
    }
}
