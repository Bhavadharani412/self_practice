import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
		 int rows = mat.size();
        int cols = mat.get(0).size();
        int count = 0;
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                if(mat.get(row).get(col)==0){
                    if(col>0 && (mat.get(row).get(col-1)==1) ) count++;
                    if(row>0 && (mat.get(row-1).get(col)==1) ) count++;
                    if(col<cols-1 && mat.get(row).get(col+1)==1) count++;
                    if(row<rows-1 && mat.get(row+1).get(col)==1 ) count++;
                }
            }
        }
        return count;
	}
}
