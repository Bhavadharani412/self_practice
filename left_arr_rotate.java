import java.util.Scanner;
class left_arr_rotate {
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
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
        System.out.print("Enter k (number of rotations): ");
        int k = sc.nextInt();
        rotateArr(arr, k);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
