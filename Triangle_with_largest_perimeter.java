import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
    public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        int sum = 0;
        Collections.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int a = arr.get(i), b = arr.get(i + 1), c = arr.get(i + 2);
            if (a + b > c) sum = a + b + c;
        }
        return sum;
    }
}
