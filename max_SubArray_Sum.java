import java.util.Scanner;
class max_SubArray_Sum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);   
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i = 0; i < n;i++){
           arr[i] = sc.nextInt();
       }
       int res = arr[0];
       int max = arr[0];
       for(int i = 1;i<n;i++){
           max = Math.max(max+arr[i], arr[i]);
           res = Math.max(res,max);
       }
       System.out.println(res);
    }
}
