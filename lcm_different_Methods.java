import java.util.Scanner;
import java.math.BigInteger;
public class lcm_different_Methods{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lcm_loop = lcm(a,b);
		int euclid = lcm_Euclidean(a,b);
		System.out.println("lcm using loop method : "+lcm_loop);
		System.out.println("Time complexity : O(min(a, b))\nSpace complexity : O(1)");
		System.out.println("lcm using euclid method : "+euclid);
		System.out.println("Time complexity : O(log(min(a,b)))");
		System.out.println("Space complexity (Auxiliary Space) :O(log(min(a,b))");
	}
	static int lcm(int a, int b){
        int g = Math.max(a, b); 
        int s = Math.min(a, b);
        for (int i = g; i <= a * b; i += g) {
            if (i % s == 0)
                return i;
        }
        return a * b; 
    }
    static int gcd_Euclidean(int a, int b) {
        return (b == 0) ? a : gcd_Euclidean(b, a % b);
    }
    static int lcm_Euclidean(int a, int b) {
        return (a / gcd_Euclidean(a, b)) * b;
    }
}
