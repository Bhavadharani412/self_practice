import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossible(int[] arr, int n) {
		int count = 0;
		for(int i=0;i<n-1;i++){
			if(arr[i]<=arr[i+1]){
				continue;
			}
			if(count==1) return false;
			if(i==0 || arr[i+1] >= arr[i-1]){
				arr[i]=arr[i+1];
			}
			else{
				arr[i+1] = arr[i];
			}
			count = 1;
		}
		return true;
	}
}
