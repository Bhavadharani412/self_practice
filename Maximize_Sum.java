import java.util.* ;
import java.io.*; 
public class Solution {
    public static int calculateMaximisedSum(int[] arr1, int[] arr2, int n) {
        int arr[][] = new int[n][2];
        arr[0][0] = Math.abs(arr1[0]-arr2[0]);
        arr[0][1] = Math.abs(arr1[0]-arr2[0]);
        for(int i=1; i<n; i++){
            arr[i][0] = Math.abs(arr1[i]-arr2[i])+Math.max(arr[i-1][0]+Math.abs(arr1[i]-arr2[i-1]), arr[i-1][1]+Math.abs(arr1[i]-arr1[i-1]));
            arr[i][1] = Math.abs(arr1[i]-arr2[i])+Math.max(arr[i-1][0]+Math.abs(arr2[i]-arr2[i-1]), arr[i-1][1]+Math.abs(arr2[i]-arr1[i-1]));
        }
        return Math.max(arr[n-1][0], arr[n-1][1]);
    }
}
