import java.io.*;
import java.util.* ;
public class Solution {
    public static int modularExponentiation(long x, long n, long m) {
        // Write your code here.
        long ans = 1;
        long pow = n;
        while(pow>0){
            if(pow%2==0){
                x = ((x)*(x))%m;
                pow = pow/2;
            }else{
                ans = (ans*(x))%m;
                pow = pow-1;
            }
        }
        return (int)ans;        
    }
}
