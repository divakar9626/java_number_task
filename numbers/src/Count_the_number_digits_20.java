import java.util.Scanner;

public class Count_the_number_digits_20 {
    public static int sum(int num) {
        int s = 0, n ,c=0;
        while (num != 0) {
//            n = num % 10;
            num = num / 10;
            c += 1;
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
