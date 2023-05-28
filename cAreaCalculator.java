/**
 * Write a method named area with one double parameter named radius.
 *
 * The method needs to return a double value that represents the area of a circle.
 *
 * If the parameter radius is negative then return -1.0 to represent an invalid value.
 *
 * Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
 *
 * The method needs to return an area of a rectangle.
 *
 * If either or both parameters is/are a negative return -1.0 to indicate an invalid value. **/

package JavaProblems;

public class cAreaCalculator {

    public static void main(String[] args) {

        System.out.println("The area of a circle is " + area(-5));

        System.out.println("The area of the rectangle is "+ area(5,4));

    }

    public static double area(double radius){

        if(radius <0){
            return -1;
        }
        else {

            double circleRad = (Math.pow(radius,2))* Math.PI;
            return circleRad;

        }

    }

    public static double area(double x, double y){
        //x and y represents the sides of a rectangle.

        if(x<0 || y< 0){
            return -1;
        }
        else{
            return x*y;
        }


    }
}
