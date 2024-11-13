import java.util.Scanner;

public class Sum_of_prime_21 {

 static boolean  prime(int num){

      for (int i=2;i<num;i++){
          if(num%i==0)
              return false;

      }

return true;

  }

    public static int method(int num1, int num2){

        int sum=0;

        for(int i=num1;i<num2;i++){

            if(prime(i)){
                sum+=i;
            }



        }

return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter a number start value");
        Scanner sc =new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("enter a number end value");
        int num2= sc.nextInt();

        System.out.println( method(num1,num2));

    }
}
