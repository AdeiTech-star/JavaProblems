package JavaProblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a program using arrays that sorts a list of integers in descending order.
 * Descending order is highest value to lowest.
 * In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
 * Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
 * Implement the following methods:
 * getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
 * printArray accepts an array and prints out the contents of the array. It should be printed in the following format:
 * Element 0 contents 106
 * Element 1 contents 81
 * Element 2 contents 26
 * Element 3 contents 15
 * Element 4 contents 5
 * sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.
 */
public class cSortedArrays
{

  public static void main(String[] args)
  {
    Arrays.toString(printArray(5));

  }

  public static int[] getIntegers(int len){
    Scanner scanner = new Scanner(System.in);
    int [] arr = new int[len];
    int i;

    for(i=0; i< arr.length; i++){
      arr[i] = scanner.nextInt();
    }
    return arr;

  }

  public static int[] sortIntegers(int len){
    int [] originalArray = getIntegers(len);
    Arrays.sort(originalArray);
    int [] sortedArray = originalArray;
    return sortedArray;
  }

  public static int[] printArray (int len){

    int[] sortedArray = sortIntegers(len);
    int [] descendingArr = new int[sortedArray.length];
    int i;
    for(i=0; i<sortedArray.length;i++){
      descendingArr[i] = sortedArray[sortedArray.length-i-1];
      System.out.println("Element "+i+" contents "+ descendingArr[i]);
    }
    return descendingArr;

  }
}
