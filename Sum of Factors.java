import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution{
    public static ArrayList<Integer> sumOfFactors(ArrayList<Integer> arr){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<arr.size();i++){
            int num = arr.get(i);
            int sum = 0;
            for(int j=1; j<=Math.sqrt(num);j++){
                if(num %j==0){
                    sum+= j;
                    if(j!= num/j){
                        sum+= num/j;
                    }
                }
            }
            al.add(sum);
        }
        return al;
    }
}
