public class Solution {
    public static int nthTermOfGP(int N, int A, int R) {
        int mod = 1000000007;
        long ans = (A * pow(R, N - 1, mod)) % mod;
        return (int) ans;
    }
    public static long pow(int R, int N, int mod) {    
        if(N == 0){
            return 1;
        }
        long temp = pow(R, N / 2, mod) % mod;
        if(N % 2 == 0) {
            return (temp * temp) % mod;
        }
        else {
            return (((temp * temp) % mod) * R) % mod;
        }   
    }
} 
