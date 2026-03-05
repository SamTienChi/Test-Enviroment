import model.Menu;
import model.Order;

import utils.validation;
import utils.MenuItem;
import utils.UpdateFile;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_5_OOP {
    public static void main(String[] args) throws Exception {
        //init
        Scanner scanner = new Scanner(System.in);
        ArrayList<Order> order = new ArrayList<>();
        UpdateFile myUpdate = new UpdateFile();
        MenuItem myMenu = new MenuItem();
        validation val = new validation();
        myMenu.initMenu();
        int n;


        do{
            System.out.println("------Main Menu------");
            System.out.println("0. Check the menu");
            System.out.println("1. Order food");
            System.out.println("2. Order drink");
            System.out.println("3. Calculate total");
            System.out.println("4. Update the menu");
            System.out.println("Other. Exit");
            System.out.print("+Choose your type: ");
            n = scanner.nextInt();
            switch(n){
                case 0:
                    myMenu.displayItem();
                    break;
                case 1:
                    try{
                        System.out.print("Enter your food: ");
                        String foodName = scanner.next();
                        int quantity = val.QuantityNum();
                        Menu data = myMenu.findItem(foodName, "Food");
                        if(data != null){
                            Order newOrder = new Order(data.getName(), data.getPrice(), quantity);
                            order.add(newOrder);
                        }else{
                            System.out.println("Cannot add the item does not exist");
                        }
                    }catch (Exception e){
                        throw new Exception(e);
                    };
                    break;
                case 2:
                    try{
                        System.out.print("Enter your drink: ");
                        String drinkName = scanner.next();
                        int quantity = val.QuantityNum();
                        Menu data = myMenu.findItem(drinkName, "Drink");
                        if(data != null){
                            Order newOrder = new Order(data.getName(), data.getPrice(), quantity);
                            order.add(newOrder);
                        }else{
                            System.out.println("Cannot add the item does not exist");
                        }
                    }catch (Exception e){
                        throw new Exception(e);
                    };
                    break;
                case 3:
                    try{
                        double total = 0;
                        System.out.println("-------------Bill--------------");
                        if(!order.isEmpty()) {
                            for (Order ord : order) {
                                total +=  (ord.getPrice() * ord.getQuantity());
                                System.out.println("--" + ord.getName() + "- $:" + ord.getPrice() + " - Quantity:" + ord.getQuantity());
                            }
                        }
                        System.out.println("Total bill: " + total);
                    }catch(Exception e){};
                    break;
                case 4:
                    try{
                        myUpdate.updateMenu();
                    }catch(Exception e){
                        System.out.println("An error occurred");
                        throw new Exception(e);
                    }
                    break;
                default:
                    System.out.println("Exit the Menu");
                    break;
            }
        }while(n > -1 && n < 5);
    }
}
