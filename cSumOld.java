package JavaProblems;

public class cSumOld {

    public static void main(String[] args) {
//        System.out.println(isOdd(11)?"It is odd":"it is even");
        System.out.println(sumOdd(100,1000));

    }

    public static boolean isOdd(int number){

        if(number < 0){
            return false;
        }
        else if(number % 2 !=0){  //this number is odd
            return true;
        }
        else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int sum = 0;

        if((start<0 || end <0) || end< start){
            return -1;
        }
      else {

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }

            }
        }


        return sum;
    }
}
