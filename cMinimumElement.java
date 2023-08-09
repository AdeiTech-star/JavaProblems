package JavaProblems;

import java.util.Arrays;
import java.util.Scanner;

public class cMinimumElement
{
  public static void main(String[] args)
  {

    int len = readInteger();
    int[] numbers = readElements(len);

    System.out.println("Number of elements: " + len);
    System.out.println("Array: " + Arrays.toString(numbers));
    System.out.println(findMin(numbers));
  }

  private static int readInteger(){

     Scanner scanner = new Scanner(System.in);
     int len = scanner.nextInt();

     return len;
  }

  private static int[] readElements(int len){

    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[len];
    int i;

    for(i=0; i<arr.length;i++){
      arr[i] = scanner.nextInt();
    }
    return arr;

  }

  private static int findMin(int[] arr){
    int [] newArr = Arrays.copyOf(arr,arr.length);
    Arrays.sort(newArr);
    return newArr[0];
  }
}
