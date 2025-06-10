import java.util.* ;
import java.io.*; 
public class Solution {
	public static int firstMissing(int[] arr, int n) {	
		HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }   
        int missingpositive = 1;
        while (missingpositive <= arr[n-1]){ 
			if (!map.containsKey(missingpositive))
            { return missingpositive; }
             missingpositive++;
        }
        return missingpositive;	
	}
}
