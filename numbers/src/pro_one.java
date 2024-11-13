import java.util.Arrays;

public class pro_one {
    public static void main(String[] args) {
        int arr[] = {20, 0, 8, 0, 6,0,9};
        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++){
                if (arr[j] ==0 ) {
                    if(j!=arr.length-1){
                        int a = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=a;
                    }
            }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}