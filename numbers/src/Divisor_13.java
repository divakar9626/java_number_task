import java.util.ArrayList;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Divisor_13 {
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

        for (int i : arr){
            System.out.print(i + ",");
        }
        System.out.println("these are the perfect divisor of " + num);


        System.out.println("number of divisor in a number" + arr.size());


    }
}