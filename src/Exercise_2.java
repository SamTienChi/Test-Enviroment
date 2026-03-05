import java.lang.reflect.Type;
import java.util.Scanner;


public class Exercise_2 {

    public static void Display(double[] array){
        System.out.print("\nArray: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declare number array
        int num;
        do{
            System.out.print("Enter amount of array: ");
            num = scanner.nextInt();
            if(num < 0 || num > 20) {System.out.println("Invalid value, the value should from 1 ~ 20");}
        }while(num < 0 || num > 20);


        //Declare value of element
        System.out.println("Enter Scores for each elements ");
        double[] scores = new double[num];
        double scoreValue;
        for(int i = 0; i < num; i++){
            do{
                System.out.print("Scores for element [" + (i+1) + "]th : ");
                scoreValue = scanner.nextDouble();
                if(scoreValue <= 10 && scoreValue > 0) {
                    scores[i] = scoreValue;
                }else{
                    System.out.println("Invalid scores , must be from 0 ~ 10!");
                };
            }while(scoreValue > 10 || scoreValue < 0);
        };

        //Average
        double sumAverage = 0;
        for(double score : scores){
            sumAverage += score;
        }
        sumAverage = sumAverage / num;
        System.out.print("\nThe Average scores: " + sumAverage);

        //highest  value
        if(scores.length < 2){
            System.out.print("\nDisplay highest  scores: " + scores[0]);
        }else{
            double largeNum = scores[0];
            for(double largeScored : scores){
                if(largeScored > largeNum){
                    largeNum = largeScored;
                }
            }
            System.out.print("\nHighest Value : " + largeNum);
        }

        //lowest value
        if(scores.length < 2){
            System.out.println("\nDisplay lowest list: " + scores[0]);
        }else{
            double lowNum = scores[0];
            for(double lowScored : scores){
                if(lowScored < lowNum){
                    lowNum = lowScored;
                }
            }
            System.out.println("\nLowest value: " + lowNum);
        }

        //Sorted list array
        if(scores.length < 2){
            System.out.println("Display sorted list: " + scores[0]);
        }else{
            double temp;
            for(int i = 0; i < scores.length; i++){
                for(int j = i+1 ; j < scores.length; j++){
                    if(scores[i] > scores[j]){
                       temp = scores[j];
                       scores[j] = scores[i];
                       scores[i] = temp;
                    }
                }
            }
            Display(scores);
        }

    }
}
