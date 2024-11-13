import java.util.Scanner;

public class Sum_of_Digits_odd_even_19 {

   public static void method(int num){
        int odd=0,even=0,sum=0,n;
        while (num!=0){
            n=num%10;
            sum+=n;
            if(n%2==0){
                even+=n;
            }
            else{
                odd+=n;
            }
           num=num/10;

        }

       System.out.println("the addition of add numbers: " + odd);
       System.out.println("the addition of even number: " + even);
       System.out.println("the addition of all number: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        method(num);
    }

}
