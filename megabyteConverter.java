package JavaProblems;

public class megabyteConverter {
    public static void main(String[] args) {


        printMegaBytesAndKiloBytes(5000);
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes <0){
            System.out.println("Invalid Value");
        }
        else {

            int toMega = 1024;
            int mega = kiloBytes / toMega;
            int remainder = kiloBytes % toMega;
            System.out.println(kiloBytes + "KB = " + mega + "MB and " + remainder + "KB");


        }



    }
}
