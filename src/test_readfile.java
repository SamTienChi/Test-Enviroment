import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

public class test_readfile {
    public static Boolean createFile(String fileName){
        try{
            File myObj = new File(fileName);
            if(myObj.createNewFile()){
                return true;
            }else{
                return false;
            }
        }catch(IOException e) {
            System.out.print("An error occured: ");
            e.printStackTrace();
        }
        return false;
    }

    public static void writeFile(String content, String fileName){
        try{
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        };
    }

    public static void readFile(String fileName){
        File myObj = new File(fileName);
        try(Scanner myReader = new Scanner(myObj)){
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println("Reading data: " + data);
            }
        }catch (FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        };
    }

    public static void AppendFile(String fileName){
        File myObj = new File(fileName);
        try(FileWriter myWriter = new FileWriter(myObj, true)){
            myWriter.write(fileName);
            System.out.println("Successfully append to the file");
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName){
        File myObj = new File(fileName);
        if(myObj.delete()){
            System.out.println("Delete the file " + myObj.getName());
        }else{
            System.out.println("Failed to delete the file");
        };

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please writing content in here: ");
        String content = scanner.nextLine();
        if(createFile("")){
            writeFile(content, "testFile.txt");
            readFile("testFile.txt");
        }else{
            AppendFile("testFile.txt");
            readFile("testFile.txt");
        }

        System.out.println("Choose number: ");
        int n = scanner.nextInt();
        switch(n){
            case 1:
                deleteFile("testFile.txt");
                break;
            case 2:
                break;
        }

    }

}
