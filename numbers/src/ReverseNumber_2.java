import java.util.Scanner;

public class ReverseNumber_2 {

    static int rev(int num){
        int sum=0,n;
        while (num>0){

            n=num%10;
            sum=sum*10+n;
            num=num/10;

        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int n = SC.nextInt();
        System.out.println(rev(n));
        SC.close();
    }
}
