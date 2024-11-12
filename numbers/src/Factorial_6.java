import java.util.Scanner;

public class Factorial_6{
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int mul=1;

        for (int i =1;i<=num;i++){

            mul=mul*i;
        }
        System.out.println(mul);

    }
}
