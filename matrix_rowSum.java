import java.util.Scanner;
class matrix_rowSum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);   
       int r = sc.nextInt();
       int c = sc.nextInt();
       int sum = 0;
       int[][] mat = new int[r][c];
       for(int i = 0; i < r;i++){
           for(int j = 0;j<c;j++){
              mat[i][j] = sc.nextInt(); 
           }
       }
       for(int i = 0; i < r;i++){
           for(int j = 0;j<c;j++){
              sum += mat[i][j];
           }
           System.out.println(sum);
           sum = 0;
       }
    }
}
