public class speedConveter {
    public static void main(String[] args) {
        printConversion(1.5);

    }
    // write your code here

    public static long toMilesPerHour(double kilometersPerHour) {
        //this method needs to return the rounded value of the calculation of type long
        if(kilometersPerHour<0){
            return -1;
        }
        else{
            return(Math.round(kilometersPerHour/1.609));
        }


    }

    //here we are calculating miles per hour
    public static void printConversion(double kilometersPerHour){
        //this is the conversion process, take a kilo and convert it to miles

        if(kilometersPerHour <0){
            System.out.println("Invalid Value");
        }
        else {
            int miles =(int) (Math.round(kilometersPerHour/1.609));
            System.out.println(kilometersPerHour +" km/h = "+ miles+ " mi/h" );
        }

    }
}
