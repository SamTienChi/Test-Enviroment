import schema.Food;
import schema.Drink;
import schema.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_4_OOP {
    public static void main(String[] args){
        ArrayList<Menu> menuListFood = new ArrayList<>();
        ArrayList<Menu> menuListDrink = new ArrayList<>();
        ArrayList<Menu> menuOrder = new ArrayList<>();
        //Dummy data
        menuListFood.add(new Food("Fried Chicken", 20.000));
        menuListFood.add(new Food("Fried Fish", 25.000));
        menuListFood.add(new Food("Fried stick", 10.000));

        menuListDrink.add(new Drink("Bottle of Water", 10.000));
        menuListDrink.add(new Drink("Sparking soda", 15.000));
        menuListDrink.add(new Drink("Sunrise Sweet",35.000));

        Scanner scanner = new Scanner(System.in);
        int n;
        do{
           System.out.println("Menu");
           System.out.println("1. Food");
           System.out.println("2. Drink");
           System.out.println("3. Calculate total");
           System.out.println("4. Exit");
           System.out.print("+Choose your type: ");
            n = scanner.nextInt();
           switch(n){
               case 1:
                   int choice;
                   for(int i = 0; i < menuListFood.size(); i++){
                       System.out.println((i + 1) + ". " + menuListFood.get(i).getName() + " - $" + menuListFood.get(i).getPrice());;
                   };
                   choice = scanner.nextInt();
                   if(choice > 0 || choice <= menuListFood.size()){
                       menuOrder.add(new Food(menuListFood.get(choice-1).getName(), menuListFood.get(choice-1).getPrice()));
                       System.out.println("Add item success for: " + menuListFood.get(choice-1).getName());
                   }else{
                       System.out.println("Fail to add item");
                   }
                   break;
               case 2:
                   int choice_2;
                   for(int i = 0; i < menuListDrink.size(); i++){
                       System.out.println((i + 1) + ". " + menuListDrink.get(i).getName() + " - $" + menuListDrink.get(i).getPrice());;
                   };
                   choice_2 = scanner.nextInt();
                   if(choice_2 > 0 || choice_2 <= menuListDrink.size()){
                       menuOrder.add(new Food(menuListDrink.get(choice_2-1).getName(), menuListDrink.get(choice_2-1).getPrice()));
                       System.out.println("Add item success for: " + menuListDrink.get(choice_2-1).getName());
                   }else{
                       System.out.println("Fail to add item");
                   }
                   break;
               case 3:
                   if(menuOrder.isEmpty()){
                       System.out.println("Cart is empty");
                   }else{
                       double total = 0;
                       for(int i = 0; i < menuOrder.size(); i++){
                           System.out.println("No. "+ i + menuOrder.get(i).getPrice());
                           total += menuOrder.get(i).getPrice();
                       }
                       System.out.println("Total bill is: " + total);

                   }
                   break;
               default:
                   System.out.println("Exit 0");
                   break;
           }
        }while(n > 0 && n < 4);
    };
}
