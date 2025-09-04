import java.util.Scanner;
public class floor_ceil{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int floor = floorDiv(a,b);
		int ceil = ceilDiv(a,b);
		System.out.println("floor : "+floor+"\nceil : "+ceil);
		System.out.println("Time complexity : O(1)\nSpace complexity : O(1)");
	}
	public static int floorDiv(int a, int b) {
        int q = a / b;
        if ((a ^ b) < 0 && a % b != 0) {
            q--;
        }
        return q;
    }
    public static int ceilDiv(int a, int b) {
        int q = a / b;
        if ((a ^ b) > 0 && a % b != 0) {
            q++;
        }
        return q;
    }
}
