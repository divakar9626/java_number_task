import java.util.Scanner;

public class Palindrome_number_4 {

   public static int reverse(int num){
       int rev=0,n;
        while (num!=0){

            n=num%10;
            rev=rev*10+n;
            num=num/10;

        }
    return rev;
    }



    public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = reverse(num);
        if(num==n){
            System.out.println("it is palindrome");
        }

        else{
            System.out.println("it is not palindrome");
        }

    }
}
