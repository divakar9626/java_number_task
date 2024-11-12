import java.util.Scanner;

public class Sum_of_Square_digits_11 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0,n;
        while (num!=0){
            n=num%10;
            sum+=n*n;
            num=num/10;

        }
        System.out.println("Sum of root digits: "+ sum);
    }
}
