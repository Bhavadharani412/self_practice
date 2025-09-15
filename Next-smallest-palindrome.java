import java.util.* ;
import java.io.*; 
public class Solution {
	public static String nextLargestPalindrome(String number, int length) {
		int []nums = new int[number.length()];
		for(int i=0;i<number.length();i++){
			nums[i] = number.charAt(i)-'0';
		}
		int n = nums.length;
		int i,j,carry,solved =0;
		for(i=(n+1)/2;i<n;i++){
			if(nums[i]<nums[n-i-1]){
				nums[i] = nums[n-i-1];
				for(j= i+1;j<n;j++){
					nums[j] = nums[n-j-1];
				}
				solved = 1;
				break;
			}
			else if(nums[i]>nums[n-i-1]){
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		if(solved == 1){
			for(i=0;i<n;i++){
				sb.append(nums[i]);
			}
			return sb.toString();
		}
		carry = 1;
		for(i=(n-1)/2;i>=0;i--){
			if(nums[i]+carry==10){
				nums[i] =0;
				carry = 1;
			}
			else{
				nums[i]++;
				carry = 0;
				break;
			}
		}
		if(carry == 1){
			sb.append(1);
		}
		for(i=0;i<n;i++){
			sb.append(nums[i]);
		}
		if(carry == 1){
			n++;
		}
		for(i=(n+1)/2;i<n;i++){
			sb.setCharAt(i, sb.charAt(n-i-1));
		}
		return sb.toString();
	}
}
