import java.util.Scanner;
class Matrix_Multiplication {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of rows in matrix A: ");
       int m1 = sc.nextInt();
       System.out.println("Enter the no of columns in matrix A: ");
       int n1 = sc.nextInt();
       System.out.println("Enter the no of rows in matrix B: ");
       int m2 = sc.nextInt();
       System.out.println("Enter the no of columns in matrix B: ");
       int n2 = sc.nextInt();
       if(n1 != m2){
           System.out.println("We can't perform matrix multiplication");
           return; 
       }
       int[][] matrixA = new int[m1][n1];
       int[][] matrixB = new int[m2][n2];
       int[][] matrixC = new int[m1][n2];
       System.out.println("Enter the values in matrix A: ");
       for(int i = 0;i < m1;i++){
           for(int j = 0;j < n1;j++)
              matrixA[i][j] = sc.nextInt();
       }
       
       System.out.println("Enter the values in matrix B: ");
       for(int i = 0;i < m2;i++){
           for(int j = 0;j < n2;j++)
              matrixB[i][j] = sc.nextInt();
       }
       
       for(int i = 0;i < m1;i++){
           for(int j = 0;j < n2;j++){
               for(int k = 0;k < n1; k++){
                   matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
               }
           }
       }
       System.out.println("The resultant matrix, matrix A* matrix B : ");
       for(int i = 0;i < m1;i++){
           for(int j = 0;j < n2;j++){
              System.out.print(matrixC[i][j]+" ");
           }
           System.out.println();
       }
    }
}
