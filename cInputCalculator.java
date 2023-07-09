package JavaProblems;

import java.util.Scanner;

/**
 * Write a method called inputThenPrintSumAndAverage that does not have any parameters.
 * The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
 * When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
 * XX represents the sum of all entered numbers of type int.
 * YY represents the calculated average of all numbers of type long.
 */

public class cInputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }



    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        double sum=0;
        int count = 0;

        while (true){
            String x = scanner.next();
            try {
                int number = Integer.parseInt(x);
                sum = sum+number;
                count++;

            }
            catch (NumberFormatException nfe){
                break;

            }
        }
        System.out.print("SUM = "+ Math.round(sum));
        System.out.print(" AVG = "+ Math.round(sum/count));


    }

}
