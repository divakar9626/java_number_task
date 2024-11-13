import java.util.Scanner;

public class pro16_number_power_root


{



   public static boolean def(int num){

       if (num == 0)
           return false;
       while (num!=1){
           if(num%2!=0)
               return false;
           num=num/2;
       }
       return true;


    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(def(num));



    }

}
