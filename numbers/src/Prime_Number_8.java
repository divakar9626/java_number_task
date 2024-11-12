import java.util.Scanner;

public class Prime_Number_8 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        boolean t = true;
        for (int i=2;i<num;i++){
            if((num%i)==0){
                System.out.println("false");
                break;
            }
            else{
                System.out.println("true");
                break;
            }

        }
    }
}
