public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        int count = 0;
        for(int i = 0 ; i<n-1;i++){
            if(arr[i]==arr[i+1]) count++;
        }
        return arr.length - count;
    }
}
