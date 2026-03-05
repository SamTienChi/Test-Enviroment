package utils;
import java.util.Scanner;
public class validation {
    public int QuantityNum() {
        Scanner sc = new Scanner(System.in);
        int quantity;
        while (true) {
            try {
                System.out.print("Enter quantity: ");
                quantity = Integer.parseInt(sc.nextLine());

                if (quantity > 0) {
                    return quantity;
                }else if(quantity < 11){
                    System.out.println("Quantity must be less than 11.");
                } else {
                    System.out.println("Quantity must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
