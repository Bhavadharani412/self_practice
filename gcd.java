import java.util.Scanner;
import java.math.BigInteger;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hcf_loop = gcd(a,b);
		int euclid = gcd_Euclidean(a,b);
		System.out.println("gcd using loop method : "+hcf_loop);
		System.out.println("Time complexity : O(min(a, b))\nSpace complexity : O(1)");
		System.out.println("gcd using euclid method : "+euclid);
		System.out.println("Time complexity : O(log(min(a,b)))");
		System.out.println("Space complexity (Auxiliary Space) :O(log(min(a,b))");
		int builtin = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
		System.out.println("gcd using builtin : "+builtin);
		System.out.println("Time complexity : O(log(min(a, b)))");
		System.out.println("Space complexity : O(1)");
		int loop_euclid = gcd_Euclidean_iterative(a,b);
		System.out.println("gcd using loop with implementation of euclid : "+loop_euclid);
		System.out.println("Time complexity : O(log(min(a, b)))");
		System.out.println("Space complexity : O(1)");
		
	}
	static int gcd(int a, int b){
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
	}
    static int gcd_Euclidean(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    static int gcd_Euclidean_iterative(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}
