import java.util.* ;
import java.io.*; 
public class Solution {
	public static void inplaceRotate(int[][] arr, int n) {
		int row = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<row/2;i++){
            for(int j=0;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[row-1-i][j];
                arr[row-1-i][j] = temp; 
            }
        }
	}
}
