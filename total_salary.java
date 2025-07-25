import java.util.*;
public class Solution {
    public static int totalSalary(int basic, char grade) {
        double hra = 0.20 * basic;
        double da = 0.50 * basic;
        double pf = 0.11 * basic;
        int allowance;
        if (grade == 'A') {
            allowance = 1700;
        } else if (grade == 'B') {
            allowance = 1500;
        } else {
            allowance = 1300;
        }
        double total = basic + hra + da + allowance - pf;
        return (int)Math.round(total);
    }
}
