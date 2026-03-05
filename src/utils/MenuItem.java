package utils;

import model.Menu;
import model.Food;
import model.Drink;

import java.util.*;
import java.io.*;


public class MenuItem {

    ArrayList<Menu> items = new ArrayList<>();
    FileHandle myObj = new FileHandle();

    public void initMenu(){
        items.addAll(loadFood());
        items.addAll(loadDrink());
    }

    ArrayList<Food> loadFood(){
        return myObj.fileReader("MenuFood.txt", line -> {
            String[] parts = line.split(",");
            return new Food(parts[0], Double.parseDouble(parts[1]));
        });
    }

    ArrayList<Drink> loadDrink(){
        return myObj.fileReader("MenuDrink.txt", line -> {
            String[] parts = line.split(",");
            return new Drink(parts[0], Double.parseDouble(parts[1]));
        });
    }

    public Menu findItem(String name){
        for(Menu item: items){
            if(item.getName().equalsIgnoreCase(name)){
                System.out.println("data: " + item);
                return item;
            }
        }
        return null;
    }

    public void displayItem(){
        if(!items.isEmpty()){
            System.out.println("===== MENU =====");
            for(Menu item : items){
                System.out.println("--" + item.getName() + "- $" + item.getPrice() + "--");
            }
        }else{
            System.out.println("Empty Menu");
        }
    }
}
