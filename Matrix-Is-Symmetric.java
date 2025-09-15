import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        int row=matrix.length;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<row;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
