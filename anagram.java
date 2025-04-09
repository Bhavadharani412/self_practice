import java.util.*;
class anagram{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        char[] charToArray1 = str1.toCharArray();
        String str2 = scan.nextLine();
        char[] charToArray2 = str2.toCharArray();
        Arrays.sort(charToArray1);
        Arrays.sort(charToArray2);
        boolean result = Arrays.equals(charToArray1, charToArray2);
        if(result) {
            System.out.println(str1 + " and " + str2 + " are anagram.");
          }
          else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
        scan.close();
    }
}
