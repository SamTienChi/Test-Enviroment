package schema;

public class Food extends Menu{

    private int quantity;

    public Food(String name, double price){
        super(name, price);
    }

    @Override
    public double calculatePrice(int quantity) {
        return quantity * price;
    }
}
