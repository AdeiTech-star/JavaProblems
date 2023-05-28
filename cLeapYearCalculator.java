/**
 * Write a method isLeapYear with a parameter of type int named year.
 * <p>
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * <p>
 * If the parameter is not in that range return false.
 * <p>
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
 * <p>
 * To determine whether a year is a leap year, follow these steps:
 * 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
 * 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
 * 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
 * 4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
 * 5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
 **/


package JavaProblems;

public class cLeapYearCalculator {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {

        if ((year < 1) || (year > 9999)) {
            return false;
        }

        if ((year >= 1) || (year <= 9999)) {

            if (year % 4 == 0) { //if this condition is true, test if year  is evenly divisible by 100, else return false
                if (year % 100 == 0) { //if this condition is true, test if the year is evenly divisible by 400, else,i.e, it's not divisible by 100, return true
                    if (year % 400 == 0) { //if this condition is true, then the year is a leap year, else, its not
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

}


