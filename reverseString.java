import java.util.* ;
import java.io.*; 
public class Solution { 
    public static String reverseString(String str) {
        String reversed=new StringBuilder(str).reverse().toString();
        return reversed;
    }
}
