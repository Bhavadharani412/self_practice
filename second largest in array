import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		
		int largest=arr[0];
		int second=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>largest){
				second=largest;
			    largest=arr[i];
			}
			else if(arr[i]>second && arr[i]!=largest){
				second=arr[i];
			}
		}
		if(second==Integer.MIN_VALUE){
			return -1;
		}
		return second;
	}
}
