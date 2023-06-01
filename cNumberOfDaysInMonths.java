/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Examples of input/output:
 * isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
 * isLeapYear(1600); → should return true since 1600 is a leap year
 * isLeapYear(2017); → should return false since 2017 is not a leap year
 * isLeapYear(2000); → should return true because 2000 is a leap year
 * NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.
 * Write another method getDaysInMonth with two parameters month and year.  Both of type int.
 * If parameter month is < 1 or > 12 return -1.
 * If parameter year is < 1 or > 9999 then return -1.
 * This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
 */

package JavaProblems;

public class cNumberOfDaysInMonths {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));

    }


    // write your code here

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 10:
                case 12:
                case 8:
                    return 31;

                case 2:
                    return 29;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;


                default:
                    System.out.println();


            }

        } else {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;


                case 2:
                    return 28;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;


                default:
                    return -1;

            }
        }
        return month;

    }


}


