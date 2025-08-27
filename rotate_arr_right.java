import java.util.Scanner;
class rotate_arr_right {
     static void rotateRightArr(int[] arr, int d) {
        int n = arr.length;
        d %= n;
        int[] temp = new int[n];
        for (int i = 0; i < d; i++)
            temp[i] = arr[n - d + i];
        for (int i = 0; i < n - d; i++)
            temp[i + d] = arr[i];
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k (number of Right rotations): ");
        int k = sc.nextInt();
        rotateRightArr(arr, k);
         System.out.println("Right rotations: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
