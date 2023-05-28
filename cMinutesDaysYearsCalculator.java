/**
 * Write a method printYearsAndDays with parameter of type long named minutes.
 *
 * The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
 *
 * If the parameter is less than 0, print text "Invalid Value".
 *
 * Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
 *
 * XX represents the original value minutes.
 * YY represents the calculated years.
 * ZZ represents the calculated days.
 * **/

package JavaProblems;

public class cMinutesDaysYearsCalculator {

    public static void main(String[] args) {

        printYearsAndDays(1051200);

    }

    public static void printYearsAndDays(long minutes){

        int hours = (int)minutes / 60;


       int days = hours/24;
       int years = days / 365;
       int remainingDays = days % 365;



        if(minutes <0){
            System.out.println("Invalid Value");
        }

        else{
            System.out.println(minutes+" min = "+ years+ " y and "+ remainingDays+ " d");
        }

    }
}
