import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0,n;
        while (num!=0){
            n = num%10;
            sum+=n;
            num=num/10;
        }

        System.out.println("the sum of digits of a number: "+sum);
    }
}
