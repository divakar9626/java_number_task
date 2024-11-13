public class pro_two {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,4,3,0};
        int target = 7;

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
//                int a =arr[i]+arr[j];
                if(arr[i]+arr[j]==target){
                    System.out.println(i +" "+ j +"\n");

                }
            }
        }
    }
}
