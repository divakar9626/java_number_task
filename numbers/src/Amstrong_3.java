import java.util.Scanner;



public class Amstrong_3 {
    public static int fun(int num) {
        int sum = 0, n;

        String num_str = String.valueOf(num);

        int multiple = Integer.valueOf(num_str.length());
        while (num != 0) {
            n = num % 10;
            sum += Math.pow(n, multiple);
            num = num / 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ams = fun(num);
//        System.out.println(ams);

        if (num == ams) {
            System.out.println("true");

        }
        else {
            System.out.println("false");
        }

    }

}
