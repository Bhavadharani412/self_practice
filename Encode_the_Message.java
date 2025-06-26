import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String message) {
		if (message == null || message.isEmpty()) return "";
		StringBuilder result = new StringBuilder();
		int count = 1;
		char[] charArr = message.toCharArray();
		for(int i = 1;i < charArr.length; i++){
			if (charArr[i] == charArr[i-1]) count++;
			else{
				result.append(charArr[i - 1]).append(count);
				count = 1;
			}
		}
		result.append(charArr[charArr.length - 1]).append(count);
		return result.toString();
	}
}
