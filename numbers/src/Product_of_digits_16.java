import java.util.Scanner;

public class Product_of_digits_16 {




        public   static int sum(int num){
            int s=1,n;
            while(num!=0){
                n=num%10;
                s*=n;
                num=num/10;
            }
            return s;
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int num = sc.nextInt();
            System.out.println(sum(num));


        }
    }


