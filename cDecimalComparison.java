/**
 Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

 The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.**/

package JavaProblems;

public class cDecimalComparison {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

    }

    //there are multiple approaches to solving this question, I just stuck with the most feasible one. Though I just wanted to play around with the strings

//    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
//
//        String decimalsNum1 = String.valueOf(num1);
//        String decimalsNum2 = String.valueOf(num2);
//
//
//        if((decimalsNum1.length()) < 4){
//            decimalsNum1 += "00";
//        }
//        if((decimalsNum2.length()) < 4){
//            decimalsNum2 += "00";
//        }
//        String validDecimals1 = decimalsNum1.substring(0,5);
//        String validDecimals2 = decimalsNum2.substring(0,5);
//
//
//
//        if(validDecimals1.equals(validDecimals2)){
//            return true;
//        }
//        else{
//            return false;
//        }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

        int num1 = (int)(number1 * 1000);
        int num2 = (int)(number2 * 1000);

        int difference = num1 - num2;
        if(difference ==0){
            return true;
        }
        else {
            return false;
        }





    }


}
