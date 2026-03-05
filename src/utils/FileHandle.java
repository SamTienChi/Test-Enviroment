package utils;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.function.Function;


public class FileHandle {

    // Create file
    public void fileCreate(String name){
        try{
            File myObj = new File(name);
            if(myObj.createNewFile()){
                System.out.println("Successfully create file");
            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    // Check file
    public boolean fileCheck(String name){
        try{
            File myObj = new File(name);
            if(myObj.exists()){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    // Write into file
    public void fileWriter(String content, String fileName){
        try{
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(fileName));
            myWriter.write(content);
            myWriter.close();
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public void fileAppendWriter(String content, String fileName){
        File myObj = new File(fileName);
        try(BufferedWriter myWriter = new BufferedWriter(new FileWriter(myObj, true))){
            myWriter.write(content);
            myWriter.newLine(); // Break line
            System.out.println("Successfully add the new item: " + content);
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    // Delete file
    public void fileDelete(String name) throws Exception {
        try{
            File myObj = new File(name);
            if(myObj.delete()){
                System.out.println("Successfully delele file");
            }else{
                System.out.println("Failed to delete file");
            }
        }catch(Exception e){
            System.out.println("An error occurred");
            throw new RuntimeException();
        }
    }

    // Read file
    public <T> ArrayList <T> fileReader(String name, Function<String, T> parser){
        ArrayList<T> list = new ArrayList<>();
        if(fileCheck(name)){
            File myObj = new File(name);
            try(Scanner myReader = new Scanner(myObj)) {
                while(myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    list.add(parser.apply(data));
                }
            }catch (IOException e){
                System.out.println("An error occurred");
                e.printStackTrace();
            }

        }else{
            System.out.println("File does not exist");
        }
        return list;
    }

    public void fileReaderMenu(String name){
        if(fileCheck(name)){
            File myObj = new File(name);
            try(Scanner myReader = new Scanner(myObj)) {
                while(myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println("Data: " + data);
                }
            }catch (IOException e){
                System.out.println("An error occurred");
                e.printStackTrace();
            }

        }else{
            System.out.println("File does not exist");
        }
    }
}
