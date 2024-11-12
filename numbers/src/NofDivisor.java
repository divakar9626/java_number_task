import java.util.ArrayList;
import java.util.Scanner;

public class NofDivisor {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("enter the number find the  divisor of a given number");
        System.out.println("*********");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num ; i++) {


            if ((num%i)==0){

                arr.add(i);


            }

        }


        System.out.println("number of divisor in a number" + arr.size());


    }

    }

