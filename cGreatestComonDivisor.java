package JavaProblems;

public class cGreatestComonDivisor {

    /*
    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.

If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).

The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
     */

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10) {

            return -1;
        }
        int HCD = 1;

        for(int i =1; i<= first; i++){
                if(first % i ==0 && second % i ==0){
                    HCD =i;//gets all the common divisors
                }
        }

        return HCD;// prints out the last value, which would be the highest






    }
}
