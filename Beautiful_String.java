public class Solution {
    public static int makeBeautiful(String str) {
        int n = str.length();
        int changesPattern1 = 0;  
        int changesPattern2 = 0;  
        for (int i = 0; i < n; i++) {
            char expectedCharPattern1 = (i % 2 == 0) ? '0' : '1'; 
            char expectedCharPattern2 = (i % 2 == 0) ? '1' : '0'; 
            if (str.charAt(i) != expectedCharPattern1) {
                changesPattern1++;  
            }
            if (str.charAt(i) != expectedCharPattern2) {
                changesPattern2++;  
            }
        }
        return Math.min(changesPattern1, changesPattern2);
    }
}
