public class Solution {
    public static boolean isPowerOfTwo(int n) {
        // Write your code here.
        for(int i=2;i<=n;i*=2){
            if(i==n) return true;
        }
        return false;
    }
}
