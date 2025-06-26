import java.util.Scanner;
class Solution {
    static String reverseStringWordWise(String input) {
        int n=input.length();
        if(n<=0){
            return input;
        }
        String reverse="";
        int e=n;
        for(int i=n-1; i>=0; i--){
            if(input.charAt(i)==' '){
            reverse+=input.substring(i+1,e)+' ';
            e=i;
            }
        }
        reverse+=input.substring(0,e);
        return reverse;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
