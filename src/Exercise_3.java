import java.util.Scanner;
import java.util.*;

public class Exercise_3 {

    public static class Solution{
        public String longestCommonPrefix(String[] strs){
            String prefix = strs[0];
            for(int i = 1; i < strs.length; i++){
                while(strs[i].indexOf(prefix) != 0){
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
                if(prefix == null){
                    return " ";
                }
            }
            return prefix;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        //Declare number array
        int num;
        do{
            System.out.print("Enter amount of array: ");
            num = scanner.nextInt();
            if(num < 0 || num > 20) {System.out.println("Invalid value, the value should from 1 ~ 20");}
        }while(num < 0 || num > 20);

        //Declare value of element
        System.out.print("Enter Scores for each elements ");
        String[] array = new String[num];
        for(int i = 0; i < num; i++){
            System.out.print("\nEnter string for element + " + (i + 1) + "th: ");
            array[i] = scanner.next();
        };

        for(String chars : array){
            if(map == null || !map.containsKey(chars)){
                map.put(chars, 1);
            }else{
                map.compute(chars, (key, val) -> val + 1);
            }
        }
        for (Map.Entry m : map.entrySet()) {
            System.out.println("number of occurrences [" + m.getKey() + ": " + m.getValue() + "]");
        }

        //Lesson 2
        Solution solution = new Solution();
        String[] array_1 = {"flower", "flow", "flight"};
        String[] array_2 = {"dog","racecar","car"};
        String[] array_3 = {"Accountant", "Accounting", "Squish", "Engineer"};
        String[] array_4 = {"Test", "Testing", "Test Engineer", "TesDy"};

        System.out.println("Longest Common Prefix:");
        System.out.println("array_1: " + solution.longestCommonPrefix(array_1));
        System.out.println("array_2: " + solution.longestCommonPrefix(array_2));
        System.out.println("array_3: " + solution.longestCommonPrefix(array_3));
        System.out.println("array_4: " + solution.longestCommonPrefix(array_4));

    };

}
