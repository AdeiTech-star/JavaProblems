package JavaProblems;

public class cLastDigitChecker {

    /*
    TODO:Write a method named hasSameLastDigit with three parameters of type int.

     Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.

      The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

     */

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(777,771,77));
        System.out.println(isValid(13));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if(num1<10||num2<10|| num3<10||num1>1000||num2>1000|| num3>1000){
            return false;
        }

        while(num1 !=0){
            int rem1 = num1% 10;
            int rem2 = num2% 10;
            int rem3 = num3% 10;

            if(rem1 == rem2|| rem1 == rem3|| rem2 == rem3){
                return true;
            }
            else {
                return false;
            }

        }
        return true;

    }

    /*
    Write another method named isValid with one parameter of type int.

The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

EXAMPLE INPUT/OUTPUT

isValid(10); → should return true since 10 is within the range of 10-1000

isValid(468); → should return true since 468 is within the range of 10-1000

isValid(1051); → should return false since 1051 is not within the range of 10-1000
     */

    public static boolean isValid(int val1){

        if(val1 < 10 || val1 > 1000){
            return false;
        }
        else{
            return true;
        }
    }
}
