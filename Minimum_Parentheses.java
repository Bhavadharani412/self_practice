import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minimumParentheses(String pattern) {
		int balance = 0;
		int result = 0;
		for(int i = 0;i<pattern.length();i++){
			balance+=pattern.charAt(i)=='('?1:-1;
			if(balance==-1){
				result+=1;
				balance+=1;
			}
		}
		return balance+result;
	}
}
