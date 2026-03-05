package utils;

import utils.*;
import java.util.Scanner;

public class UpdateFile {
    public void updateMenu() throws Exception{
        Scanner scanner = new Scanner(System.in);
        int num;
        FileHandle myObj = new FileHandle();
        do{
            System.out.println("Menu Update File");
            System.out.println("1. Create new file");
            System.out.println("2. Add more item into file");
            System.out.println("3. Delete the file");
            System.out.println("4. Check menu");
            System.out.println("5. Exit");
            System.out.print("+Choose your type: ");
            num = scanner.nextInt();
            switch(num){
                case 1:
                    System.out.print("Enter the name file: ");
                    String nameFile = scanner.next() + ".txt";
                    myObj.fileCreate(nameFile);
                    break;
                case 2:
                    System.out.print("Enter the name file to add more item : ");
                    String nameFileUpdate = scanner.next() + ".txt";
                    if(myObj.fileCheck(nameFileUpdate)){
                        System.out.print("Enter the name item: ");
                        String nameItem = scanner.next();
                        System.out.print("Enter the price for item: ");
                        double price = scanner.nextDouble();
                        String data = nameItem + "," + price;
                        myObj.fileAppendWriter(data, nameFileUpdate);
                    }else{
                        System.out.println("File does not exist");
                    }
                    break;
                case 3:
                    System.out.print("Enter the name file to add more item : ");
                    String nameFileDelete = scanner.next() + ".txt";
                    myObj.fileDelete(nameFileDelete);
                    break;
                case 4:
                    System.out.print("Enter the name file to check item: ");
                    String nameFileReader = scanner.next() + ".txt";
                    System.out.println("The list of Menu");
                    myObj.fileReaderMenu(nameFileReader);
                    break;
                default:
                    System.out.println("Exit update file!");
                    break;
            }
        }while(num > 0 && num < 5);
    }
}
