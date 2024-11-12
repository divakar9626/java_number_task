import java.util.Scanner;

public class Sum_of_natural_number_10 {

    public static void main(String[] args) {
        System.out.println("enter a  number");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("sum of product of numbers:  " + sum);

    }
}
